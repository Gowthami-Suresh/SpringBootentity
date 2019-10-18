package xv.training.SpringBootentity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import xv.training.SpringBootentity.entities.Student;
import xv.training.SpringBootentity.repositories.StudentRepository;

@RestController
public class StudentControllers {

	@Autowired
	private StudentRepository studentRepository;

	@RequestMapping("/students")
	public Iterable<Student> getStudents() {
		return studentRepository.findAll();
	}

}
