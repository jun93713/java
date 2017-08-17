package com.jun.QueriesAndJoins.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.QueriesAndJoins.models.City;
import com.jun.QueriesAndJoins.models.Country;
import com.jun.QueriesAndJoins.models.Language;
@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
	
	//1
	@Query("SELECT c FROM Country c JOIN c.languages l WHERE language = ?1 ORDER BY l.percentage DESC")
	List<Country> findCountriesByLanguage(String language);
	
	//2
	@Query("SELECT c FROM Country c ORDER BY SIZE(c.cities) DESC")
	List<Country> findCountriesOrderByCitiesDesc();
	
	//3
	@Query("SELECT c FROM City c JOIN c.country cc WHERE cc.name=?1 AND c.population > 500000 ORDER BY c.population DESC")
	List<City> findCitiesByCountryAndPopulationGreaterThan500000(String country);
	
	//4
	@Query("SELECT l FROM Language l JOIN l.country c WHERE percentage > 89.0 ORDER BY percentage DESC")
	List<Language> findLanguagesWherePercentageGreaterThanFloat();
	
	//5
	@Query("SELECT c FROM Country c WHERE surface_area < 501.0 AND population > 100000")
	List<Country> findCountriesLalala();
	
	//6
	@Query("SELECT c FROM Country c WHERE government_form = 'Constitutional Monarchy' AND capital > 200 AND life_expectancy > 75.0")
	List<Country> findForTask6();
	
	//7
	@Query("SELECT c FROM City c JOIN c.country cc WHERE district='Buenos Aires' AND c.population > 500000")
	List<City> task7();
}
