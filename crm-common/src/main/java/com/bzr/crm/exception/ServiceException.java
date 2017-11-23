package com.bzr.crm.exception;

/**
 * 自定义Service异常
 * @author cj
 * @create 2017-11-22 16:52
 **/
public class ServiceException extends Exception{
    private static final long serialVersionUID = 1L;

    public ServiceException(String message) {
        super(message);
    }
    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

}
