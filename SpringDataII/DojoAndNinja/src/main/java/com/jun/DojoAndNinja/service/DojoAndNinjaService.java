package com.jun.DojoAndNinja.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jun.DojoAndNinja.models.*;
import com.jun.DojoAndNinja.repositories.*;

@Service
public class DojoAndNinjaService {
	private DojoRepository dojoRepo;
	private NinjaRepository ninjaRepo;
	
	public DojoAndNinjaService(DojoRepository dojoRepo, NinjaRepository ninjaRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}
	
	public void addDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	
	public void addNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
	}
	
	public List<Dojo> findDojos(){
		return (List<Dojo>) dojoRepo.findAll();
	}
	
	public Dojo findDojo(Long id) {
		return dojoRepo.findOne(id);
	}
	
	public List<Ninja> findNinjasByDojo(long id){
		return ninjaRepo.findByDojo_id(id);
	}
}
