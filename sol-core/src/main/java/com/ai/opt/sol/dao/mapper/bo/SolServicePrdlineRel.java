package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;

public class SolServicePrdlineRel {
    private String srvPrdlineId;

    private String prdlineId;

    private String srvApiId;

    private String prdVersion;

    private String srvVersionId;

    private Timestamp createTime;

    private Timestamp updateTime;

    public String getSrvPrdlineId() {
        return srvPrdlineId;
    }

    public void setSrvPrdlineId(String srvPrdlineId) {
        this.srvPrdlineId = srvPrdlineId == null ? null : srvPrdlineId.trim();
    }

    public String getPrdlineId() {
        return prdlineId;
    }

    public void setPrdlineId(String prdlineId) {
        this.prdlineId = prdlineId == null ? null : prdlineId.trim();
    }

    public String getSrvApiId() {
        return srvApiId;
    }

    public void setSrvApiId(String srvApiId) {
        this.srvApiId = srvApiId == null ? null : srvApiId.trim();
    }

    public String getPrdVersion() {
        return prdVersion;
    }

    public void setPrdVersion(String prdVersion) {
        this.prdVersion = prdVersion == null ? null : prdVersion.trim();
    }

    public String getSrvVersionId() {
        return srvVersionId;
    }

    public void setSrvVersionId(String srvVersionId) {
        this.srvVersionId = srvVersionId == null ? null : srvVersionId.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}