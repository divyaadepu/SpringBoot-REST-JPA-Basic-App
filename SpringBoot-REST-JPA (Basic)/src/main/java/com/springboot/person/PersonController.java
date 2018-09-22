package com.springboot.person;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	private PersonService personservice;
	
	
	@RequestMapping("/persons")
	public List<Person> getAllPersons()
	{
		return personservice.getAllPersons();
	}
	
	@RequestMapping(value="/persons/{id}",method=RequestMethod.GET)
	public Optional<Person> getPerson(@PathVariable  String id)
	{
		return personservice.getPerson(id);
	}
	
	@RequestMapping(value="/persons",method=RequestMethod.POST)
	public void addPerson(@RequestBody  Person person)
	{
		personservice.addPerson(person);
	}
	
	@RequestMapping(value="/persons/{id}",method=RequestMethod.PUT)
	public void updatePerson(@RequestBody  Person person,@PathVariable String id)
	{
		personservice.updatePerson(person,id);
	}
	
	@RequestMapping(value="/persons/{id}",method=RequestMethod.DELETE)
	public void deletePerson(@PathVariable String id)
	{
		personservice.deletePerson(id);
	}
}
