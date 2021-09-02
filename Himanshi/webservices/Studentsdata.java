package com;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Studentsdata {
	StudentService studentService = new StudentService();

// Get the data

@GetMapping("/mydata")
public String sayHello() {

return "Hey ! Everyone , This is Himanshi";
}

//Retrieve Students Info
@GetMapping("/studentdata")
public Students getDummyStudents() {
	Students s = new Students();
	s.setName("Himanshi");
	s.setClassname("Java");
	s.setEmail("himanshi@gmail.com");
	return s;
	
}

//Get by Id

@GetMapping("/personinforid/{id}")
public Students getDummyStudentsById(@PathVariable("id") Integer id) {

Students s = new Students();// creating java object

s.setId(id);
s.setName("Himanshi");
s.setClassname("Java");
s.setEmail("Himanshi10@gmail.com");
return s;
}

// add the person information POst

@PostMapping(value = "/insertpersondetails")
public Students insertDummyStudent(@RequestBody Students students) {
return studentService.addStudents(students); //calling the service
}


//update person info
@PutMapping("/update")
public Students updatestudentsInfo(@RequestBody Students students) {
return studentService.updateStudents(students);

}
//get list
@GetMapping("/getlist")
public List<Students> getDummyStudentsList() {
List<Students> listOfStudents = studentService.getAllStudentslist();
return listOfStudents;
}

//delete the data
@DeleteMapping("/delete/{id}")
public List<Students> deleteStudentById(@PathVariable Integer id) {
new StudentService().deleteStudents(id);
return new StudentService().getAllStudentslist();
}

}



