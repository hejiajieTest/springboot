package cn.ffcs.tsp.msa.mybatis.client;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cn.ffcs.tsp.msa.mybatis.dto.ManualInfoDTO;
import cn.ffcs.tsp.msa.mybatis.entity.ManualInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags={"springboot微服务之mybatisdemo"},basePath="/springboot-mybatis",description="mybatis")
public interface ISpringbootMybatisClient {
	
	@ApiOperation(value="查找所有")
	@ApiParam(name = "request",required = true,value = "请求消息体",type = "java.lang.Object")
	@GetMapping("/mybatis/findAll")
	List<ManualInfo> findAll();
	@ApiOperation(value="分页查询")
	@ApiParam(name = "request",required = true,value = "请求消息体",type = "java.lang.Object")
	@PostMapping("/mybatis/findByPage")
	List<ManualInfo> ManualInfo(@RequestBody ManualInfoDTO dto);
}
