package com.codingdojo.animal.model;

public class cat extends Animal{
	protected String name;
	protected String breed;
	protected int weight;
	public cat(String name, String breed, int weight) {
		super(name, breed, weight);
		this.name = this.getName();
		this.breed = breed;
		this.weight = weight;
		
	}
	
	public String showAffection() {
		//dog Dog = new dog();
		
		return "looked at you with  some affection";
	}

}
