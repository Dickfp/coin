package com.fp.util;


import org.apache.commons.lang3.StringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;


/**
 * Created by gremtfp on 2019/8/31 0031 下午 8:33.
 */
public class httpUtil {
    private static final  String baseUrl="https://www.coinbig.org";
    public static String doPost(List<NameValuePair> param, String url){
        String fullUrl = baseUrl+url;
        String result = "";
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(fullUrl);
            httpPost.setHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36");
            httpPost.setEntity(new UrlEncodedFormEntity(param, Consts.UTF_8));
            CloseableHttpResponse response = httpClient.execute(httpPost);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                result = EntityUtils.toString(response.getEntity(), Consts.UTF_8);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public static String doGet(String parastr,String url){
        String fullUrl = baseUrl+url+ (StringUtils.isEmpty(parastr) ? "":"?"+parastr);
        String result = "";
        CloseableHttpResponse response = null;
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(fullUrl);
            response = httpClient.execute(httpGet);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                result = EntityUtils.toString(response.getEntity(), Consts.UTF_8);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                response.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        return result;
    }
}
