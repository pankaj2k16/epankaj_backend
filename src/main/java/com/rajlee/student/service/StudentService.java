package com.rajlee.student.service;

import com.rajlee.student.model.Student;
import com.rajlee.student.response.StudentResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public StudentResponse addStudent(Student student);

    public Student getStudent(String id);

    public Student updateStudent(Student student);

    public void deleteStudent(String id);


    public List<Student> allStudents();
}
