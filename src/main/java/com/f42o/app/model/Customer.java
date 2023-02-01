package com.f42o.app.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Customer implements Serializable {
	

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private String name;
	private int age;
	private String nationality;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(long id, String name, int age, String nationality) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	
	
}
