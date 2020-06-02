package com.campus.Campus.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="staff")
public class Staff {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int staff_id;
	@ApiModelProperty(notes="Name")
	String name;
	@ApiModelProperty(notes="Address")
	String address;
	@ApiModelProperty(notes="Phone_no")
	String phone_no;
	@ApiModelProperty(notes="Email")
	String email;
	@ApiModelProperty(notes="Qualification")
	String qualification;	
	@ApiModelProperty(notes="Experience")
	String experience;
	@ApiModelProperty(notes="DOB_Date")
	String dob_date;
	@ApiModelProperty(notes="DOJ_Date")
	String doj_date;
	
	@ManyToOne()
	@JsonIgnore
	Department dept;
	
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
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
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
		
	}
	
}
	
