package com.model.comment;

import java.util.Date;

public class ActivityComment {
	int acID;
	int shopID;
	int refActivity;
	int type; //1表示是售前问题
	//			2表示售后评价
	
	String content;
	
	Date createTime;
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public int getAcID() {
		return acID;
	}

	public void setAcID(int acID) {
		this.acID = acID;
	}
	public int getShopID() {
		return shopID;
	}
	public void setShopID(int shopID) {
		this.shopID = shopID;
	}
	public int getRefActivity() {
		return refActivity;
	}
	public void setRefActivity(int refActivity) {
		this.refActivity = refActivity;
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
	double score;

}
