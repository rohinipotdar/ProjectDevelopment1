package com.BikkadIT.EmployeeManagementSystem1.Dao;

import java.util.List;

import com.BikkadIT.EmployeeManagementSystem1.model.EmpModel;

public interface DaoI {
	
	public int saveEmployee(EmpModel empModel);

	public List<EmpModel> getallEmp();

}
