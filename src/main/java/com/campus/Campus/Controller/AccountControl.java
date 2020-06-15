package com.campus.Campus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.campus.Campus.Model.Account;
import com.campus.Campus.Model.Student;
import com.campus.Campus.Service.AccountService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/Account")
@Api(value="Megha", tags= {"Account Detail"})
public class AccountControl {

	@Autowired
	private AccountService service;

	@PostMapping("/")
	public Account payFees(@RequestBody Student student,@RequestParam String modeOfPayment,@RequestParam String batch)
	{
		return service.payFee(student,modeOfPayment,batch);
	}
}
