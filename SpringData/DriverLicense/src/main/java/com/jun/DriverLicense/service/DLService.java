package com.jun.DriverLicense.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.jun.DriverLicense.repositories.*;
import com.jun.DriverLicense.models.*;
@Service
public class DLService {
	private PersonRepository personRepo;
	private LicenseRepository licenseRepo;
	public DLService(PersonRepository personRepo, LicenseRepository licenseRepo) {
		this.personRepo = personRepo;
		this.licenseRepo = licenseRepo;
	}
	
	public void addPerson(Person person) {
		personRepo.save(person);
	}
	
	public void addLicense(License license) {
		System.out.println(license.getNumber());
		licenseRepo.save(license);
	}
	
	public List<Person> findPersons(){
		return (List<Person>) personRepo.findAll();
	}
	
	public Person findPerson(Long id) {
		return personRepo.findOne(id);
	}
}
