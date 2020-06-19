package cn.ffcs.tsp.msa.swagger.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.ffcs.tsp.msa.swagger.service.ISwaggerTest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags={"springboot微服务之swaggerdemo"},basePath="/music",description="音乐服务")
@RestController
public class SpringbootSwaggerDemo {
	
	@Autowired
    DiscoveryClient discoveryClient;

	@Resource
	private ISwaggerTest test ;
	@ApiOperation(value="SwaggerDemo测试")
	@ApiParam(name = "request",required = true,value = "请求消息体",type = "java.lang.Object",hidden=true)
	@ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")
	@PostMapping("/getMusicCategory/{id}")
	public void testSwagger(@PathVariable int id,@RequestBody String jsonStr){
		System.out.println(id);
		System.out.println(jsonStr);
		test.test();
	}
	
	/**
	* 本地服务实例的信息
	* @return
	*/
	@GetMapping("/instance-info")
	public ServiceInstance showInfo() {
	ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
	return localServiceInstance;
	}
}
