package com.fp.order;

/**
 * Created by gremtfp on 2019/9/8 0008 下午 10:13.
 */
public class TradeThread extends Thread{
    public BaseAcount acount;
    TradeThread(BaseAcount acount){
        this.acount = acount;
    }
    @Override
    public void run() {
        System.out.println("==="+acount.getTrade());
    }
}
