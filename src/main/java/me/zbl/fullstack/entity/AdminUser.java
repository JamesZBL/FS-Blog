package me.zbl.fullstack.entity;

import java.util.Date;

public class AdminUser {
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private String email;

    private String github;

    private String qq;

    private String wecaht;

    private String avatar;

    private Integer birYear;

    private Integer birMonth;

    private Integer birDay;

    private Date gmtCreate;

    private Date gmtModified;

    private String hobby;

    private String motto;

    private String mdInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github == null ? null : github.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWecaht() {
        return wecaht;
    }

    public void setWecaht(String wecaht) {
        this.wecaht = wecaht == null ? null : wecaht.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getBirYear() {
        return birYear;
    }

    public void setBirYear(Integer birYear) {
        this.birYear = birYear;
    }

    public Integer getBirMonth() {
        return birMonth;
    }

    public void setBirMonth(Integer birMonth) {
        this.birMonth = birMonth;
    }

    public Integer getBirDay() {
        return birDay;
    }

    public void setBirDay(Integer birDay) {
        this.birDay = birDay;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto == null ? null : motto.trim();
    }

    public String getMdInfo() {
        return mdInfo;
    }

    public void setMdInfo(String mdInfo) {
        this.mdInfo = mdInfo == null ? null : mdInfo.trim();
    }
}