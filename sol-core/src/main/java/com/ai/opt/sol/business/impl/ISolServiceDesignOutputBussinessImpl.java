package com.ai.opt.sol.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sol.api.apisol.param.APISolServiceDesignOutput;
import com.ai.opt.sol.business.interfaces.ISolServiceDesignOutputBussiness;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDesignOutput;
import com.ai.opt.sol.dao.mapper.interfaces.SolServiceDesignOutputMapper;
@Service
@Transactional()
public class ISolServiceDesignOutputBussinessImpl implements ISolServiceDesignOutputBussiness{
	@Autowired
	SolServiceDesignOutputMapper solServiceDesignOutputMapper;
	@Override
	public void insertServiceOutput(APISolServiceDesignOutput serviceOutput) {
		SolServiceDesignOutput serviceOutputBo=new SolServiceDesignOutput();
		serviceOutputBo.setOutputId(serviceOutput.getOutputId());
		serviceOutputBo.setOutputName(serviceOutput.getOutputName());
		serviceOutputBo.setParentOutputName(serviceOutput.getParentOutputName());
		serviceOutputBo.setSrvApiId(serviceOutput.getSrvApiId());
		solServiceDesignOutputMapper.insert(serviceOutputBo);
	}

}
