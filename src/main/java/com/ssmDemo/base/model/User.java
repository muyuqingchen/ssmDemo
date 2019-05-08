package com.ssmDemo.base.model;

import lombok.Data;

import java.util.Date;

@Data
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

}