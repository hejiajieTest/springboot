/**
 * FarenXzqMapper.java	  V1.0   2019年9月29日 上午11:26:58
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package cn.ffcs.tsp.msa.mybatis.mapper;

import java.util.List;

import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenXzqDTO;

public interface FarenXzqMapper {
	public void saveList(List<FarenXzqDTO> list);
}
