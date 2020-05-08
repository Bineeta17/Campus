package com.campus.Campus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.Campus.Service.FeesService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/Fees")
@Api(value="Megha", tags= {"Fees Detail"})
public class FeesControl {
	
	@Autowired 
	private FeesService service;

}
