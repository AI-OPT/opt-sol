package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;

public class SolServiceVersion {
    private String srvVersionId;

    private String srvApiId;

    private String srvVersion;

    private String versionRemark;

    private Timestamp createTime;

    public String getSrvVersionId() {
        return srvVersionId;
    }

    public void setSrvVersionId(String srvVersionId) {
        this.srvVersionId = srvVersionId == null ? null : srvVersionId.trim();
    }

    public String getSrvApiId() {
        return srvApiId;
    }

    public void setSrvApiId(String srvApiId) {
        this.srvApiId = srvApiId == null ? null : srvApiId.trim();
    }

    public String getSrvVersion() {
        return srvVersion;
    }

    public void setSrvVersion(String srvVersion) {
        this.srvVersion = srvVersion == null ? null : srvVersion.trim();
    }

    public String getVersionRemark() {
        return versionRemark;
    }

    public void setVersionRemark(String versionRemark) {
        this.versionRemark = versionRemark == null ? null : versionRemark.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}