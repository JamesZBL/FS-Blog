package me.zbl.fullstack.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tag_article")
public class TagArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Tag_ID
     */
    @Column(name = "tag_id")
    private Integer tagId;

    /**
     * Article_ID
     */
    @Column(name = "article_id")
    private Integer articleId;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取Tag_ID
     *
     * @return tag_id - Tag_ID
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * 设置Tag_ID
     *
     * @param tagId Tag_ID
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * 获取Article_ID
     *
     * @return article_id - Article_ID
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * 设置Article_ID
     *
     * @param articleId Article_ID
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * @return gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}