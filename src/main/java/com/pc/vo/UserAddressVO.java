package com.pc.vo;

import java.util.Date;

/**
 * 
 * @author duke
 * @version 1.0 2018/11/21 
 * 用户地址信息实体
 *
 */
public class UserAddressVO {

	private String UserId;     //用户Id
	private String ItemsId;    //小区ID
	private String MinuteNote; //详细地址
	private Date CreateDate;   //创建时间
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getItemsId() {
		return ItemsId;
	}
	public void setItemsId(String itemsId) {
		ItemsId = itemsId;
	}
	public String getMinuteNote() {
		return MinuteNote;
	}
	public void setMinuteNote(String minuteNote) {
		MinuteNote = minuteNote;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	
}
