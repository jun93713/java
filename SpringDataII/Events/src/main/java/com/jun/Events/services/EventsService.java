package com.jun.Events.services;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jun.Events.models.Event;
import com.jun.Events.models.Message;
import com.jun.Events.models.User;
import com.jun.Events.repositories.EventRepository;
import com.jun.Events.repositories.MessageRepository;
import com.jun.Events.repositories.UserRepository;




@Service
public class EventsService {
	private UserRepository userRepository;
	private EventRepository eventRepository;
	private MessageRepository messageRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public EventsService(UserRepository userRepository, EventRepository eventRepository, MessageRepository messageRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userRepository = userRepository;
		this.eventRepository = eventRepository;
		this.messageRepository = messageRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.save(user);
	}
	
	public User findByEmail(String email) {
		return userRepository.findByUsername(email);
	}
	
	public void saveEvent(Event event) {
		eventRepository.save(event);
	}
	
	public List<Event> allEvents(){
		return (List<Event>) eventRepository.findAll();
	}
	
	public Event eventDetail(Long id) {
		return eventRepository.findOne(id);
	}
	
	public void saveMessage(Message message) {
		messageRepository.save(message);
	}
	
	public void updateEvent(Long id, Event newEvent) {
		Event event = eventRepository.findOne(id);
		System.out.println(event.getLocation());
		event.setName(newEvent.getName());
		event.setDate(newEvent.getDate());
		event.setLocation(newEvent.getLocation());
		event.setState(newEvent.getState());
		eventRepository.save(event);
	}
	
	public void deleteEvent(Long id) {
		messageRepository.delete(messageRepository.findAllByEvent_id(id));
		eventRepository.delete(id);
	}
	
	public void joinEvent(Long id, Long userid) {
		Event event = eventRepository.findOne(id);
		User user = userRepository.findOne(userid);
		event.getUsers().add(user);
		eventRepository.save(event);
		//user.getEvents().add(event);
		//userRepository.save(user);
	}
	
	public void cancelEvent(Long id, Long userid) {
		Event event = eventRepository.findOne(id);
		User user = userRepository.findOne(userid);
		event.getUsers().remove(user);
		eventRepository.save(event);
		user.getEvents().remove(event);
		userRepository.save(user);
	}

}
