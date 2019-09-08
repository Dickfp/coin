package com.fp.order;

/**
 * Created by gremtfp on 2019/9/8 0008 下午 10:17.
 */
public class BaseAcount {
    public String trade = "";
    BaseAcount(){

    }
    BaseAcount(String trade){
        this.trade = trade;
    }
    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }
}
