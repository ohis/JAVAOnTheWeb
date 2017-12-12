package com.codingdojo.models;

public class Player {
	private String firstname;
	private String lastname;
	private int age;
	
	public Player() {
		
	}
	
	public Player(String fname,String lname,int age) {
		this.firstname = fname;
		this.lastname = lname;
		this.age = age;
	}

 public String getFirstName() {
	 return firstname;
 }
 
 public void setFirstName(String fname) {
	 this.firstname = fname;
 }
 public String getLastName() {
	 return lastname;
 }
 public void setLastName(String lname) {
	 this.lastname = lname;
 }
 public int getAge() {
	 return age;
 }
 public void setAge(int age) {
	 this.age = age;
 }
}
