package com.campus.Campus.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.Campus.Model.Course;
import com.campus.Campus.Service.CourseService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Course")
@Api(value="Megha", tags= {"Course Detail"})

public class CourseControl {
	
	@Autowired
	CourseService service;
	
	@ApiOperation(value="Add Course")
	@PostMapping("/") 
	public Course AddCourse(@RequestBody Course course)
	{
		return service.AddCo(course);
	}

	//private CourseService service;

	
	@PostMapping("/addAll")
	public Course Register(@RequestBody Course course)
	{
		return service.AddCourse(course);
	}
	
	@ApiOperation(value="Get Course")
	@GetMapping("/")
	public List<Course> GetAllCourse()
	{
		return service.GetAll();
	}
	
//	@GetMapping("/get/{c_id}")
//	public int getCourse(@PathVariable int c_id) {
//		
//		return service.getCourseName(c_id);
//	}
	
	@PutMapping("/update/{course}")
	public Course UpdateCourse(@RequestBody Course course)
	{
		return service.Update(course);
	}
	
	@DeleteMapping("/delete/{c_id}")
	public void DeleteCourse(@PathVariable int c_id)
	{
		service.DeleteById(c_id);
	}
	
	
}
