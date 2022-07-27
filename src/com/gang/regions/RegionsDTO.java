package com.gang.regions;

public class RegionsDTO {
	//멤버변수명은 table의 컬럼명과 동일하게 선언
	private Integer region_id;
	private String region_name;
	
	public RegionsDTO(){
		region_id = this.getRegion_id();
		region_name = this.getRegion_name();
	}

	public Integer getRegion_id() {
		return region_id;
	}

	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	
	

}
