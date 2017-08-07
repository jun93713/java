package com.jun.models;

public class Cats extends Animal implements Pets {

	public Cats(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	@Override
	public String showAffection() {
		return String.format("Your %s cat, %s, looked at you with some affection, you think", this.breed, this.name);
	}

}
