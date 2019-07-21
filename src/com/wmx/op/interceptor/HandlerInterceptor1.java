package com.wmx.op.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 测试拦截�?1
 * @author 温孟�?
 *
 */
public class HandlerInterceptor1 implements HandlerInterceptor{

	//在进入Handler方法之前执行
	//可用于身份认证�?�身份授�?
	//比如身份认证，如果认证�?�过表示当前用户没有登陆，需要此方法拦截不再向下执行
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response,Object handler) throws Exception {
		System.out.println("HandlerInterceptor1。�?��?��?�preHandle");
		//return false表示拦截，不向下执行
		//return true表示放行
		return true;
	}
	
	//进入Handler方法之后，发回modelAndView之前执行
	//应用场景从modelAndView出发：将公用的模型数�?(比如菜单导航)在这里传到视图，也可以在这里统一指定视图
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response,Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("HandlerInterceptor1。�?��?��?�postHandle");

	}
	
	//执行Handler完成执行此方�?
	//应用场景：统�?异常处理，统�?日志处理
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("HandlerInterceptor1。�?��?��?�afterCompletion");

	}
}
