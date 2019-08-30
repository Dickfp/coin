package com.fp.util;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * Created by Administrator on 2019/8/28 0028.
 */
public class propertyUtil {

    public static void loadProperties(){
        ResourceBundle resource =  ResourceBundle.getBundle("config");
        resource.getKeys();
    }
    public static void main(String[] args) {
        ResourceBundle resource =  ResourceBundle.getBundle("config");
        //String val = resource.getString("apiKey");
        Enumeration enumeration = resource.getKeys();
        if (enumeration.hasMoreElements()){
            System.out.println("==="+enumeration.nextElement());
        }

       // System.out.println("---val:"+ val);
    }
}
