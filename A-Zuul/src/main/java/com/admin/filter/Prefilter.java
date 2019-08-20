package com.admin.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class Prefilter extends ZuulFilter{
	
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
		String token = req.getParameter("token");//获取请求的参数
		
		if(StringUtils.isNotBlank(token)) {
			rc.setSendZuulResponse(true);
			rc.setResponseStatusCode(200);
			rc.set("isSuccess", true);
			return null;
		}else {
			rc.setSendZuulResponse(false);
			rc.setResponseStatusCode(400);
			rc.setResponseBody("token is empty");
			rc.set("isSuccess", false);
			return null;
		}
	}
	
}
