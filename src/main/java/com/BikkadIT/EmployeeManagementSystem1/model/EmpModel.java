package com.BikkadIT.EmployeeManagementSystem1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Details")
public class EmpModel {

	@Id
	@Column(name="EmpID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	
	@Column(name="EmpName")
	private String ename;
	
	@Column(name="EmpAddress")
	private String eadd;
	
	@Column(name="EmpDesig")
	private String edesig;
	
	@Column(name="EmpSalary")
	private int salary;
	
	@Column(name="Email")
	private String email;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEadd() {
		return eadd;
	}

	public void setEadd(String eadd) {
		this.eadd = eadd;
	}

	public String getEdesig() {
		return edesig;
	}

	public void setEdesig(String edesig) {
		this.edesig = edesig;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmpModel [eid=" + eid + ", ename=" + ename + ", eadd=" + eadd + ", edesig=" + edesig + ", salary="
				+ salary + ", email=" + email + "]";
	}
	
}
