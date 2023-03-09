package com.BikkadIT.EmployeeManagementSystem1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.EmployeeManagementSystem1.Dao.DaoI;
import com.BikkadIT.EmployeeManagementSystem1.model.EmpModel;

@Service
public class serviceImpl implements serviceI{

	@Autowired
	private DaoI daol;
	
	@Override
	public int saveEmployee(EmpModel empModel) {
		
		int id= daol.saveEmployee(empModel);
		
		return id;
	}

	@Override
	public List<EmpModel> getallEmp() {
		List<EmpModel> allEmp = daol.getallEmp();
		return allEmp;
	}
	
	
	
	

	
}
