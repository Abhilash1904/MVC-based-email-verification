package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Employee")
public class EmployeeController {

	
	@RequestMapping("/get-employee-form")
	String getEmployeeForm(Model model) {
		//create employee object
		Employee emp= new Employee();
		//add employee object to model attribute
		model.addAttribute("employee", emp);
		return "EmployeeValidation-form";
	}
	
	@RequestMapping("/employeeProcessForm")
	String employeeProcessForm(@ModelAttribute("employee") Employee emp) {
		System.out.println(emp.name);
		System.out.println(emp.email);
		System.out.println(emp.re_email);
		if(!emp.email.equals(emp.re_email)) {
			System.out.println("not equal");
			return "error-employee";
		}
		else
		return "employeeProcess-Form";
	}
}
