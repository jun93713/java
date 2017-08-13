package com.jun.DriverLicense.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.DriverLicense.models.Person;
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
