package com.fp.order;

/**
 * Created by gremtfp on 2019/9/8 0008 下午 7:07.
 */
public class AcountOne extends BaseAcount{
    public final static String apiKey = "";
    public final static String secret = "";
    AcountOne(){
        super("AcountOne",trade);
    }
    public static String trade = "buy";
    /*public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }*/
}
