package com.bzs.crm.dto;

import java.io.Serializable;


public class UserInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer uid;

	private String username;//帐号
	
	private String name;//名称
	 
	private String password; //密码;
	
	private String salt;//加密密码的盐
	
	private byte state; //用户状态

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public byte getState() {
		return state;
	}

	public void setState(byte state) {
		this.state = state;
	}
	
	/**
     * 密码盐.
     * @return
     */
    public String getCredentialsSalt(){
        return this.username+this.salt;
    }
	
}
