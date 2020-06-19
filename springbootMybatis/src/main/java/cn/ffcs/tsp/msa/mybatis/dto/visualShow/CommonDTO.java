/**
 * CommonDTO.java	  V1.0   2019年9月29日 上午10:56:14
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package cn.ffcs.tsp.msa.mybatis.dto.visualShow;

import java.io.Serializable;

public class CommonDTO implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1718165918884198444L;
	private String name ;
	private Integer value ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
	
}
