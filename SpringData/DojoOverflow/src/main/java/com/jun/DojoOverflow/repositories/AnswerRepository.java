package com.jun.DojoOverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.DojoOverflow.models.Answer;
@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {

}
