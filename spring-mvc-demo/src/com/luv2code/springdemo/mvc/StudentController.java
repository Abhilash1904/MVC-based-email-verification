package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Student")
public class StudentController {
	
	@RequestMapping("/getForm")
	public String getForm(Model theModel) {
		
		Student student=new Student();
		
		theModel.addAttribute("student", student);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent ) {
		return "student-confirmation";
	}

}
