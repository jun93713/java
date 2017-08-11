package com.jun.GroupLanguages.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.jun.GroupLanguages.models.Language;
import com.jun.GroupLanguages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private List<Language> languages = new ArrayList<>();
	private LanguageRepository languageRepository;

	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	
	public List<Language> allLanguages(){
		return (List<Language>) languageRepository.findAll();
	}
	
	public void addLanguage(Language language) {
		languageRepository.save(language);
	}
	
	public Language find(Long id) {
		return languageRepository.findOne(id);
	}
	
	public void update(Language language) {
		languageRepository.save(language);
	}
	
	public void delete(Long id) {
		languageRepository.delete(id);
	}
}
