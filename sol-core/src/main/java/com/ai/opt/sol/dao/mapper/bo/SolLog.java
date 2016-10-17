package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;

public class SolLog {
    private String logId;

    private String logType;

    private String logModel;

    private String logRemark;

    private Timestamp createTime;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    public String getLogModel() {
        return logModel;
    }

    public void setLogModel(String logModel) {
        this.logModel = logModel == null ? null : logModel.trim();
    }

    public String getLogRemark() {
        return logRemark;
    }

    public void setLogRemark(String logRemark) {
        this.logRemark = logRemark == null ? null : logRemark.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}