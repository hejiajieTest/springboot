package cn.ffcs.tsp.msa.mybatis.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

import cn.ffcs.tsp.msa.mybatis.client.ISpringbootMybatisClient;
import cn.ffcs.tsp.msa.mybatis.dto.ManualInfoDTO;
import cn.ffcs.tsp.msa.mybatis.dto.ScatterDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenGmDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenQylxDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenXzDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenXzqDTO;
import cn.ffcs.tsp.msa.mybatis.entity.ManualInfo;
import cn.ffcs.tsp.msa.mybatis.service.farenGm.IFarenGmService;
import cn.ffcs.tsp.msa.mybatis.service.farenQylx.IFarenQylxService;
import cn.ffcs.tsp.msa.mybatis.service.farenXz.IFarenXzService;
import cn.ffcs.tsp.msa.mybatis.service.farenXzq.IFarenXzqService;
import cn.ffcs.tsp.msa.mybatis.service.manual.IManualService;
import cn.ffcs.tsp.msa.mybatis.service.scatter.IScatterService;

@RefreshScope
@RestController
public class SpringbootMaybatisController implements ISpringbootMybatisClient{

	@Autowired
    DiscoveryClient discoveryClient;
	@Resource
	private IManualService manualService ;
	
	@Resource
	private IScatterService scatterService ;
	
	@Resource
	private IFarenGmService farenGmService ;
	
	@Resource
	private IFarenQylxService farenQylxService ;
	
	@Resource
	private IFarenXzService farenXzService ;
	
	@Resource
	private IFarenXzqService farenXzqService ;
	
	/**
	 * 查询所有
	 * @return
	 */
	@Override
	public List<ManualInfo> findAll(){
		return manualService.findAll();
	}
	
	/**
	 * 分页
	 */
	@Override
	public List<ManualInfo> ManualInfo(@RequestBody ManualInfoDTO dto){
		PageInfo<ManualInfo> pageInfo =  manualService.findByPage(dto);
		List<ManualInfo> list = pageInfo.getList() ;
		return list ;
		
		
	}
	

	/**
	 * 入库
	 */
	@Override
	public List<ScatterDTO> saveScatter(@RequestBody List<ScatterDTO> dto) {
		
		scatterService.saveScatter(dto) ;
		return null;
	}
	
	/**
	 * �������
	 * @param manualInfo
	 */
	//@PostMapping("/save.do")
	public void save(ManualInfo manualInfo){
		manualInfo.setAutoEnterpriseCode("SSS");
		manualInfo.setManualType("2") ;
		manualService.save(manualInfo);
	}
	
	
	//@GetMapping("/index.do")
	public String index(HttpServletRequest request,HttpSession session){
		session = request.getSession();
		session.setAttribute("loginTest", "loginTest");
		System.out.println("11111");
		return "index" ;
	}
	
	 public ManualInfo getObj(){
		 ManualInfo m = new ManualInfo() ;
		 m.setDowloadUrl("11111");
		 m.setManualName("");
		 System.out.println("11111");
		return m;
	 }
	 
	/**
	 * ���²���
	 * @param manualInfo
	 */
	public void update(ManualInfo manualInfo){
		manualService.update(manualInfo);
	}
	
	
	/**
	 * 
	 * ����id��ѯ
	 * @param id
	 * @return
	 */
	public ManualInfo findById(String id){
		return manualService.findById(id);
	}
	
	/**
	 * 
	 * ����ids��ѯ
	 */
	
	 public List<ManualInfo> findByIds(String[] ids){
		 return manualService.findByIds(ids);
	 }

	@Override
	public List<ScatterDTO> saveFarenQylx(@RequestBody List<FarenQylxDTO> dto) {
		farenQylxService.saveFarenQylx(dto) ;
		return null;
	}

	@Override
	public List<ScatterDTO> saveFarenGm(@RequestBody List<FarenGmDTO> dto) {
		farenGmService.saveFarenGm(dto) ;
		return null;
	}

	@Override
	public List<ScatterDTO> saveFarenXz(@RequestBody List<FarenXzDTO> dto) {
		farenXzService.saveFarenXz(dto) ;
		return null;
	}
	
	
	@Override
	public List<ScatterDTO> saveFarenXzq(@RequestBody List<FarenXzqDTO> dto) {
		farenXzqService.saveFarenXzq(dto) ;
		return null;
	}
	
}
