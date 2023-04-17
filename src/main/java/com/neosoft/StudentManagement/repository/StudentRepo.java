package com.neosoft.StudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.StudentManagement.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
