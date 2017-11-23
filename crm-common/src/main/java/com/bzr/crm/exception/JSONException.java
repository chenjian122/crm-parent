package com.bzr.crm.exception;

/**
 * 异常JSON格式化
 * @author cj
 * @create 2017-11-22 16:50
 **/
public class JSONException extends Exception{
    private static final long serialVersionUID = 1L;

    public JSONException(String message) {
        super(message);
    }
}
