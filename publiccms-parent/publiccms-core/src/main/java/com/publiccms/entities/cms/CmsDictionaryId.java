package com.publiccms.entities.cms;
// Generated 2019-1-24 10:35:20 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * CmsDictionaryId generated by hbm2java
 */
@Embeddable
public class CmsDictionaryId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private String id;
    @GeneratorColumn(title = "站点")
    private short siteId;

    public CmsDictionaryId() {
    }

    public CmsDictionaryId(String id, short siteId) {
        this.id = id;
        this.siteId = siteId;
    }

    @Column(name = "id", nullable = false, length = 20)
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public short getSiteId() {
        return this.siteId;
    }

    public void setSiteId(short siteId) {
        this.siteId = siteId;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof CmsDictionaryId))
            return false;
        CmsDictionaryId castOther = (CmsDictionaryId) other;

        return ((this.getId() == castOther.getId())
                || (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
                && (this.getSiteId() == castOther.getSiteId());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
        result = 37 * result + this.getSiteId();
        return result;
    }

}
