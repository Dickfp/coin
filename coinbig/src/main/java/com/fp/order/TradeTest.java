package com.fp.order;

import java.util.Date;

/**
 * Created by gremtfp on 2019/9/1 0001 下午 5:44.
 */
public class TradeTest {
    public static boolean flag = true;
    //获取行情
    //获取成交价
    //起两个线程
    public static void main(String[] args) throws Exception{
       /* BaseAcount one = new AcountOne();
        BaseAcount two = new AcountTwo();
        System.out.println(one.getTrade());
        System.out.println(AcountOne.trade);
        System.out.println(two.getTrade());
        one.setTrade("fp");
        System.out.println(one.getTrade());
        System.out.println(AcountOne.trade);*/
        while (true){
            new TradeThread(new AcountOne()).start();
            new TradeThread(new AcountTwo()).start();
            System.out.println(Thread.currentThread().getName()+System.currentTimeMillis());
            Thread.sleep(4000);

        }
    }
}
