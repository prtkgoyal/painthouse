package com.painthouse.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Painter")
public class Painter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cid;

	@Column(name = "Name", length = 40, nullable = false)
	private String name;

	@Column(name = "Age", length = 2, nullable = false)
	private String age;

	@Column(name = "City", length = 40, nullable = false)
	private String city;

	@Column(name = "Contact_No", length = 10, nullable = false, unique = true)
	private String contactNo;

	@Column(name = "Commission", length = 8, nullable = false)
	private int commission;
	
	private String email;

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
}
