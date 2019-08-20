package com.cloud.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}
	
	@Override
	public Object run() {
		RequestContext rc = RequestContext.getCurrentContext();
		HttpServletRequest req = rc.getRequest();
		String token = req.getParameter("token");// 获取请求的参数

        if (StringUtils.isNotBlank(token)) {
        	rc.setSendZuulResponse(true); //对请求进行路由
        	rc.setResponseStatusCode(200);
        	rc.set("isSuccess", true);
            return null;
        } else {
        	rc.setSendZuulResponse(false); //不对其进行路由
        	rc.setResponseStatusCode(400);
        	rc.setResponseBody("token is empty");
        	rc.set("isSuccess", false);
            return null;
        }
	}
}
