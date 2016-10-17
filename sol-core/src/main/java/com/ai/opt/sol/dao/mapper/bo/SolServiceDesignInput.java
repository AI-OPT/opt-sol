package com.ai.opt.sol.dao.mapper.bo;

public class SolServiceDesignInput {
    private String inputId;

    private String srvApiId;

    private String inputName;

    private String parentInputName;

    private String isrequired;

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId == null ? null : inputId.trim();
    }

    public String getSrvApiId() {
        return srvApiId;
    }

    public void setSrvApiId(String srvApiId) {
        this.srvApiId = srvApiId == null ? null : srvApiId.trim();
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName == null ? null : inputName.trim();
    }

    public String getParentInputName() {
        return parentInputName;
    }

    public void setParentInputName(String parentInputName) {
        this.parentInputName = parentInputName == null ? null : parentInputName.trim();
    }

    public String getIsrequired() {
        return isrequired;
    }

    public void setIsrequired(String isrequired) {
        this.isrequired = isrequired == null ? null : isrequired.trim();
    }
}