/**
 * FarenGmServiceImpl.java	  V1.0   2019年9月29日 上午11:19:21
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package cn.ffcs.tsp.msa.mybatis.service.farenXz.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenXzDTO;
import cn.ffcs.tsp.msa.mybatis.mapper.FarenXzMapper;
import cn.ffcs.tsp.msa.mybatis.service.farenXz.IFarenXzService;

@Service
public class FarenXzServiceImpl implements IFarenXzService{
	
	@Resource
	private FarenXzMapper farenXzMapper ;
	@Override
	public void saveFarenXz(List<FarenXzDTO> list) {
		List<FarenXzDTO> saveList = new ArrayList<FarenXzDTO>() ;
		for(FarenXzDTO scatterDTO: list){
			FarenXzDTO scatter = new FarenXzDTO() ;
			//scatter.setX(scatterDTO.getCoordinates()[0]);
			//scatter.setY(scatterDTO.getCoordinates()[1]);
			scatter.setName(scatterDTO.getName());
			scatter.setValue(scatterDTO.getValue());
			saveList.add(scatter) ;
		}
		farenXzMapper.saveList(saveList);
	}


}
