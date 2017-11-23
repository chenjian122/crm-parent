package com.bzr.crm.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 对象操作工具类
 * Created by cj on 2017/11/16.
 */
public class ObjectUtils extends org.springframework.util.ObjectUtils{

    private static Logger looger = LoggerFactory.getLogger(ObjectUtils.class);

    /**
     * 序列化对象
     * @param object
     * @return
     */
    public static byte[] serialize(Object object) {
        ObjectOutputStream oos = null;
        ByteArrayOutputStream baos = null;
        try {
            if(object != null){
                baos = new ByteArrayOutputStream();
                oos = new ObjectOutputStream(baos);
                oos.writeObject(object);
                return  baos.toByteArray();
            }
        } catch (Exception e) {
            looger.error(e.getMessage());
        }
        return null;
    }

    /**
     * 反序列化对象
     * @param bytes
     * @return
     */
    public static Object unserialize(byte[] bytes) {
        ByteArrayInputStream bais = null;
        try {
            if(bytes != null && bytes.length>0){
                bais = new ByteArrayInputStream(bytes);
                ObjectInputStream ois = new ObjectInputStream(bais);
                return ois.readObject();
            }
        }catch(Exception e){
            looger.error(e.getMessage());
        }
        return null;
    }

}
