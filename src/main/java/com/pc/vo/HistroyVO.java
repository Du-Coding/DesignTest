package com.pc.vo;

import java.util.Date;

/**
 * 
 * @author duke
 * @version 1.0 2018/11/21
 * 账单历史信息实体
 *
 */
public class HistroyVO {
	
	private String BillId;    //账单Id
	private String OwnerId;   //户主ID
	private String ItemsId;   //收费项目ID 
	private Double BillPrice; //缴费金额
	private String BillNote;  //账单备注
	private String CountId;   //核算员ID
	private Date CreateDate;  //创建时间
	private Date EndDate;     //结束时间
	
	public String getBillId() {
		return BillId;
	}
	public void setBillId(String billId) {
		BillId = billId;
	}
	public String getOwnerId() {
		return OwnerId;
	}
	public void setOwnerId(String ownerId) {
		OwnerId = ownerId;
	}
	public String getItemsId() {
		return ItemsId;
	}
	public void setItemsId(String itemsId) {
		ItemsId = itemsId;
	}
	public Double getBillPrice() {
		return BillPrice;
	}
	public void setBillPrice(Double billPrice) {
		BillPrice = billPrice;
	}
	public String getBillNote() {
		return BillNote;
	}
	public void setBillNote(String billNote) {
		BillNote = billNote;
	}
	public String getCountId() {
		return CountId;
	}
	public void setCountId(String countId) {
		CountId = countId;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
}
