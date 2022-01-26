package com.manoj.sms.model.StudentService;

import java.util.List;

import com.manoj.sms.model.entity.Student;

public interface StudentService {
	List<Student> getAllStudent();
	Student saveStudent(Student student);
	Student updateStudent(Student student);
	Student getStudentById(Long Id);
	void deleteStudentById(Long Id);

}
