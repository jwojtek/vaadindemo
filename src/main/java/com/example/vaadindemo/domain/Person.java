package com.example.vaadindemo.domain;

import java.util.UUID;

public class Person {
	
	private UUID id;
	
	private String firstName;
	
	private int yob;
	
	private String lastName;
	
	private String pozycja;
	
	private int numer;
	
	public Person(String firstName, String lastName, int yob, String pozycja, int numer) {
		super();
		this.firstName = firstName;
		this.yob = yob;
		this.lastName = lastName;
		this.pozycja = pozycja;
		this.numer = numer;
	}

	public Person() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getYob() {
		return yob;
	}

	public void setYob(int yob) {
		this.yob = yob;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", yob=" + yob
				+ ", lastName=" + lastName + ", pozycja=" + pozycja + "]";
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getPozycja() {
		return pozycja;
	}

	public void setPozycja(String pozycja) {
		this.pozycja = pozycja;
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}
	
}
