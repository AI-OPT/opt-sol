package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;

public class SolLifecyle {
    private String serviceGlobalId;

    private String productlineId;

    private String categoryId;

    private String serviceApiCode;

    private String serviceApiName;

    private String serviceRemark;

    private String serviceReqDocUrl;

    private String servicePrototypeDocUrl;

    private String serviceDesignDocUrl;

    private String serviceOlTestUrl;

    private String serviceTestDocUrl;

    private Timestamp createTime;

    private Timestamp updateTime;

    private String serviceState;

    public String getServiceGlobalId() {
        return serviceGlobalId;
    }

    public void setServiceGlobalId(String serviceGlobalId) {
        this.serviceGlobalId = serviceGlobalId == null ? null : serviceGlobalId.trim();
    }

    public String getProductlineId() {
        return productlineId;
    }

    public void setProductlineId(String productlineId) {
        this.productlineId = productlineId == null ? null : productlineId.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getServiceApiCode() {
        return serviceApiCode;
    }

    public void setServiceApiCode(String serviceApiCode) {
        this.serviceApiCode = serviceApiCode == null ? null : serviceApiCode.trim();
    }

    public String getServiceApiName() {
        return serviceApiName;
    }

    public void setServiceApiName(String serviceApiName) {
        this.serviceApiName = serviceApiName == null ? null : serviceApiName.trim();
    }

    public String getServiceRemark() {
        return serviceRemark;
    }

    public void setServiceRemark(String serviceRemark) {
        this.serviceRemark = serviceRemark == null ? null : serviceRemark.trim();
    }

    public String getServiceReqDocUrl() {
        return serviceReqDocUrl;
    }

    public void setServiceReqDocUrl(String serviceReqDocUrl) {
        this.serviceReqDocUrl = serviceReqDocUrl == null ? null : serviceReqDocUrl.trim();
    }

    public String getServicePrototypeDocUrl() {
        return servicePrototypeDocUrl;
    }

    public void setServicePrototypeDocUrl(String servicePrototypeDocUrl) {
        this.servicePrototypeDocUrl = servicePrototypeDocUrl == null ? null : servicePrototypeDocUrl.trim();
    }

    public String getServiceDesignDocUrl() {
        return serviceDesignDocUrl;
    }

    public void setServiceDesignDocUrl(String serviceDesignDocUrl) {
        this.serviceDesignDocUrl = serviceDesignDocUrl == null ? null : serviceDesignDocUrl.trim();
    }

    public String getServiceOlTestUrl() {
        return serviceOlTestUrl;
    }

    public void setServiceOlTestUrl(String serviceOlTestUrl) {
        this.serviceOlTestUrl = serviceOlTestUrl == null ? null : serviceOlTestUrl.trim();
    }

    public String getServiceTestDocUrl() {
        return serviceTestDocUrl;
    }

    public void setServiceTestDocUrl(String serviceTestDocUrl) {
        this.serviceTestDocUrl = serviceTestDocUrl == null ? null : serviceTestDocUrl.trim();
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

    public String getServiceState() {
        return serviceState;
    }

    public void setServiceState(String serviceState) {
        this.serviceState = serviceState == null ? null : serviceState.trim();
    }
}