package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;

public class SolServiceDefine {
    private String srvApiId;

    private String srvApiName;

    private String srvRemark;

    private String srvCenter;

    private String srvCategoryId;

    private String srvClass;

    private Timestamp createTime;

    private Timestamp updateTime;

    public String getSrvApiId() {
        return srvApiId;
    }

    public void setSrvApiId(String srvApiId) {
        this.srvApiId = srvApiId == null ? null : srvApiId.trim();
    }

    public String getSrvApiName() {
        return srvApiName;
    }

    public void setSrvApiName(String srvApiName) {
        this.srvApiName = srvApiName == null ? null : srvApiName.trim();
    }

    public String getSrvRemark() {
        return srvRemark;
    }

    public void setSrvRemark(String srvRemark) {
        this.srvRemark = srvRemark == null ? null : srvRemark.trim();
    }

    public String getSrvCenter() {
        return srvCenter;
    }

    public void setSrvCenter(String srvCenter) {
        this.srvCenter = srvCenter == null ? null : srvCenter.trim();
    }

    public String getSrvCategoryId() {
        return srvCategoryId;
    }

    public void setSrvCategoryId(String srvCategoryId) {
        this.srvCategoryId = srvCategoryId == null ? null : srvCategoryId.trim();
    }

    public String getSrvClass() {
        return srvClass;
    }

    public void setSrvClass(String srvClass) {
        this.srvClass = srvClass == null ? null : srvClass.trim();
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