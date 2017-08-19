package com.jun.Events.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.Events.models.Event;
@Repository
public interface EventRepository extends CrudRepository<Event, Long> {

}
