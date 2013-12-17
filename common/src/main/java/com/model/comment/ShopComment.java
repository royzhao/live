package com.model.comment;

import java.util.Date;

public class ShopComment {
	int scID;
	int shopID;
	int refGoods;
	int type; //1表示是售前问题
	//			2表示售后评价
	
	String content;
	double score;
	Date createTime;
	public int getScID() {
		return scID;
	}
	public void setScID(int scID) {
		this.scID = scID;
	}
	public int getShopID() {
		return shopID;
	}
	public void setShopID(int shopID) {
		this.shopID = shopID;
	}
	public int getRefGoods() {
		return refGoods;
	}
	public void setRefGoods(int refGoods) {
		this.refGoods = refGoods;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
