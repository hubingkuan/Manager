package com.bean;

public class Admin {

    private Integer id;

    //管理员账号
    private Integer adminNumber;

    //管理员密码
    private String password;

    //管理员姓名
    private String name;

    //管理员学院
    private String insititue;

    //是否为超级管理员
    private Integer issuper;

    //联系电话
    private String phone;

    //邮箱
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminNumber() {
        return adminNumber;
    }

    public void setAdminNumber(Integer adminNumber) {
        this.adminNumber = adminNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getInsititue() {
        return insititue;
    }

    public void setInsititue(String insititue) {
        this.insititue = insititue == null ? null : insititue.trim();
    }

    public Integer getIssuper() {
        return issuper;
    }

    public void setIssuper(Integer issuper) {
        this.issuper = issuper;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}