package cn.ffcs.tsp.msa.mybatis.dto;

public class ScatterDTO {

	private Double[] coordinates ;
	private String name ;
	private Integer value ;
	public Double[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Double[] coordinates) {
		this.coordinates = coordinates;
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
