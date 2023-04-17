package com.neosoft.StudentManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.StudentManagement.entity.Student;
import com.neosoft.StudentManagement.repository.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		Student save = studentRepo.save(student);
		return save;
	}

	
	@Override
	public Student getStudentById(Long id) {
		Optional<Student> findById = studentRepo.findById(id);
		Student student = findById.get();
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> findAll = studentRepo.findAll();
		
		return findAll;
	}

	@Override
	public Student updateStudent(Student student) {
		Student save = studentRepo.save(student);
		return save;
	}

	@Override
	public void deleteStudent(Long id) {
		
		studentRepo.deleteById(id);
	}

}
