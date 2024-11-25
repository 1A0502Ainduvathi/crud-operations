package com.example.spboot_curd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spboot_curd.entity.EmployeeEntity;
import com.example.spboot_curd.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
private EmployeeRepository employeeRepository;
	@Override
	public void saveEmployee(EmployeeEntity entity) {
		employeeRepository.save(entity);
		
	}

	@Override
	public void updateEmployee(EmployeeEntity entity) {
		employeeRepository.save(entity);
		
	}

	@Override
	public EmployeeEntity getEmployee(int empId) {
		
		return employeeRepository.findById(empId).get();
	}

	@Override
	public List<EmployeeEntity> getAllEmployees() {
		List<EmployeeEntity> employeeList=new ArrayList<EmployeeEntity>();
		employeeRepository.findAll().forEach(employees->employeeList.add(employees));
		return employeeList;
	}

	@Override
	public void deleteEmployee(int empId) {
		employeeRepository.deleteById(empId);
	
		
	}

}
