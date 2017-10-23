package me.zbl.fullstack.entity;

import java.util.Date;

public class Article {
    private Integer id;

    private String title;

    private Date gmtCreate;

    private Date gmtModified;

    private String introduction;

    private String mdMaterial;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getMdMaterial() {
        return mdMaterial;
    }

    public void setMdMaterial(String mdMaterial) {
        this.mdMaterial = mdMaterial == null ? null : mdMaterial.trim();
    }
}