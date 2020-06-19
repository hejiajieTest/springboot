package cn.ffcs.tsp.msa.mybatis.entity;


import java.io.Serializable;

public class Scatter implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4733643892642668161L;
	private Double x ;
	private Double y ;
	private String name ;
	private Integer value ;
	
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		this.y = y;
	}
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
