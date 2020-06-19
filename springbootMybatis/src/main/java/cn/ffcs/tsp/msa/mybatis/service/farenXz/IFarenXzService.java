/**
 * IFarenXzService.java	  V1.0   2019年9月29日 上午11:16:13
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package cn.ffcs.tsp.msa.mybatis.service.farenXz;

import java.util.List;

import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenXzDTO;

public interface IFarenXzService {

	void saveFarenXz(List<FarenXzDTO> dto);

}
