package cn.ffcs.tsp.msa.swagger.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ffcs.tsp.msa.mybatis.dto.ManualInfoDTO;
import cn.ffcs.tsp.msa.mybatis.entity.ManualInfo;
import cn.ffcs.tsp.msa.swagger.remote.ISpringbootMybatisRemoteClient;
import cn.ffcs.tsp.msa.swagger.service.ISwaggerTest;

@Service
public class SwaggerTestImpl implements ISwaggerTest{
	@Resource
	ISpringbootMybatisRemoteClient ispringbootMybatisClient ;
	
	public void test(){
		ManualInfoDTO arg0 = new ManualInfoDTO() ;
		arg0.setPageNum(1);
		arg0.setPageSize(5);
		List<ManualInfo> list = ispringbootMybatisClient.findAll();
		System.out.println(list);
	}
}
