package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;

public class APISolPrdlineVersion implements Serializable{

	private static final long serialVersionUID = 927187847307818344L;
	/**
	 * 产品线版本ID
	 */
	private String prdlineVersionId;
	/**
	 * 产品线ID
	 */
	private String prdlineId;
	/**
	 * 产品线版本
	 */
	private String prdlineVersion;
	/**
	 * 版本摘要
	 */
	private String versionRemark;
	/**
	 * 版本创建时间
	 */
	private String createTime;
	public String getPrdlineVersionId() {
		return prdlineVersionId;
	}
	public void setPrdlineVersionId(String prdlineVersionId) {
		this.prdlineVersionId = prdlineVersionId;
	}
	public String getPrdlineId() {
		return prdlineId;
	}
	public void setPrdlineId(String prdlineId) {
		this.prdlineId = prdlineId;
	}
	public String getPrdlineVersion() {
		return prdlineVersion;
	}
	public void setPrdlineVersion(String prdlineVersion) {
		this.prdlineVersion = prdlineVersion;
	}
	public String getVersionRemark() {
		return versionRemark;
	}
	public void setVersionRemark(String versionRemark) {
		this.versionRemark = versionRemark;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	

}
