package cn.ffcs.tsp.msa.mybatis.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

import cn.ffcs.tsp.msa.mybatis.client.ISpringbootMybatisClient;
import cn.ffcs.tsp.msa.mybatis.dto.ManualInfoDTO;
import cn.ffcs.tsp.msa.mybatis.entity.ManualInfo;
import cn.ffcs.tsp.msa.mybatis.service.manual.IManualService;

@RefreshScope
@RestController
public class ManualInfoController implements ISpringbootMybatisClient{

	@Autowired
    DiscoveryClient discoveryClient;
	@Resource
	private IManualService manualService ;
	
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
	public List<ManualInfo> ManualInfo(@RequestBody ManualInfoDTO dto){
		PageInfo<ManualInfo> pageInfo =  manualService.findByPage(dto);
		List<ManualInfo> list = pageInfo.getList() ;
		return list ;
		
		
	}
	
	/**
	 * �������
	 * @param manualInfo
	 */
	//@PostMapping("/save.do")
	public void save(ManualInfo manualInfo){
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
	 
	
}
