package com.fumie.license.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fumie.license.models.Person;
import com.fumie.license.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository pRepo;
	
	public PersonService(PersonRepository repo) {
		this.pRepo = repo;
	}
	public List<Person> getAllPersons(){
		return this.pRepo.findAll();
	}
	public Person getSinglePerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	public Person createPerson(Person person) {
		return this.pRepo.save(person);
	}
	public void deletePerson(Long id) {
		this.pRepo.deleteById(id);
	}
	public void updateLanguage(Long id, Person person) {
		this.pRepo.save(person);
	}
}

