/**
 * FarenGmServiceImpl.java	  V1.0   2019年9月29日 上午11:19:21
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package cn.ffcs.tsp.msa.mybatis.service.farenQylx.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenQylxDTO;
import cn.ffcs.tsp.msa.mybatis.mapper.FarenQylxMapper;
import cn.ffcs.tsp.msa.mybatis.service.farenQylx.IFarenQylxService;

@Service
public class FarenQylxServiceImpl implements IFarenQylxService{

	@Resource
	private FarenQylxMapper farenQylxMapper ;
	@Override
	public void saveFarenQylx(List<FarenQylxDTO> list) {
		List<FarenQylxDTO> saveList = new ArrayList<FarenQylxDTO>() ;
		for(FarenQylxDTO scatterDTO: list){
			FarenQylxDTO scatter = new FarenQylxDTO() ;
			//scatter.setX(scatterDTO.getCoordinates()[0]);
			//scatter.setY(scatterDTO.getCoordinates()[1]);
			scatter.setName(scatterDTO.getName());
			scatter.setValue(scatterDTO.getValue());
			saveList.add(scatter) ;
		}
		farenQylxMapper.saveList(saveList);
	}

}
