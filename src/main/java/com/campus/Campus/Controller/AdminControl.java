package com.campus.Campus.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.Campus.Model.Admin;
import com.campus.Campus.Service.AdminService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Admin")
@Api(value="Megha", tags= {"Admin Data"})
public class AdminControl {
	@Autowired
	private AdminService service;
		
	@ApiOperation(value="Post data")
	@PostMapping("/")
	public Admin addAdmin(@RequestBody Admin admin)
	{
		return service.addAdmin(admin);
	}
	
//	@ApiOperation(value="Login Admin")
//	@GetMapping("/{id}/{password}")
//	public List<Admin> Login(@PathVariable String id,@PathVariable String password)
//	{
//		return service.Login(id, password);
//	}
}
