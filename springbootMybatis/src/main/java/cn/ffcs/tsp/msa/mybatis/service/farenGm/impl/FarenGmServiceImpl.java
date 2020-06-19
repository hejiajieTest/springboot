/**
 * FarenGmServiceImpl.java	  V1.0   2019年9月29日 上午11:19:21
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package cn.ffcs.tsp.msa.mybatis.service.farenGm.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenGmDTO;
import cn.ffcs.tsp.msa.mybatis.mapper.FarenGmMapper;
import cn.ffcs.tsp.msa.mybatis.service.farenGm.IFarenGmService;

@Service
public class FarenGmServiceImpl implements IFarenGmService{

	@Resource
	private FarenGmMapper farenGmMapper ;
	
	@Override
	public void saveFarenGm(List<FarenGmDTO> list) {
		List<FarenGmDTO> saveList = new ArrayList<FarenGmDTO>() ;
		for(FarenGmDTO scatterDTO: list){
			FarenGmDTO scatter = new FarenGmDTO() ;
			//scatter.setX(scatterDTO.getCoordinates()[0]);
			//scatter.setY(scatterDTO.getCoordinates()[1]);
			scatter.setName(scatterDTO.getName());
			scatter.setValue(scatterDTO.getValue());
			saveList.add(scatter) ;
		}
		farenGmMapper.saveList(saveList);
	}

}
