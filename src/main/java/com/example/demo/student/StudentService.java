package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentService {
	@GetMapping
	public List<Student> getStudents() {
		return List.of(
			new Student(
				1L,
				"Student1",
				"Student1@gmail.com",
				LocalDate.of(2000, Month.FEBRUARY, 13),
				21
			)
		);
	}   
}
