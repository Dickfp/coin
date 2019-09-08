package com.fp.order;

/**
 * Created by gremtfp on 2019/9/8 0008 下午 7:07.
 */
public class AcountTwo extends BaseAcount{
    public final static String apiKey = "";
    public final static String secret = "";
    public String trade = "sell";
    AcountTwo(){
        super("sell");
    }
    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

}
