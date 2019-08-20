package cn.ffcs.tsp.msa.mybatis.service.manual.impl;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.ffcs.tsp.msa.mybatis.dto.ManualInfoDTO;
import cn.ffcs.tsp.msa.mybatis.entity.ManualInfo;
import cn.ffcs.tsp.msa.mybatis.mapper.ManualInfoMapper;
import cn.ffcs.tsp.msa.mybatis.service.manual.IManualService;

@Service 
public class ManualServiceImpl implements IManualService{

    @Autowired
	public ManualInfoMapper manualInfoMapper ;
    
	
	public List<ManualInfo> findAll() {
		List<ManualInfo> list = manualInfoMapper.findAll();
//		RedisUtil.remove("test");
		List<ManualInfo> list1 = new ArrayList<ManualInfo>() ;
		return list ;
	}

	@Override
	public PageInfo<ManualInfo> findByPage(ManualInfoDTO dto) {
		PageHelper.startPage(dto.getPageNum()-1, dto.getPageSize());
		List<ManualInfo> list = manualInfoMapper.findAll();	
		PageInfo<ManualInfo> pageInfo=new PageInfo<ManualInfo>(list);
		System.out.println(pageInfo.getTotal());
		return pageInfo;
	}
	
	@Override
	public ManualInfo findById(String id) {
		return manualInfoMapper.findById(id);
	}

	@Override
	public void save(ManualInfo manualInfo) {
		 manualInfoMapper.save(manualInfo) ;
	}

	@Override
	public void update(ManualInfo manualInfo) {
		manualInfoMapper.update(manualInfo) ;
	}

	@Override
	public List<ManualInfo> findByMap(Map<String, Object> map) {
		return manualInfoMapper.findByMap(map);
	}

	@Override
	public void saveList(List<ManualInfo> list) {
		manualInfoMapper.saveList(list);
	}

	@Override
	public List<ManualInfo> findByIds(String[] ids) {
		return manualInfoMapper.findByIds(ids);
	}

	@Override
	public void deleteByIds(List<Long> list) {
		manualInfoMapper.deleteByIds(list);
	}

	@Override
	public void updateByIds(List<String> list) {
		manualInfoMapper.updateByIds(list);
	}


}
