package com.campus.Campus.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.Campus.Dao.CourseDao;
import com.campus.Campus.Model.Course;

@Service
public class CourseService {

	@Autowired
  private CourseDao dao;
	
	
	public Course AddCourse(Course course)
	{ 
		dao.save(course);
		return course;
	}
	
	public List<Course> GetAll()
	{
		return dao.findAll();
	}
	public Course AddCo(Course course)
	{
		dao.save(course);
		return course;
	}
//	public int getCourseName(int c_id)
//	{
//		 dao.findById(c_id);
//		 return c_id;
//	}
	
	public Course Update(Course course)
	{
		return dao.save(course);
	}
	
	public void DeleteById(int c_id)
	{
		dao.deleteById(c_id);
	}
	

}
