package com.AutomationServer.DF.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class StudentService {

    public List<Student> getStudent(){
        Student s = new Student(
                1L,
                "ofir",
                "machlof",
                LocalDate.of(2000,9,15),
                27);
        return Stream.of(s).collect(Collectors.toList());
    }
}
