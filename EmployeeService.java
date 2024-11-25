package com.example.spboot_curd.service;

import java.util.List;

import com.example.spboot_curd.entity.EmployeeEntity;

public interface EmployeeService {
	public void saveEmployee(EmployeeEntity entity);
public void updateEmployee(EmployeeEntity entity);

public EmployeeEntity getEmployee(int Id);
public List<EmployeeEntity> getAllEmployees();
public void deleteEmployee(int empId);

}
