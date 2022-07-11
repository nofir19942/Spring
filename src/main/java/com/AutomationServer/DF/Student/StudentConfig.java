package com.AutomationServer.DF.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.Month.JUNE;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository rep){
      return args -> {
          Student ofir = new Student(
                1L,
                "ofir",
                "machlof",
                LocalDate.of(2000, JUNE,15),
                27);
          Student koral = new Student(
                2L,
                "koral",
                "machlof",
                LocalDate.of(2000, JUNE,15),
                27);
          rep.saveAll(Stream.of(ofir,koral).collect(Collectors.toList()));
        };
    }
}
