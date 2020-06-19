package cn.ffcs.tsp.msa.mybatis.service.scatter.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.ffcs.tsp.msa.mybatis.dto.ScatterDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenGmDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenQylxDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenXzDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenXzqDTO;
import cn.ffcs.tsp.msa.mybatis.entity.Scatter;
import cn.ffcs.tsp.msa.mybatis.mapper.ScatterMapper;
import cn.ffcs.tsp.msa.mybatis.service.scatter.IScatterService;

@Service
public class ScatterServiceImpl implements IScatterService{

	@Resource
	private ScatterMapper scatterMapper ;
	
	@Override
	public void saveScatter(List<ScatterDTO> list) {
		List<Scatter> saveList = new ArrayList<Scatter>() ;
		for(ScatterDTO scatterDTO: list){
			Scatter scatter = new Scatter() ;
			//scatter.setX(scatterDTO.getCoordinates()[0]);
			//scatter.setY(scatterDTO.getCoordinates()[1]);
			scatter.setName(scatterDTO.getName());
			scatter.setValue(scatterDTO.getValue());
			saveList.add(scatter) ;
		}
		scatterMapper.saveList(saveList);
	}

}
