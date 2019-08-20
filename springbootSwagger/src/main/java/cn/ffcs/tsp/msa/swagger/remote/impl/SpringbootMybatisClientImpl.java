package cn.ffcs.tsp.msa.swagger.remote.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import cn.ffcs.tsp.msa.mybatis.dto.ManualInfoDTO;
import cn.ffcs.tsp.msa.mybatis.entity.ManualInfo;
import cn.ffcs.tsp.msa.swagger.remote.ISpringbootMybatisRemoteClient;

@Component
public class SpringbootMybatisClientImpl implements ISpringbootMybatisRemoteClient{

	public List<ManualInfo> ManualInfo(@RequestBody ManualInfoDTO arg0) {
		return null;
	}

	public List<ManualInfo> findAll(){
		System.out.println("降级处理");
		return null;
	}

}
