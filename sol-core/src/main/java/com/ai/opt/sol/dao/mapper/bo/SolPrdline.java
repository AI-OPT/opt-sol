package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;

public class SolPrdline {
    private String prdlineId;

    private String prdlineName;

    private String prdlineCode;

    private String prdlineRemark;

    private Timestamp createTime;

    private Timestamp updateTime;

    private String prdlineManager;

    private String industryCode;

    public String getPrdlineId() {
        return prdlineId;
    }

    public void setPrdlineId(String prdlineId) {
        this.prdlineId = prdlineId == null ? null : prdlineId.trim();
    }

    public String getPrdlineName() {
        return prdlineName;
    }

    public void setPrdlineName(String prdlineName) {
        this.prdlineName = prdlineName == null ? null : prdlineName.trim();
    }

    public String getPrdlineCode() {
        return prdlineCode;
    }

    public void setPrdlineCode(String prdlineCode) {
        this.prdlineCode = prdlineCode == null ? null : prdlineCode.trim();
    }

    public String getPrdlineRemark() {
        return prdlineRemark;
    }

    public void setPrdlineRemark(String prdlineRemark) {
        this.prdlineRemark = prdlineRemark == null ? null : prdlineRemark.trim();
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

    public String getPrdlineManager() {
        return prdlineManager;
    }

    public void setPrdlineManager(String prdlineManager) {
        this.prdlineManager = prdlineManager == null ? null : prdlineManager.trim();
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode == null ? null : industryCode.trim();
    }
}