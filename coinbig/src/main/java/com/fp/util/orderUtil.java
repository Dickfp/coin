package com.fp.util;

import java.util.HashMap;

/**
 * Created by gremtfp on 2019/9/1 0001 上午 10:20.
 */
public class orderUtil {

    /**
     * 查询用户手续费
     * @param order_id
     * @return
     */
    public static String queryOrderFee(String order_id){
        String result = "";
        HashMap map = new HashMap();
        map.put("order_id",order_id);
        result = httpUtil.doPost(paraUtil.buildSignPara(map),"/api/publics/v1/order_fee");
        return result;
    }

    /**
     * 用户订单详情
     * @param order_id
     * @return
     */
    public static String queryOrderInfo(String order_id){
        HashMap map = new HashMap();
        map.put("order_id",order_id);
        return httpUtil.doPost(paraUtil.buildSignPara(map),"/api/publics/v1/order_info");
    }

    /**
     * 批量获取用户订单
     * @param symbol 币对
     * @param size 查询的记录条数,最多查询50条,默认50条
     * @param type 查询多个状态每个状态类型以英文的逗号分隔，例如：type=1,2,3
     *             查询类型 1未成交,2部分成交,3完全成交,4用户撤销,5部分撤回,6成交失败
     * @return
     */
    public static String queryBatchOrderInfos(String symbol,String size,String type){
        HashMap map = new HashMap();
        map.put("symbol",symbol);
        map.put("size",size);
        map.put("type",type);
        return httpUtil.doPost(paraUtil.buildSignPara(map),"/api/publics/v1/orders_info");
    }

    /**
     * 撤销订单
     * @param order_id
     * @return
     */
    public static String cancelOrder(String order_id){
        HashMap map = new HashMap();
        map.put("order_id",order_id);
        return httpUtil.doPost(paraUtil.buildSignPara(map),"/api/publics/v1/cancel_order");
    }

    /**
     * 下单操作
     * @param type 买卖类型: 限价单(buy/sell) 市价单(buy_market/sell_market)
     * @param price 下单价格
     * @param amount 交易数量
     * @param symbol 币对
     * @return
     */
    public static String orderTrade(String type,String price,String amount,String symbol){
        HashMap map = new HashMap();
        map.put("type",type);
        map.put("price",price);
        map.put("amount",amount);
        map.put("symbol",symbol);
        return httpUtil.doPost(paraUtil.buildSignPara(map),"/api/publics/v1/trade");
    }

    public static void main(String[] args) {
        String result =httpUtil.doGet("","/api/publics/v1/getClientIpAndServerTime");
        System.out.println("==="+result);
    }
}
