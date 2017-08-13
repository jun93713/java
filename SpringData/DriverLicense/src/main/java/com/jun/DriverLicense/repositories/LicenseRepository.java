package com.jun.DriverLicense.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.DriverLicense.models.License;
@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {

}
