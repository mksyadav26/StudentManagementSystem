package com.manoj.sms.model.StudentServiceImpl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.manoj.sms.model.StudentRepository.StudentRepository;
import com.manoj.sms.model.StudentService.StudentService;
import com.manoj.sms.model.entity.Student;
@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
	
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
	
		return studentRepository.getById(id);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

	

}	
