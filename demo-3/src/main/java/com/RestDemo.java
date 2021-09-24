package com;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemo {

PersonService personService = new PersonService();

 // Get call using spring based web service

 @GetMapping("/myurl")
public String sayHello() {

 return "hi how are you";	
}

// Retrieve person info USing @GET MEthod
@GetMapping("/personinfo")
public Person getDummyPerson() {

 Person p = new Person();// creating java object
p.setName("Ram");
p.setEmail("Ram@gmail.com");
p.setAddress("delhi");
return p;
}

 // Retrieve the person information by id

 @GetMapping("/personinforid/{id}")
public Person getDummyPersonById(@PathVariable("id") Integer id) {

 Person p = new Person();// creating java object

 p.setId(id);
p.setName("Ram");
p.setEmail("Ram@gmail.com");
p.setAddress("delhi");
return p;
}


 // add the person information POst

 @PostMapping(value = "/insertpersondetails")
public Person insertDummyPerson(@RequestBody Person person) {
return personService.addPerson(person); //calling the service
}

//update person info
@PutMapping("/update")
public Person updatepersonInfo(@RequestBody Person person) {
return personService.updatePerson(person);

 }
//get list
@GetMapping("/getlist")
public List<Person> getDummyPersonList() {
List<Person> listOfPerson = personService.getAllPersonlist();
return listOfPerson;
}

}