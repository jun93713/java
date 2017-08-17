package com.jun.Employee.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.Employee.models.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
