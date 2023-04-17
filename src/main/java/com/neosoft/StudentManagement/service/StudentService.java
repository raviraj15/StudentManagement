package com.neosoft.StudentManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neosoft.StudentManagement.entity.Student;


public interface StudentService {

	public Student saveStudent(Student student);
	
	public Student getStudentById(Long id);
	
	public List<Student> getAllStudents();
	
	public Student updateStudent(Student student);
	
	public void deleteStudent(Long id);
	
	
}
