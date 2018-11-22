package com.pc.vo;

import java.util.Date;

/**
 * 
 * @author duke
 * @version 1.0 2018/11/21
 * 管理员实体
 *
 */
public class AdminVO {

	private String AdminId;       //管理员ID
	private String AdminAccount;  //管理员账号
	private String AdminPassword; //管理员密码
	private String AdminName;     //管理员姓名
	private Date CreateDate;      //创建时间
	
	public String getAdminId() {
		return AdminId;
	}
	public void setAdminId(String adminId) {
		AdminId = adminId;
	}
	public String getAdminAccount() {
		return AdminAccount;
	}
	public void setAdminAccount(String adminAccount) {
		AdminAccount = adminAccount;
	}
	public String getAdminPassword() {
		return AdminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	
}
