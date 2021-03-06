package com.bzr.crm.utils;

/**
 * 获取应用的系统路径
 * Created by cj on 2017/11/21.
 */
public class SystemPath {

    public static String getSystemPath(){
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String temp = path.replaceFirst("file:/","").replaceFirst("WEB-INF/classes/","");
        String separator = System.getProperty("file.separator");
        String resultPath = temp.replaceAll("/",separator + separator);
        return resultPath;
    }

    public static String getClassPath(){
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String temp = path.replaceFirst("file:/","");
        String separator = System.getProperty("file.separator");
        String resultPath = temp.replaceAll("/",separator + separator);
        return resultPath;
    }

}
