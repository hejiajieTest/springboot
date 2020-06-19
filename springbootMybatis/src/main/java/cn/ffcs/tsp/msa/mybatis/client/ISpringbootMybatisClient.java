package cn.ffcs.tsp.msa.mybatis.client;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cn.ffcs.tsp.msa.mybatis.dto.ManualInfoDTO;
import cn.ffcs.tsp.msa.mybatis.dto.ScatterDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenGmDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenQylxDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenXzDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenXzqDTO;
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
	@ApiOperation(value="批量入库")
	@ApiParam(name = "request",required = true,value = "请求消息体",type = "java.lang.Object")
	@PostMapping("/mybatis/save")
	void save(@RequestBody ManualInfo manualInfo);
	
	@ApiOperation(value="批量入库")
	@ApiParam(name = "request",required = true,value = "请求消息体",type = "java.lang.Object")
	@PostMapping("/mybatis/saveScatter")
	List<ScatterDTO> saveScatter(@RequestBody List<ScatterDTO> dto);
	
	@ApiOperation(value="批量入库")
	@ApiParam(name = "request",required = true,value = "请求消息体",type = "java.lang.Object")
	@PostMapping("/mybatis/saveFarenQylx")
	List<ScatterDTO> saveFarenQylx(@RequestBody List<FarenQylxDTO> dto);
	
	@ApiOperation(value="批量入库")
	@ApiParam(name = "request",required = true,value = "请求消息体",type = "java.lang.Object")
	@PostMapping("/mybatis/saveFarenGm")
	List<ScatterDTO> saveFarenGm(@RequestBody List<FarenGmDTO> dto);
	
	@ApiOperation(value="批量入库")
	@ApiParam(name = "request",required = true,value = "请求消息体",type = "java.lang.Object")
	@PostMapping("/mybatis/saveFarenXz")
	List<ScatterDTO> saveFarenXz(@RequestBody List<FarenXzDTO> dto);
	
	@ApiOperation(value="批量入库")
	@ApiParam(name = "request",required = true,value = "请求消息体",type = "java.lang.Object")
	@PostMapping("/mybatis/saveFarenXzq")
	List<ScatterDTO> saveFarenXzq(@RequestBody List<FarenXzqDTO> dto);
	
}
