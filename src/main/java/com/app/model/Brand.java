package com.app.model;

//import javax.persistence.Entity;
//
//@Entity
public class Brand {
	public Brand(Integer id, String name) {
		super();
		this.brandId = id;
		this.name = name;
	}
	private Integer brandId;
	private String name;
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer id) {
		this.brandId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Brand [id=" + brandId + ", name=" + name + "]";
	}
	
}
