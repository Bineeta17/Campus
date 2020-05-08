	package com.campus.Campus.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="student")
public class Student {
	@Id
	int stu_id;
	@ApiModelProperty(notes="Name")
	String name;
	@ApiModelProperty(notes="Address")
	String address;
	@ApiModelProperty(notes="Phone")
	String phone;
	@ApiModelProperty(notes="Email")
	String email;
	@ApiModelProperty(notes="Dob_Date")
	String dob_date;
	@ApiModelProperty(notes="Doj_Date")
	String doj_date;
	@ApiModelProperty(notes="Qualification")
	String qualification;
	@ApiModelProperty(notes="Criteria")
	float criteria;
	@ApiModelProperty(notes="Password")
	String password;
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob_date() {
		return dob_date;
	}
	public void setDob_date(String dob_date) {
		this.dob_date = dob_date;
	}
	public String getDoj_date() {
		return doj_date;
	}
	public void setDoj_date(String doj_date) {
		this.doj_date = doj_date;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public float getCriteria() {
		return criteria;
	}
	public void setCriteria(float criteria) {
		this.criteria = criteria;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
