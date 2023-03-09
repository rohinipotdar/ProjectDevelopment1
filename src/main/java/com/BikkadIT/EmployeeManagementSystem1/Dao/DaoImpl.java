package com.BikkadIT.EmployeeManagementSystem1.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BikkadIT.EmployeeManagementSystem1.model.EmpModel;

import jakarta.persistence.Query;

@Repository
public class DaoImpl implements DaoI{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public int saveEmployee(EmpModel empModel) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		int save = (int) session.save(empModel);
		
		session.getTransaction().commit();

		return save;
	}


	
	
	@Override
	public List<EmpModel> getallEmp() {

		Session session = sessionFactory.openSession();
		
		String str = "from EmpModel";
		Query qur = session.createQuery(str);
		List <EmpModel> list = qur.getResultList();
		
		
		return list;
	}

}
