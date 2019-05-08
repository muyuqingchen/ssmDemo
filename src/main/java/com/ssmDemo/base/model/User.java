package com.ssmDemo.base.model;

import java.util.Date;

public class User {
    private String id;

    private String userName;

    private String truename;

    private String password;

    private String telephone;

    private Integer sex;

    private String roleid;

    private Date createtime;

    private String creatorid;

    private String creatorname;

    private Date updatetime;

    private String updatepersonid;

    private String updatepersonname;

    private String companyid;

    private String organizationid;

    private Integer overflag;

    private Integer status;

    private Integer level;

    private String imageurl;

    private Long logintimes;

    private Date lastlogintime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid == null ? null : creatorid.trim();
    }

    public String getCreatorname() {
        return creatorname;
    }

    public void setCreatorname(String creatorname) {
        this.creatorname = creatorname == null ? null : creatorname.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdatepersonid() {
        return updatepersonid;
    }

    public void setUpdatepersonid(String updatepersonid) {
        this.updatepersonid = updatepersonid == null ? null : updatepersonid.trim();
    }

    public String getUpdatepersonname() {
        return updatepersonname;
    }

    public void setUpdatepersonname(String updatepersonname) {
        this.updatepersonname = updatepersonname == null ? null : updatepersonname.trim();
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }

    public Integer getOverflag() {
        return overflag;
    }

    public void setOverflag(Integer overflag) {
        this.overflag = overflag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public Long getLogintimes() {
        return logintimes;
    }

    public void setLogintimes(Long logintimes) {
        this.logintimes = logintimes;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }
}