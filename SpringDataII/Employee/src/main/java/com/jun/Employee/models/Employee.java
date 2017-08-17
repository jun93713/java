package com.jun.Employee.models;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	@OneToMany(mappedBy="manager", fetch = FetchType.LAZY)
	private List<Employee> employees;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="manager_id")
	private Employee manager;
	
	public Employee() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	
	
	
	
}
