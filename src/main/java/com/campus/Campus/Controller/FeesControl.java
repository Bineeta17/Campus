package com.campus.Campus.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.Campus.Model.Course;
import com.campus.Campus.Model.Fees;
import com.campus.Campus.Service.FeesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Fees")
@Api(value="Megha", tags= {"Fees Detail"})
public class FeesControl {
	
	@Autowired 
	private FeesService service;
	
	@ApiOperation(value="Add Fees")
	@PostMapping("/") 
	public Fees AddFees(@RequestBody Fees fee)
	{
		return service.AddFees(fee);
	}
	
	@ApiOperation(value="Get Fees")
	@GetMapping("/")
	public List<Fees> GetAllFees()
	{
		return service.GetAll();
	}
}
