package com.ai.opt.sol.api.apisearch.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.sol.api.apisol.ISolPrdlineSV;
import com.ai.opt.sol.api.apisol.param.APISolPrdline;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class ISolSVTest {
	@Autowired
	private ISolPrdlineSV iSolSv;
	@Test
	public void insertSolPrdlineTest(){
		APISolPrdline solPrdline=new APISolPrdline();
		solPrdline.setCreateTime("20161012104600");
		solPrdline.setIndustryCode("CH");
		solPrdline.setPrdlineManager("haha");
		solPrdline.setPrdlineName("长虹");
		solPrdline.setPrdlineRemark("空");
		solPrdline.setUpdateTime("20161012104600");
		iSolSv.createSolPrdline(solPrdline);
		
	}
}
