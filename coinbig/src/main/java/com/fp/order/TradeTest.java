package com.fp.order;

/**
 * Created by gremtfp on 2019/9/1 0001 下午 5:44.
 */
public class TradeTest {
    //获取行情
    //获取成交价
    //起两个线程
    public static void main(String[] args) {
        BuyThread buy = new BuyThread();
        SellThread sell = new SellThread();
        buy.start();
        sell.start();
    }
}
