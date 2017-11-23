package com.bzs.crm.config;

import javax.servlet.http.HttpServletRequest;

import com.bzr.crm.exception.ErrorInfo;
import com.bzr.crm.exception.JSONException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常处理类
 * @author         cj
 * @version        V1.0  
 * @Date           2017年7月19日 下午3:50:53
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	public static final String DEFAULT_ERROR_VIEW = "error";
	
	/**
	 * 统一异常处理
	 * @param:        @param request
	 * @param:        @param e
	 * @return:       ModelAndView    
	 * @author        cj
	 * @Date          2017年7月19日 下午3:52:29
	 */
	@ExceptionHandler(value = Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest request,Exception e){
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception",e);
		mav.addObject("url", request.getRequestURI());
		mav.setViewName(DEFAULT_ERROR_VIEW);
		return mav;
	}
	
	/**
	 * 返回JSON格式
	 * @param:        @param req
	 * @param:        @param e
	 * @param:        @throws Exception    
	 * @return:       ErrorInfo<String>    
	 * @author        cj
	 * @Date          2017年7月19日 下午3:55:27
	 */
	@ExceptionHandler(value = JSONException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, JSONException e) throws Exception {
        ErrorInfo<String> r = new ErrorInfo<String>();
        r.setMessage(e.getMessage());
        r.setCode(ErrorInfo.ERROR);
        r.setUrl(req.getRequestURL().toString());
        return r;
    }
}
