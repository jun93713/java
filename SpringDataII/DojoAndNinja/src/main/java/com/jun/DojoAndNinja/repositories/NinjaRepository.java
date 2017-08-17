package com.jun.DojoAndNinja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.jun.DojoAndNinja.models.Ninja;
@Repository
public interface NinjaRepository extends PagingAndSortingRepository<Ninja, Long> {
	List<Ninja> findByDojo_id(Long id);
}
