package com.fp.util;

import java.util.HashMap;

/**
 * @author gremtfp
 * Created by Administrator on 2019/8/31 0031.
 */
public class cacheUtil {
    //TODO 优化
    private static HashMap<String,String> map = new HashMap();

    public static void putCache(String key,String value){
        map.put(key,value);
    }
    public static String getCache(String key){
        String value = map.get(key);
        return value;
    }

}
