package com.example.spboot_curd.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.spboot_curd.entity.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity,Integer>{

	

}
