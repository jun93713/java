package com.jun.Employee.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jun.Employee.models.Employee;
import com.jun.Employee.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	private EmployeeRepository employeeRepository;
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public void newEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public List<Employee> allEm(){
		return (List<Employee>) employeeRepository.findAll();
	}
	
	public void addEmployeeToManager(Long mId, Long eId) {
		Employee manager = employeeRepository.findOne(mId);
		Employee employee = employeeRepository.findOne(eId);
		manager.getEmployees().add(employee);
		employee.setManager(manager);
		employeeRepository.save(manager);
		employeeRepository.save(employee);
	}
}
