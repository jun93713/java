package com.jun.QueriesAndJoins.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.QueriesAndJoins.models.City;
@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
