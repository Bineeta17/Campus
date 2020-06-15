package com.campus.Campus.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int admin_id;
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
	@ApiModelProperty(notes="Experience")
	String experience;
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
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
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
}
