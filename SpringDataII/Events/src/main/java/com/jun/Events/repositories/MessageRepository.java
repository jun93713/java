package com.jun.Events.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.Events.models.Message;
@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {

	List<Message> findAllByEvent_id(Long id);
}
