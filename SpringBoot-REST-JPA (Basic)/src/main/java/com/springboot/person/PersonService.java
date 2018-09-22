package com.springboot.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepo;
	
	public List<Person> getAllPersons()
	{
		
		List<Person> persons=new ArrayList<>();
		personRepo.findAll()
		.forEach(persons::add);
		return persons;
		
	}


	public Optional<Person> getPerson(String id) {
		
		return personRepo.findById(id);
	}


	public void addPerson(Person person) {
		
		personRepo.save(person);
	}


	public void updatePerson(Person person, String id) {
		
		personRepo.save(person);
	}


	public void deletePerson(String id) {
		
		personRepo.deleteById(id);
	}
	
}
