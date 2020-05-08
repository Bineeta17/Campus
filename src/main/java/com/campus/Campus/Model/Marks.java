package com.campus.Campus.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marks")
public class Marks {
	
	@Id
	int marks_id;
	String course;
	String semester;
	String subject;
	float marks;
	public int getMarks_id() {
		return marks_id;
	}
	public void setMarks_id(int marks_id) {
		this.marks_id = marks_id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	
	
	

}
