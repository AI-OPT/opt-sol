package com.ai.opt.sol.dao.mapper.bo;

public class SolServiceDesignOutput {
    private String outputId;

    private String srvApiId;

    private String outputName;

    private String parentOutputName;

    public String getOutputId() {
        return outputId;
    }

    public void setOutputId(String outputId) {
        this.outputId = outputId == null ? null : outputId.trim();
    }

    public String getSrvApiId() {
        return srvApiId;
    }

    public void setSrvApiId(String srvApiId) {
        this.srvApiId = srvApiId == null ? null : srvApiId.trim();
    }

    public String getOutputName() {
        return outputName;
    }

    public void setOutputName(String outputName) {
        this.outputName = outputName == null ? null : outputName.trim();
    }

    public String getParentOutputName() {
        return parentOutputName;
    }

    public void setParentOutputName(String parentOutputName) {
        this.parentOutputName = parentOutputName == null ? null : parentOutputName.trim();
    }
}