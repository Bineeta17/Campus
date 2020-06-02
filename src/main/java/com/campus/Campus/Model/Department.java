package com.campus.Campus.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import io.swagger.annotations.ApiModelProperty;



@Entity
@Table(name="department")
public class Department {
	
	@Id
//	@Column(name="dept_d_id")
	private int d_id;
	@ApiModelProperty(notes="Name")
	private String d_name;
	
	
//	  @ManyToMany
//	    @JoinTable(
//	            name = "department_staff",
//	            joinColumns = {@JoinColumn(name = "department_d_id", referencedColumnName = "d_id")},
//	            inverseJoinColumns = {@JoinColumn(name = "staff_staff_id", referencedColumnName = "staff_id")}
//	    )
//	    private List<Staff> staff;

	
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
//	public List<Staff> getStaff() {
//		return staff;
//	}
//	public void setStaff(List<Staff> staff) {
//		this.staff = staff;
//	}
	
	
	

}
