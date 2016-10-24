package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;

public class SolPrdlineVersion {
    private String prdlineVersionId;

    private String prdlineId;

    private String prdlineVersion;

    private String versionRemark;

    private Timestamp createTime;

    public String getPrdlineVersionId() {
        return prdlineVersionId;
    }

    public void setPrdlineVersionId(String prdlineVersionId) {
        this.prdlineVersionId = prdlineVersionId == null ? null : prdlineVersionId.trim();
    }

    public String getPrdlineId() {
        return prdlineId;
    }

    public void setPrdlineId(String prdlineId) {
        this.prdlineId = prdlineId == null ? null : prdlineId.trim();
    }

    public String getPrdlineVersion() {
        return prdlineVersion;
    }

    public void setPrdlineVersion(String prdlineVersion) {
        this.prdlineVersion = prdlineVersion == null ? null : prdlineVersion.trim();
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