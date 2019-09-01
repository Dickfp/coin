package com.fp.util;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * Created by Administrator on 2019/8/28 0028.
 */
public class propertyUtil {

    public static void loadProperties(){
        ResourceBundle resource =  ResourceBundle.getBundle("config");
        Enumeration enumeration = resource.getKeys();
        while (enumeration.hasMoreElements()){
            String key = String.valueOf(enumeration.nextElement());
            cacheUtil.putCache(key,resource.getString(key));
        }
    }
    public static void main(String[] args) {
        ResourceBundle resource =  ResourceBundle.getBundle("config");
        Enumeration enumeration = resource.getKeys();
        while (enumeration.hasMoreElements()){
            String key = String.valueOf(enumeration.nextElement());
            System.out.println(key+":"+resource.getString(key));
        }
    }
}
