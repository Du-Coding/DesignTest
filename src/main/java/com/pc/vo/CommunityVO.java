package com.pc.vo;

import java.util.Date;

/**
 * 
 * @author duke
 * @version 1.0 2018/11/21
 * 小区实体类
 *
 */
public class CommunityVO {

	private String CommId;      //小区Id
	private String CommName;    //小区名称
	private String CommAddress; //小区地址
	private Date CreateDate;    //创建时间
	
	public String getCommId() {
		return CommId;
	}
	public void setCommId(String commId) {
		CommId = commId;
	}
	public String getCommName() {
		return CommName;
	}
	public void setCommName(String commName) {
		CommName = commName;
	}
	public String getCommAddress() {
		return CommAddress;
	}
	public void setCommAddress(String commAddress) {
		CommAddress = commAddress;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	
}
