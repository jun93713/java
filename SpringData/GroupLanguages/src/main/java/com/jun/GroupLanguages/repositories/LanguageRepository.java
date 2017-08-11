package com.jun.GroupLanguages.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.GroupLanguages.models.Language;
@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {

}
