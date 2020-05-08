package com.campus.Campus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.Campus.Service.ResultService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/Result")
@Api(value="Megha", tags= {"Result Detail"})
public class ResultControl {
	
	@Autowired
	private ResultService service;

}
