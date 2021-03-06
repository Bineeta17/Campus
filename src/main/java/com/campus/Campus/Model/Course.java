package com.campus.Campus.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int c_id;
	@ApiModelProperty(notes = "Name")
	String c_name;


	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="course_c_id")
	@JsonIgnore
	private List<Student> stu;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_c_id")
	@JsonIgnore
	private List<Account> account;
	
	@OneToOne
	@JoinColumn(name = "fee_id")
	private Fees fee;
	
	public List<Student> getStu() {
		return stu;
	}

	public void setStu(List<Student> stu) {
		this.stu = stu;
	}
	
	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_name() {
		return c_name;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public Fees getFee() {
		return fee;
	}

	public void setFee(Fees fee) {
		this.fee = fee;
	}
	

}
