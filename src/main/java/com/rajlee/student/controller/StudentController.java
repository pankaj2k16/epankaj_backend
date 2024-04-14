package com.rajlee.student.controller;

import com.rajlee.student.model.Student;
import com.rajlee.student.repository.StudentRepository;
import com.rajlee.student.response.StudentResponse;
import com.rajlee.student.route.ApiRequestMapping;
import com.rajlee.student.service.StudentService;
import com.rajlee.student.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiRequestMapping.STUDENT_ROUTES)
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    StudentRepository studentRepository;
    @GetMapping(ApiRequestMapping.ALL)
    public List<Student> getAllStudents() {
        List<Student> allStudent = studentService.allStudents();
        return allStudent;
    }

    @PostMapping("/register")
    public StudentResponse addStudent(@RequestBody Student student) {

        return studentService.addStudent(student);
    }

}
