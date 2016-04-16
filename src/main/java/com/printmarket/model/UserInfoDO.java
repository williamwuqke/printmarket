package com.printmarket.model;

import java.util.Date;

/**
 * Created by wuqiongke on 15/12/1.
 */
public class UserInfoDO {
    private int userId;
    private String userAccount;
    private String userPassword;
    private String userName;
    private String sex;
    private String company;
    private String telephone;
    private String email;
    private Date createtime;

    public UserInfoDO() {
    }

    public UserInfoDO(int userId, String userAccount, String userPassword, String userName, String sex, String company, String telephone, String email, Date createtime) {
        this.userId = userId;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.userName = userName;
        this.sex = sex;
        this.company = company;
        this.telephone = telephone;
        this.email = email;
        this.createtime = createtime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
