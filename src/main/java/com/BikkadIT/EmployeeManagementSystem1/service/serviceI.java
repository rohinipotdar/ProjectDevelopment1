package com.BikkadIT.EmployeeManagementSystem1.service;

import java.util.List;

import com.BikkadIT.EmployeeManagementSystem1.model.EmpModel;

public interface serviceI {
	
	public int saveEmployee(EmpModel empModel);
	
	public List<EmpModel> getallEmp();

}
