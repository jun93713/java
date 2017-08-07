package com.jun.models;

public class Dogs extends Animal implements Pets {

	public Dogs(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}

	@Override
	public String showAffection() {
		if(this.weight < 30) {
			return String.format("You created a %s! %n %s hopped into your lap and cuddle you!", this.breed, this.name);
		}
		else {
			return String.format("You created a %s! %n %s curled up next to you!", this.breed, this.name);
		}
	}

}
