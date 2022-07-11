package com.AutomationServer.DF.Student;

import javax.persistence.*;
import java.time.LocalDate;

@Entity //Hibernet
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_seq",
            sequenceName = "student_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_seq"
    )

    private long id;
    private String name;
    private String email;
    private LocalDate date;
    private int age;

    public Student() {
    }

    public Student(long id, String name, String email, LocalDate date, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.date = date;
        this.age = age;
    }

    public Student(String name, String email, LocalDate date, int age) {
        this.name = name;
        this.email = email;
        this.date = date;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", age=" + age +
                '}';
    }
}
