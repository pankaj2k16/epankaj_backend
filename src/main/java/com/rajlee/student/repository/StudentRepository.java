package com.rajlee.student.repository;

import com.rajlee.student.model.Student;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Document("students")
public interface StudentRepository extends MongoRepository<Student, String> {


    Student findByEmail(String email);

    //List<Student> findAll();

    Student findByPhone(String phoneNumber);
}
