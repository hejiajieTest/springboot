/**
 * FarenGmServiceImpl.java	  V1.0   2019年9月29日 上午11:19:21
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package cn.ffcs.tsp.msa.mybatis.service.farenXzq.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenXzqDTO;
import cn.ffcs.tsp.msa.mybatis.mapper.FarenXzqMapper;
import cn.ffcs.tsp.msa.mybatis.service.farenXzq.IFarenXzqService;

@Service
public class FarenXzqServiceImpl implements IFarenXzqService{
	
	@Resource
	private FarenXzqMapper farenXzqMapper ;
	
	@Override
	public void saveFarenXzq(List<FarenXzqDTO> list) {
		List<FarenXzqDTO> saveList = new ArrayList<FarenXzqDTO>() ;
		for(FarenXzqDTO scatterDTO: list){
			FarenXzqDTO scatter = new FarenXzqDTO() ;
			//scatter.setX(scatterDTO.getCoordinates()[0]);
			//scatter.setY(scatterDTO.getCoordinates()[1]);
			scatter.setName(scatterDTO.getName());
			scatter.setValue(scatterDTO.getValue());
			saveList.add(scatter) ;
		}
		farenXzqMapper.saveList(saveList);
	}

}
