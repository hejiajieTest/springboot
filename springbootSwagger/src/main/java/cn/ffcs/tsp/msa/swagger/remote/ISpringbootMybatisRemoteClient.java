package cn.ffcs.tsp.msa.swagger.remote;

import org.springframework.cloud.netflix.feign.FeignClient;

import cn.ffcs.tsp.msa.mybatis.client.ISpringbootMybatisClient;
import cn.ffcs.tsp.msa.swagger.remote.impl.SpringbootMybatisClientImpl;


@FeignClient(value = "springboot-mybatis",fallback=SpringbootMybatisClientImpl.class)
public interface ISpringbootMybatisRemoteClient extends ISpringbootMybatisClient{
	
}