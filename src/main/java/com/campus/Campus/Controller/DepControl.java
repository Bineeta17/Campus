package com.campus.Campus.Controller;

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

import com.campus.Campus.Model.Department;
import com.campus.Campus.Service.DepService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Department")
@Api(value="Megha", tags= {"Department Data"})
public class DepControl {
	
	@Autowired
	private DepService service;
	
	@ApiOperation(value="Post data")
	@PostMapping("/")
	public Department add(@RequestBody Department dept) {
		return service.add(dept);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteDept(@PathVariable int id) {
		service.deleteDepartment(id);
	}
	
	@GetMapping("/getAll")
	public List<Department> getDept()
	{
		return service.getDept();
	}
	
	@GetMapping("/get/{id}")
	public int getDepartment(@PathVariable int id) {
		
		return service.getDepartmentName(id);
	}
	
	@PutMapping("/update/{d_id}")
	public Department updateName(@RequestBody Department dept)
	{
		return service.update(dept);
	}
	
	
	
	

}
