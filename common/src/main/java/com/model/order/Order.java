package com.model.order;

import java.util.Date;

public class Order {
	int orderID;
	int goodsID;
	int shopID;
	int dealPrice;
	int num;
	int state; //订单状态，
	//			1：已下单，为支付
	//			2：已下单，已支付
	//			3：撤销订单
	Date startTime;
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getGoodsID() {
		return goodsID;
	}
	public void setGoodsID(int goodsID) {
		this.goodsID = goodsID;
	}
	public int getShopID() {
		return shopID;
	}
	public void setShopID(int shopID) {
		this.shopID = shopID;
	}
	public int getDealPrice() {
		return dealPrice;
	}
	public void setDealPrice(int dealPrice) {
		this.dealPrice = dealPrice;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
	Date createTime;
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	

}
