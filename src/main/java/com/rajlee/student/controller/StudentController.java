package com.rajlee.student.controller;

import com.rajlee.student.model.Student;
import com.rajlee.student.repository.StudentRepository;
import com.rajlee.student.route.ApiRequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiRequestMapping.STUDENT_ROUTES)
public class StudentController {

    StudentRepository studentRepository;
    @GetMapping(ApiRequestMapping.ALL)
    public List<Student> getAllStudents() {
        List<Student> students = List.of(
                new Student("James", "Bond"),
                new Student("Maria", "Jones"));
        return students;
    }

    @PutMapping("/register")
    public Student addStudent(@RequestBody Student student) {
        studentRepository.insert(student);
        return student;
    }

}
