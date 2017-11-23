package com.bzs.crm.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 用户数据传输对象
 *
 * @author cj
 * @create 2017-11-22 16:38
 **/
public class UserDto {

    private Integer id;
    private String cnname;
    private String username;

    @JsonIgnore
    private String password;
    private String email;
    private String telephone;
    private String mobilePhone;
    private String wechatId;
    private String skill;
    private Integer deptId;
    private Integer loginCount;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCnname() {
        return cnname;
    }
    public void setCnname(String cnname) {
        this.cnname = cnname;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    public String getWechatId() {
        return wechatId;
    }
    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    public Integer getDeptId() {
        return deptId;
    }
    public void setDepartmentId(Integer deptId) {
        this.deptId = deptId;
    }
    public Integer getLoginCount() {
        return loginCount;
    }
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

}
