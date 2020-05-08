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

import com.campus.Campus.Model.Staff;
import com.campus.Campus.Service.StaffService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Staff")
@Api(value="Megha", tags= {"Staff Data"})
public class StaffControl {
	@Autowired
	StaffService service;
	
	@ApiOperation(value="Post data")
	@PostMapping("/")
	public Staff PostAllStaff(@RequestBody Staff staff)
	{
		return service.AddStaff(staff);
	}
	
	@GetMapping("/getAll")
	public List<Staff> GetAll()
	{
		return service.GetStaff();
	}
	
	@PutMapping("/staffupdate/{name}")
	public Staff UpdateStu(@RequestBody Staff staff)
	{
		return service.Update(staff);
	}
	
	@GetMapping("/staffgetid/{staff_id}")
	public Staff GetByIdSt(@PathVariable int staff_id)
	{
		return service.GetById(staff_id);
	}
	
	@DeleteMapping("/staffdeleteall")
	public Staff DeleteAllStu(@RequestBody Staff staff)
	{
		return service.DeleteAll(staff);
	}
	
	@DeleteMapping("/deletestaff/{staff_id}")
	public void DeleteByIdStaff(@PathVariable int staff_id)
	{
		service.DeleteById(staff_id);
	}
}
