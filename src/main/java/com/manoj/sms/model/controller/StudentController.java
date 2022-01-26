package com.manoj.sms.model.controller;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.manoj.sms.model.StudentService.StudentService;
import com.manoj.sms.model.entity.Student;


@Controller
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) 
	{
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
      public String listStudent(Model model) 
      {
		model.addAttribute("students", studentService.getAllStudent());
		return "students";
		
      }
	@GetMapping("/students/new")
	public String createNewForm(Model model)
	{
		Student student = new Student();
		model.addAttribute("students", student);
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@Valid @ModelAttribute ("students") Student student)
	{
             studentService.saveStudent(student);
             return "redirect:/students";
		
	}

	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model)
	{
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student"; 
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,@Valid @ModelAttribute("student") Student student,Model model)
	{
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirst_Name(student.getFirst_Name());
		existingStudent.setLast_Name(student.getLast_Name());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setStandard(student.getStandard());
		existingStudent.setSubject(student.getSubject());
		existingStudent.setFees(student.getFees());
		existingStudent.setBalance(student.getBalance());
		
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id)
	{
		studentService.deleteStudentById(id);
		return "redirect:/students";
		
	}
}
	
	

