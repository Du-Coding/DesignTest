package com.pc.vo;

import java.util.Date;

/**
 * 
 * @author duke
 * @version 1.0 2018/11/21
 * 用户实体类
 *
 */
public class UsersVO {

	private String UserId;       //用户ID
	private String UserAccount;  //用户账号
	private String UserPassword; //用户密码
	private String UserName;     //用户姓名
	private String UserGender;   //用户性别
	private String UserCard;     //用户身份证号
	private String UserTel;      //用户电话
	private String UserSort;     //用户类别
	private Date CreateDate;     //创建时间
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserAccount() {
		return UserAccount;
	}
	public void setUserAccount(String userAccount) {
		UserAccount = userAccount;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserGender() {
		return UserGender;
	}
	public void setUserGender(String userGender) {
		UserGender = userGender;
	}
	public String getUserCard() {
		return UserCard;
	}
	public void setUserCard(String userCard) {
		UserCard = userCard;
	}
	public String getUserTel() {
		return UserTel;
	}
	public void setUserTel(String userTel) {
		UserTel = userTel;
	}
	public String getUserSort() {
		return UserSort;
	}
	public void setUserSort(String userSort) {
		UserSort = userSort;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	
}
