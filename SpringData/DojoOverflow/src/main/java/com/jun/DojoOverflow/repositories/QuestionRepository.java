package com.jun.DojoOverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.DojoOverflow.models.Question;
@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

}
