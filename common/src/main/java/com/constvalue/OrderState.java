package com.constvalue;

public class OrderState {
	public static int ORDER_UNCHECK = 1;	//已下订单，未支付
	public static int ORDER_CHECKED = 2;	//订单已支付
	public static int ORDER_CANCEL = 3;		//订单撤销
	public static int ORDER_SEND = 4;		//卖家已处理
	public static int ORDER_COMPLITE = 5;	//订单已完成

}
