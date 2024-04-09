package com.rajlee.student.service;

import com.rajlee.student.model.Student;

public interface StudentService {
    public Student addStudent(Student student);

    public Student getStudent(String id);

    public Student updateStudent(Student student);

    public void deleteStudent(String id);




}
