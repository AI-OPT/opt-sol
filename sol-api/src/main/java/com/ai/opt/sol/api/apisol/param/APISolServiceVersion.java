package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;

public class APISolServiceVersion implements Serializable{

	private static final long serialVersionUID = 1373504702103051668L;
	/**
	 * 服务版本ID
	 */
	private String srvVersionId;
	/**
	 * 服务ID
	 */
	private String srvApiId;
	/**
	 * 服务版本
	 */
	private String srvVersion;
	/**
	 * 版本摘要
	 */
	private String versionRemark;
	/**
	 * 版本创建时间
	 */
	private String createTime;
	
	public String getSrvVersionId() {
		return srvVersionId;
	}
	public void setSrvVersionId(String srvVersionId) {
		this.srvVersionId = srvVersionId;
	}
	public String getSrvApiId() {
		return srvApiId;
	}
	public void setSrvApiId(String srvApiId) {
		this.srvApiId = srvApiId;
	}
	public String getSrvVersion() {
		return srvVersion;
	}
	public void setSrvVersion(String srvVersion) {
		this.srvVersion = srvVersion;
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
