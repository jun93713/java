package com.jun.DojoAndNinja.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.DojoAndNinja.models.Dojo;
@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {

}
