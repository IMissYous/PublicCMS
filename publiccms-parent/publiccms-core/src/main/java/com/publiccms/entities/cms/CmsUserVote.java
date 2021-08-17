package com.publiccms.entities.cms;
// Generated 2020-3-26 11:25:55 by Hibernate Tools 6.0.0-SNAPSHOT

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * CmsVoteUser generated by hbm2java
 */
@Entity
@Table(name = "cms_user_vote")
public class CmsUserVote implements java.io.Serializable {

    /**
    *
    */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private CmsUserVoteId id;
    @GeneratorColumn(title = "选项")
    private long itemId;
    @GeneratorColumn(title = "IP")
    private String ip;
    @GeneratorColumn(title = "创建日期", order = true)
    private Date createDate;

    public CmsUserVote() {
    }

    public CmsUserVote(CmsUserVoteId id, long itemId, String ip, Date createDate) {
        this.id = id;
        this.itemId = itemId;
        this.ip = ip;
        this.createDate = createDate;
    }

    @EmbeddedId

    @AttributeOverrides({ @AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false)),
            @AttributeOverride(name = "voteId", column = @Column(name = "vote_id", nullable = false)) })
    public CmsUserVoteId getId() {
        return this.id;
    }

    public void setId(CmsUserVoteId id) {
        this.id = id;
    }

    @Column(name = "item_id", nullable = false)
    public long getItemId() {
        return this.itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    @Column(name = "ip", nullable = false, length = 130)
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
