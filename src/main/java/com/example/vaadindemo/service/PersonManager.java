package com.example.vaadindemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.vaadindemo.domain.Person;

public class PersonManager {
	
	private List<Person> db = new ArrayList<Person>();
	
	public void addPerson(Person person){
		// Dodawanie
		Person p = new Person(person.getFirstName(), person.getLastName(), person.getYob(), person.getPozycja(), person.getNumer());
		p.setId(UUID.randomUUID());
		db.add(p);
	}
	
	public List<Person> findAll(){
		return db;
	}

	public void delete(Person person) {
		// Usuwanie
		Person toRemove = null;
		for (Person p: db) {
			if (p.getId().compareTo(person.getId()) == 0){
				toRemove = p;
				break;
			}
		}
		db.remove(toRemove);		
	}

	public List<Person> updatePerson(Person person) {
		// Edycja
		for(Person p : db)
		{
			if(p.getId()==person.getId())
			{
				int index = db.indexOf(p);
				db.set(index, person);
			}
			}
		
			return db;
	}
}
