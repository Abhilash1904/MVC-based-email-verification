package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/get-form")
	String getForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	String processForm() {
		return "helloworld";
	}
	

	@RequestMapping("/get-employee-form")
	String getEmployeeForm() {
		return "EmployeeValidation-form";
	}
	

}
