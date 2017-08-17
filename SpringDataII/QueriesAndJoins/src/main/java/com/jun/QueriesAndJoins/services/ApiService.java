package com.jun.QueriesAndJoins.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jun.QueriesAndJoins.models.City;
import com.jun.QueriesAndJoins.models.Country;
import com.jun.QueriesAndJoins.models.Language;
import com.jun.QueriesAndJoins.repositories.*;

@Service
public class ApiService {
	private CountryRepository countryRepository;
	private LanguageRepository languageRepository;
	private CityRepository cityRepository;
	
	public ApiService(CountryRepository countryRepository, LanguageRepository languageRepository, CityRepository cityRepository) {
		this.cityRepository = cityRepository;
		this.countryRepository = countryRepository;
		this.languageRepository = languageRepository;
	}
	
	public List<Country> findCountryByLang(String lang){
		return countryRepository.findCountriesByLanguage(lang);
	}
	
	public List<Country> findAllCountreisOrderByCitiesDesc(){
		return countryRepository.findCountriesOrderByCitiesDesc();
	}
	
	public List<City> task3(String country){
		return countryRepository.findCitiesByCountryAndPopulationGreaterThan500000(country);
	}
	
	public List<Language> task4(){
		return countryRepository.findLanguagesWherePercentageGreaterThanFloat();
	}
	
	public List<Country> task5(){
		return countryRepository.findCountriesLalala();
	}
	
	public List<Country> task6(){
		return countryRepository.findForTask6();
	}
	
	public List<City> task7(){
		return countryRepository.task7();
	}
	
	public List<Object[]> task8(){
		return countryRepository.task8();
	}
}
