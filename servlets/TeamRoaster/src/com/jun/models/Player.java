package com.jun.models;

public class Player {
	String first_name;
	String last_name;
	Integer age;
	
	public Player(String first_name, String last_name, Integer age) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
	}
	
	public String getFirstName() {
		return this.first_name;
	}
	
	public String getLastName() {
		return this.last_name;
	}
	
	public Integer getAge() {
		return this.age;
	}

}
