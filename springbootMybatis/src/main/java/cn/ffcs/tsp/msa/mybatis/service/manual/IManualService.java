package cn.ffcs.tsp.msa.mybatis.service.manual;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import cn.ffcs.tsp.msa.mybatis.dto.ManualInfoDTO;
import cn.ffcs.tsp.msa.mybatis.entity.ManualInfo;

public interface IManualService {

	List<ManualInfo> findAll() ;
	
	PageInfo<ManualInfo> findByPage(ManualInfoDTO dto);
	
	ManualInfo findById(String id) ;
	
	void save(ManualInfo manualInfo);

	void update(ManualInfo manualInfo);

	List<ManualInfo> findByMap(Map<String, Object> map);

	void saveList(List<ManualInfo> list);

	List<ManualInfo> findByIds(String[] ids);

	void deleteByIds(List<Long> list);

	void updateByIds(List<String> list);

	
}
