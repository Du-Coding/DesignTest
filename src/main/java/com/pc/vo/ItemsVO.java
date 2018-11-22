package com.pc.vo;

import java.util.Date;

/**
 * 
 * @author duke
 * @version 1.0 2018/11/21
 * 收费项目实体
 *
 */
public class ItemsVO {

	private String ItemsId;    //项目ID
	private String ItemsName;  //项目名称
	private Double ItemsPrice; //项目收费标准
	private String ItemsNote;  //收费备注
	private Date CreateDate;   //创建时间
	
	public String getItemsId() {
		return ItemsId;
	}
	public void setItemsId(String itemsId) {
		ItemsId = itemsId;
	}
	public String getItemsName() {
		return ItemsName;
	}
	public void setItemsName(String itemsName) {
		ItemsName = itemsName;
	}
	public Double getItemsPrice() {
		return ItemsPrice;
	}
	public void setItemsPrice(Double itemsPrice) {
		ItemsPrice = itemsPrice;
	}
	public String getItemsNote() {
		return ItemsNote;
	}
	public void setItemsNote(String itemsNote) {
		ItemsNote = itemsNote;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	
}
