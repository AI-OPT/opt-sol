package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;

public class APISolServiceQueryResult implements Serializable{

	private static final long serialVersionUID = 137408140360425145L;
	/**
	 * 服务定义信息
	 */
	private APISolServiceDefine serviceDefine;
	/**
	 * 服务入参信息
	 */
	private APISolServiceDesignInput serviceDesignInput;
	/**
	 * 服务出参信息
	 */
	private APISolServiceDesignOutput serviceDesignOutput;
	
	public APISolServiceDefine getServiceDefine() {
		return serviceDefine;
	}
	public void setServiceDefine(APISolServiceDefine serviceDefine) {
		this.serviceDefine = serviceDefine;
	}
	public APISolServiceDesignInput getServiceDesignInput() {
		return serviceDesignInput;
	}
	public void setServiceDesignInput(APISolServiceDesignInput serviceDesignInput) {
		this.serviceDesignInput = serviceDesignInput;
	}
	public APISolServiceDesignOutput getServiceDesignOutput() {
		return serviceDesignOutput;
	}
	public void setServiceDesignOutput(APISolServiceDesignOutput serviceDesignOutput) {
		this.serviceDesignOutput = serviceDesignOutput;
	}
	
	
}
