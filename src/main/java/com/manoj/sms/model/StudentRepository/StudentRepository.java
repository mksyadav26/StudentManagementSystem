package com.manoj.sms.model.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manoj.sms.model.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
