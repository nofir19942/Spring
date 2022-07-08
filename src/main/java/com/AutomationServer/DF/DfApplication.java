package com.AutomationServer.DF;

import com.AutomationServer.DF.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class DfApplication {

	public static void main(String[] args) {

		SpringApplication.run(DfApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		Student s = new Student(
				1L,
				"ofir",
				"machlof",
				LocalDate.of(2000,9,15),
				27);
		return Stream.of(s).collect(Collectors.toList());
	}
}
