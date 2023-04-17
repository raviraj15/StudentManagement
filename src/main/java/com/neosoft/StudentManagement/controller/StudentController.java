package com.neosoft.StudentManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.StudentManagement.entity.Student;
import com.neosoft.StudentManagement.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student)
	{
		Student saveStudent = service.saveStudent(student);
		
		return new ResponseEntity<>(saveStudent,HttpStatus.CREATED);
	}
	
	@GetMapping("/getStudent/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Long id)
	{
		Student studentById = service.getStudentById(id);
		return new ResponseEntity<Student>(studentById,HttpStatus.OK);
	}
	
	@PutMapping("/updateStudent")
	public ResponseEntity<Student> upddateStudent(@RequestBody Student student)
	{
		Student updateStudent = service.updateStudent(student);
		
		return new ResponseEntity<Student>(updateStudent,HttpStatus.CREATED);
	}
	@GetMapping("/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		
		List<Student> allStudents = service.getAllStudents();
		
		return new ResponseEntity<List<Student>>(allStudents,HttpStatus.OK);
	}
	@DeleteMapping("/deleteStudent/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Long id)
	{
		service.deleteStudent(id);
		return new ResponseEntity<String>("student record deleted successfully", HttpStatus.OK);
		
	}
}

















