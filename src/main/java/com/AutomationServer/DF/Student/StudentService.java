package com.AutomationServer.DF.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    private StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public List<Student> getStudent(){
        return studentRepository.findAll();
//        Student s = new Student(
//                1L,
//                "ofir",
//                "machlof",
//                LocalDate.of(2000,9,15),
//                27);
//        return Stream.of(s).collect(Collectors.toList());
    }
}
