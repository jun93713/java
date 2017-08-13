package com.jun.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.lookify.models.Lookify;
@Repository
public interface LookifyRepository extends CrudRepository<Lookify, Long> {
	List<Lookify> findTop10ByOrderByRatingDesc();
	
	List<Lookify> findByArtistContaining(String search);
}
