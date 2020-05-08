package com.campus.Campus.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.Campus.Model.Student;
import com.campus.Campus.Service.StuService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/Student")
@Api(value="Megha", tags= {"Student Data"})

public class StuControl {
	
	@Autowired
	private StuService service;
	
	@ApiOperation(value="Post data")
	@PostMapping("/")
	public Student Register(@RequestBody Student stu)
	{
		return service.AddStudent(stu);
	}
	
	@ApiOperation(value="Get all data ")
	@ApiResponses(
			value= {
					@ApiResponse(code=100,message="100 is the message"),
					@ApiResponse(code=200,message="Successfully succeed")
			})
	@GetMapping("/")
	public List<Student> GetAllStu()
	{
		return service.GetAll();
	}
	
	@ApiOperation(value="Update data by name")
	@PutMapping("/{name}")
	public Student UpdateStu(@RequestBody Student stu)
	{
		return service.Update(stu);
	}
	
	@ApiOperation(value="Get data by Id")
	@GetMapping("/{stu_id}")
	public Student GetByIdStu(@PathVariable int stu_id)
	{
		return service.GetById(stu_id);
	}
	
//	@ApiOperation(value="Get data by Name")
//	@GetMapping("/{name}")
//	public Student GetByNameStu(@PathVariable String name)
//	{
//		return service.GetByName(name);
//	}
	
	@ApiOperation(value="Delete All data")
	@DeleteMapping("/deleteall")
	public Student DeleteAllStu(@RequestBody Student stu)
	{
		return service.DeleteAll(stu);
	}

	@ApiOperation(value="Delete data by Id")
	@DeleteMapping("/{stu_id}")
	public void DeleteByIdStu(@PathVariable int stu_id)
	{
		service.DeleteById(stu_id);
	}
}
