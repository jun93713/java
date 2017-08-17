package com.jun.DojoOverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.DojoOverflow.models.Tag;
@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {

}
