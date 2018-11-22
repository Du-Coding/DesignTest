package com.pc.vo;

import java.util.Date;

/**
 * 
 * @author duke
 * @version 1.0 2018/11/21
 * 账单信息实体
 *
 */
public class BillVO {

	private String BillId;    //账单Id
	private String OwnerId;   //户主ID
	private String ItemsId;   //收费项目ID 
	private Double BillPrice; //应缴金额
	private Double RealPrice; //实缴金额
	private Double OwePrice;  //所欠金额
	private String BillNote;  //账单备注
	private String CountId;   //核算员ID
	private Date CreateDate;  //创建时间
	
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
	public Double getRealPrice() {
		return RealPrice;
	}
	public void setRealPrice(Double realPrice) {
		RealPrice = realPrice;
	}
	public Double getOwePrice() {
		return OwePrice;
	}
	public void setOwePrice(Double owePrice) {
		OwePrice = owePrice;
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
	
}
