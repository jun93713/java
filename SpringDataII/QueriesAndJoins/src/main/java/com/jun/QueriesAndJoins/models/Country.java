package com.jun.QueriesAndJoins.models;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="countries")
public class Country {
	@Id
	@GeneratedValue
	private Long id;
	private String code;
	private String name;
	private String continent;
	private String region;
	private Float surface_area;
	private Integer indep_year;
	private Integer population;
	private Float life_expectancy;
	private Float gnp;
	private Float gnp_old;
	private String local_game;
	private String government_form;
	private String head_of_state;
	private Integer capital;
	private String code2;
	@OneToMany(mappedBy="country", fetch=FetchType.LAZY)
	private List<Language> languages;
	@OneToMany(mappedBy="country", fetch=FetchType.LAZY)
	private List<City> cities;
	
	public Country() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Float getSurface_area() {
		return surface_area;
	}

	public void setSurface_area(Float surface_area) {
		this.surface_area = surface_area;
	}

	public int getIndep_year() {
		return indep_year;
	}

	public void setIndep_year(int indep_year) {
		this.indep_year = indep_year;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public Float getLife_expectancy() {
		return life_expectancy;
	}

	public void setLife_expectancy(Float life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

	public Float getGnp() {
		return gnp;
	}

	public void setGnp(Float gnp) {
		this.gnp = gnp;
	}

	public Float getGnp_old() {
		return gnp_old;
	}

	public void setGnp_old(Float gnp_old) {
		this.gnp_old = gnp_old;
	}

	public String getLocal_game() {
		return local_game;
	}

	public void setLocal_game(String local_game) {
		this.local_game = local_game;
	}

	public String getGovernment_form() {
		return government_form;
	}

	public void setGovernment_form(String government_form) {
		this.government_form = government_form;
	}

	public String getHead_of_state() {
		return head_of_state;
	}

	public void setHead_of_state(String head_of_state) {
		this.head_of_state = head_of_state;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	
}