package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;

public class APISolPrdline implements Serializable{

	private static final long serialVersionUID = 3339603661476117557L;
	/**
     * 产品线名称
     */
	private String prdlineName;
	/**
	 * 产品线描述
	 */
	private String prdlineRemark;
	/**
	 * 产品线创建时间
	 */
	private String createTime;
	/**
	 * 修改时间
	 */
	private String updateTime;
	/**
	 * 产品线id
	 */
	private String prdlineId;
	/**
	 * 产品线负责人
	 */
	private String prdlineManager;
	/**
	 * 行业类型
	 */
	private String industryCode;
	
	/**
	 * 产品线编码
	 */
	private String prdlineCode;
	
	public String getPrdlineCode() {
		return prdlineCode;
	}
	public void setPrdlineCode(String prdlineCode) {
		this.prdlineCode = prdlineCode;
	}
	public String getPrdlineName() {
		return prdlineName;
	}
	public void setPrdlineName(String prdlineName) {
		this.prdlineName = prdlineName;
	}
	public String getPrdlineRemark() {
		return prdlineRemark;
	}
	public void setPrdlineRemark(String prdlineRemark) {
		this.prdlineRemark = prdlineRemark;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getPrdlineId() {
		return prdlineId;
	}
	public void setPrdlineId(String prdlineId) {
		this.prdlineId = prdlineId;
	}
	public String getPrdlineManager() {
		return prdlineManager;
	}
	public void setPrdlineManager(String prdlineManager) {
		this.prdlineManager = prdlineManager;
	}
	public String getIndustryCode() {
		return industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}
}
