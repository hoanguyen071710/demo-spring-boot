package com.example.demo.student;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.GenerationType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Student {
    @Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student() {}

    public Student(
        Long id,
        String name,
        String email,
        LocalDate dob,
        Integer age
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
    public Student(
        String name,
        String email,
        LocalDate dob,
        Integer age
    ) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob +
                ", age='" + age +
                '}'
                ;
    }
}
