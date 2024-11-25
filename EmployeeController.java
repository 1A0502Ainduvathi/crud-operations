package com.example.spboot_curd.contoller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spboot_curd.entity.EmployeeEntity;
import com.example.spboot_curd.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@PostMapping("/api/create-employee")
	public String createEmployee(@RequestBody EmployeeEntity entity) {
		if(entity.getName().matches("[ ]+")){
			return "Give proper name";
		}
		else if(entity.getName().matches("[A-Z a-z]+")) {
		service.saveEmployee(entity);
		return "sussessfully created";
		}
		else {
			return "only alphabets allowed";
		}
	}
	@PutMapping("/api/employee-update")
	public String updateEmployee(@RequestBody EmployeeEntity entity) {
		service.updateEmployee(entity);
		return "Employee updated";
	}
	@GetMapping("/api/get-employee/{id}")
	public EmployeeEntity getEmployee(@PathVariable int id) {
		return service.getEmployee(id);
	}
	
	@GetMapping("/api/get-all-employees")
	public List<EmployeeEntity> getAllEmployees(){
		return service.getAllEmployees();
	}
	@DeleteMapping("/api/delete-employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
		return "Employee deleted";
	}

}
