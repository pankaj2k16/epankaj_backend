package com.rajlee.student.repository;

import com.rajlee.student.model.Student;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
@Document("students")
public interface StudentRepository extends MongoRepository<Student, String> {
}
