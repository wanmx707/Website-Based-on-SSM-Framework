package com.wmx.op.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常处理�?
 * @author 温孟�?
 *
 */
public class CustomExceptionResolver implements HandlerExceptionResolver{
	/**
	 * ex系统抛出的异�?
	 */
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object Handler, Exception ex) {
//		//Handler就是处理器�?�配器要执行Handler对象（只有method�?
//		String message=null;
//		//解析出异常类�?
//		//如果�? 异常类型是系�? 自定义的异常，直接取出异常信息，在错误页面展�?
//		if(ex instanceof CustomException){
//			message=((CustomException)ex).getMessage();
//		}else{
//			//如果�? 异常类型不是系统 自定义的异常，构造一个自定义的异常类型（信息为�?�未知错误�?�）
//			
//		}
		//上边的代码变�?
		CustomException customException=null;
		if(ex instanceof CustomException){
			customException=((CustomException)ex);
		}else{
			customException=new CustomException("未知错误");
		}
		//错误信息
		String messaage=customException.getMessage();
		ModelAndView modelAndView=new ModelAndView();
		//将错误信息传到页�?
		modelAndView.addObject("message", messaage);
		//指向到错误页�?
		modelAndView.setViewName("error");
		return modelAndView;
	}

}
