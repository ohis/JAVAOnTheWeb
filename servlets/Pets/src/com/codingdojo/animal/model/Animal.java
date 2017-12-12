package com.codingdojo.animal.model;

public class Animal implements pet {
	private String name;
	private String breed;
	private int weight;
	
	public Animal() {
		
	}
	
	public Animal(String name,String breed, int weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getBreed() {
		return this.breed;
	}
	
	public void setWeight(int w) {
		this.weight = w;
	}
	
	public int getWeight() {
		return this.weight;
	}

	@Override
	public String showAffection() {
	
		return null;
	}

}
