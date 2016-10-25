package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;

public class APISolSrvPrdline implements Serializable{

	private static final long serialVersionUID = 8956293383937269512L;
	/**
	 * 服务id
	 */
	private String srvApiId;
	/**
	 * 服务名称
	 */
	private String srvApiName;
	/**
	 * 服务描述
	 */
	private String srvRemark;
	/**
	 * 所属中心
	 */
	private String srvCenter;
	/**
	 * 所属分类
	 */
	private String srvCategoryId;
	/**
	 * 服务类型：查询、创建、修改、删除
	 */
	private String srvClass;
	/**
	 * 产品线id
	 */
	private String prdlineId;
	public String getSrvApiId() {
		return srvApiId;
	}
	public void setSrvApiId(String srvApiId) {
		this.srvApiId = srvApiId;
	}
	public String getSrvApiName() {
		return srvApiName;
	}
	public void setSrvApiName(String srvApiName) {
		this.srvApiName = srvApiName;
	}
	public String getSrvRemark() {
		return srvRemark;
	}
	public void setSrvRemark(String srvRemark) {
		this.srvRemark = srvRemark;
	}
	public String getSrvCenter() {
		return srvCenter;
	}
	public void setSrvCenter(String srvCenter) {
		this.srvCenter = srvCenter;
	}
	public String getSrvCategoryId() {
		return srvCategoryId;
	}
	public void setSrvCategoryId(String srvCategoryId) {
		this.srvCategoryId = srvCategoryId;
	}
	public String getSrvClass() {
		return srvClass;
	}
	public void setSrvClass(String srvClass) {
		this.srvClass = srvClass;
	}
	public String getPrdlineId() {
		return prdlineId;
	}
	public void setPrdlineId(String prdlineId) {
		this.prdlineId = prdlineId;
	}
}
