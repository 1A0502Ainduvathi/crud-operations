package com.example.spboot_curd.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;

@Entity
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empno;
	@Column
	private String name;
	@Column
	private String department;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [empno=" + empno + ", name=" + name + ", department=" + department + "]";
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public EmployeeEntity(int empno, String name, String department) {
		super();
		this.empno = empno;
		this.name = name;
		this.department = department;
	}
}
	
	

