package com.fp.order;

/**
 * Created by gremtfp on 2019/9/4 0004 下午 11:25.
 */
public class BuyThread extends Thread {
    BuyThread(){
        super("buy");
    }
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
