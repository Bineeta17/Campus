package com.campus.Campus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.Campus.Service.AccountService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/Account")
@Api(value="Megha", tags= {"Account Detail"})
public class AccountControl {

	@Autowired
	private AccountService service;
}
