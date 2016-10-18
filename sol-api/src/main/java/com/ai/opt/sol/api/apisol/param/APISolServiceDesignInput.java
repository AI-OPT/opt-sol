package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;

public class APISolServiceDesignInput implements Serializable{

	private static final long serialVersionUID = 2584034391466622893L;
	/**
	 * 服务id
	 */
	private String srvApiId;
	/**
	 * 入参id
	 */
	private String inputId;
	/**
	 * 入参名称
	 */
	private String inputName;
	/**
	 * 父级参数名称
	 */
	private String parentInputName;
	/**
	 * 是否必填
	 */
	private String isRequired;
	public String getSrvApiId() {
		return srvApiId;
	}
	public void setSrvApiId(String srvApiId) {
		this.srvApiId = srvApiId;
	}
	public String getInputId() {
		return inputId;
	}
	public void setInputId(String inputId) {
		this.inputId = inputId;
	}
	public String getInputName() {
		return inputName;
	}
	public void setInputName(String inputName) {
		this.inputName = inputName;
	}
	public String getParentInputName() {
		return parentInputName;
	}
	public void setParentInputName(String parentInputName) {
		this.parentInputName = parentInputName;
	}
	public String getIsRequired() {
		return isRequired;
	}
	public void setIsRequired(String isRequired) {
		this.isRequired = isRequired;
	}
}
