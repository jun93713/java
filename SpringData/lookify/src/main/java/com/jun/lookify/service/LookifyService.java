package com.jun.lookify.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.jun.lookify.models.Lookify;
import com.jun.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	private LookifyRepository repo;
	
	public LookifyService(LookifyRepository repo) {
		this.repo = repo;
	}

	public List<Lookify> allSongs(){
		return (List<Lookify>) repo.findAll();
	}
	
	public void addSong(Lookify song) {
		repo.save(song);
	}
	
	public void delete(Long id) {
		repo.delete(id);
	}
	
	public void update(Lookify song) {
		repo.save(song);
	}
	
	public Lookify findSong(Long id) {
		return repo.findOne(id);
	}
	
	public List<Lookify> findTopTen(){
		return repo.findTop10ByOrderByRatingDesc();
	}
	
	public List<Lookify> searchArtist(String search){
		return repo.findByArtistContaining(search);
	}
}
