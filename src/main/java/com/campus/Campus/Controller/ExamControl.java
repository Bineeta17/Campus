package com.campus.Campus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.Campus.Service.ExamService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/Exam")
@Api(value="Megha", tags= {"Exam Detail"})
public class ExamControl {
	
	@Autowired
	private ExamService service;

}
