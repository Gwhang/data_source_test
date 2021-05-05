package com.gwh.entity;

import javax.persistence.*;

/**
 * 用户表
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id",length = 32)
    private Integer id;

    @Column(name="userName",length = 36)
    private String userName;

    @Column(name = "passWord",length = 36)
    private String passWord;

    @Column(name = "realName",length = 36)
    private String realName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
