package com.painthouse.data_transfer_object;

import javax.persistence.Column;

public class Dataa {

	private String name;
	
	private String age;
	
	private String city;
	
	private String contactNo;
	
	private int commission;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age=age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo=contactNo;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission ) {
		this.commission= commission;
	}
	

}
