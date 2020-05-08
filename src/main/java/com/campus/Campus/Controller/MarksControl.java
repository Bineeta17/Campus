package com.campus.Campus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.Campus.Service.MarksService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/Marks")
@Api(value="Megha", tags= {"Marks Detail"})
public class MarksControl {
	
	@Autowired
	private MarksService service;

}
