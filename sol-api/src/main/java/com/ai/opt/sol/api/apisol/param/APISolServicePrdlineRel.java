package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;

public class APISolServicePrdlineRel implements Serializable{

	private static final long serialVersionUID = -9142249559071688364L;
	/**
	 * 标签ID
	 */
	private String srvPrdlineId;
	/**
	 * 产品线id
	 */
	private String prdlineId;
	/**
	 * 服务id
	 */
	private String srvApiId;
	/**
	 * 产品线版本
	 */
	private String prdVersionId;
	/**
	 * 服务版本
	 */
	private String srvVersionId;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 更新时间
	 */
	private String updateTime;
	
	public String getSrvPrdlineId() {
		return srvPrdlineId;
	}
	public void setSrvPrdlineId(String srvPrdlineId) {
		this.srvPrdlineId = srvPrdlineId;
	}
	public String getPrdlineId() {
		return prdlineId;
	}
	public void setPrdlineId(String prdlineId) {
		this.prdlineId = prdlineId;
	}
	public String getSrvApiId() {
		return srvApiId;
	}
	public void setSrvApiId(String srvApiId) {
		this.srvApiId = srvApiId;
	}
	public String getPrdVersionId() {
		return prdVersionId;
	}
	public void setPrdVersionId(String prdVersionId) {
		this.prdVersionId = prdVersionId;
	}
	public String getSrvVersionId() {
		return srvVersionId;
	}
	public void setSrvVersionId(String srvVersionId) {
		this.srvVersionId = srvVersionId;
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

}
