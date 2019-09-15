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

        System.out.println("==="+acount.name+":"+acount.trade+"="+AcountOne.trade);

            if (acount instanceof AcountOne){
                //System.out.println("one");
                if ("sell".equals(AcountOne.trade)){
                    AcountOne.trade = "buy";
                    AcountTwo.trade = "sell";
                }else if ("buy".equals(AcountOne.trade)){
                    AcountOne.trade = "sell";
                    AcountTwo.trade = "buy";
                }
            }else if (acount instanceof AcountTwo){
               // System.out.println("two");
                if ("sell".equals(AcountTwo.trade)){
                    AcountOne.trade = "buy";
                    AcountTwo.trade = "sell";
                }else if ("buy".equals(AcountTwo.trade)){
                    AcountOne.trade = "sell";
                    AcountTwo.trade = "buy";
                }
            }


    }
}
