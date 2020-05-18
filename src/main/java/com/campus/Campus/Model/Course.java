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
	@GeneratedValue(strategy = GenerationType.AUTO)
	int c_id;
	@ApiModelProperty(notes = "Name")
	String c_name;


	@OneToOne(mappedBy = "course")
	@JsonIgnore
	private Student stu;

	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_c_id")
	private List<Account> account;

	@OneToOne
	@JoinColumn(name = "fee_id")
	private Fees fee;
	
	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}
	
	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public Fees getFee() {
		return fee;
	}

	public void setFee(Fees fee) {
		this.fee = fee;
	}

}
