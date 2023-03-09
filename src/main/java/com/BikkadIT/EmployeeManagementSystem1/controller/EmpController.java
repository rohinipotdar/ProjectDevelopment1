package com.BikkadIT.EmployeeManagementSystem1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.BikkadIT.EmployeeManagementSystem1.model.EmpModel;
import com.BikkadIT.EmployeeManagementSystem1.service.serviceI;


@Controller
public class EmpController {
	
	@Autowired
	private serviceI service;

	
	public EmpController() {

		System.out.println("Employee class constructor");
		
	}

	@GetMapping("/Employee")
	public String Employee() {
		
		return "EmpInfo";
		
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(EmpModel empModel, Model model) {
		int eid = service.saveEmployee(empModel);
		model.addAttribute("EMPID",empModel);
		
		return "view";
		
		}

	@GetMapping("/allEMP")
	public String getallEmp(Model model){
		List<EmpModel> list = service.getallEmp();
		model.addAttribute("EmployeeList",list);
		return "allEmp";
		
	}

}
