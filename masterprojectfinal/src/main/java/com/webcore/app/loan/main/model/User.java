package com.webcore.app.loan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GeneratorType;
@Entity
public class User 
{
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int userId;
private String fullName;
private String userLaddress;
private String userPaddress;
private String userMobNo;
private String userAmobNo;
private String userEmail;
private String userGender;
private String userName;
private String password;
private String userDob;
private String userDoj;
private String userStatusCode;
@OneToOne(cascade = CascadeType.ALL)
private Role userRole;
@OneToOne(cascade = CascadeType.ALL)
private Branch userBranch;

public String getUserStatusCode() {
	return userStatusCode;
}
public void setUserStatusCode(String userStatusCode) {
	this.userStatusCode = userStatusCode;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getUserLaddress() {
	return userLaddress;
}
public void setUserLaddress(String userLaddress) {
	this.userLaddress = userLaddress;
}
public String getUserPaddress() {
	return userPaddress;
}
public void setUserPaddress(String userPaddress) {
	this.userPaddress = userPaddress;
}
public String getUserMobNo() {
	return userMobNo;
}
public void setUserMobNo(String userMobNo) {
	this.userMobNo = userMobNo;
}
public String getUserAmobNo() {
	return userAmobNo;
}
public void setUserAmobNo(String userAmobNo) {
	this.userAmobNo = userAmobNo;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getUserGender() {
	return userGender;
}
public void setUserGender(String userGender) {
	this.userGender = userGender;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUserDob() {
	return userDob;
}
public void setUserDob(String userDob) {
	this.userDob = userDob;
}
public String getUserDoj() {
	return userDoj;
}
public void setUserDoj(String userDoj) {
	this.userDoj = userDoj;
}

public Role getUserRole() {
	return userRole;
}
public void setUserRole(Role userRole) {
	this.userRole = userRole;
}
public Branch getUserBranch() {
	return userBranch;
}
public void setUserBranch(Branch userBranch) {
	this.userBranch = userBranch;
}



} 
