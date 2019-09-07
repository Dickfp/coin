package com.fp.order;

/**
 * Created by gremtfp on 2019/9/4 0004 下午 11:25.
 */
public class SellThread extends Thread{
    SellThread(){
        super("sell");
    }
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
