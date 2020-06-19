/**
 * IFarenQylxService.java	  V1.0   2019年9月29日 上午11:16:04
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package cn.ffcs.tsp.msa.mybatis.service.farenQylx;

import java.util.List;

import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenQylxDTO;

public interface IFarenQylxService {

	void saveFarenQylx(List<FarenQylxDTO> dto);

}
