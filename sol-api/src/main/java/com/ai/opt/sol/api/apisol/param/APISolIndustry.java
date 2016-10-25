package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;

public class APISolIndustry implements Serializable{

	private static final long serialVersionUID = 4298391293656926851L;
	/**
	 * 行业编码
	 */
	private String industryCode;
	/**
	 * 行业名称
	 */
	private String industryName;
	public String getIndustryCode() {
		return industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}
	public String getIndustryName() {
		return industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	

}
