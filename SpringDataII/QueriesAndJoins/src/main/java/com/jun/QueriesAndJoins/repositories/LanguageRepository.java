package com.jun.QueriesAndJoins.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.QueriesAndJoins.models.Country;
import com.jun.QueriesAndJoins.models.Language;
@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	
}
