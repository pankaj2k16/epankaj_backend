package com.rajlee.student.service;

import com.rajlee.student.model.Student;
import com.rajlee.student.repository.StudentRepository;
import com.rajlee.student.response.StudentResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;
    @Override
    public StudentResponse addStudent(Student student) {
        log.info("I am from student service");
        StudentResponse sResponse = new StudentResponse();
        try{
            validateStudentInput(student);
            Student s = studentRepository.insert(student);

        }catch (Exception e){
            sResponse.setSuccess(false);
            sResponse.setMessage(e.getMessage());
            return sResponse;
        }

        return wrapStudent(student, sResponse);
    }

    @Override
    public Student getStudent(String id) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudent(String id) {

    }

    @Override
    public List<Student> allStudents() {
        return studentRepository.findAll();
    }

    public void validateStudentInput(Student student){
        if(student.getFirstName() == null || student.getFirstName().isEmpty()){
            throw new IllegalArgumentException("First Name is required");
        }
        if(student.getLastName() == null || student.getLastName().isEmpty()){
            throw new IllegalArgumentException("Last Name is required");
        }
        if(student.getEmail() == null || student.getEmail().isEmpty()){
            throw new IllegalArgumentException("Email is required");
        }
        if(student.getPhone() == null || student.getPhone().isEmpty()){
            throw new IllegalArgumentException("Phone is required");
        }
        if(student.getAddress() == null){
            throw new IllegalArgumentException("Address is required");
        }
        if(student.getGender() == null) {
            throw new IllegalArgumentException("Gender is required");
        }
        if(student.getDateOfBirth() == null || student.getDateOfBirth().isEmpty()){
            throw new IllegalArgumentException("Date of Birth is required");
        }
    }

    public StudentResponse wrapStudent(Student student, StudentResponse sResponse){
        sResponse.setFirstName(student.getFirstName());
        sResponse.setLastName(student.getLastName());
        sResponse.setEmail(student.getEmail());
        sResponse.setPhone(student.getPhone());
        sResponse.setAddress(student.getAddress());
        sResponse.setGender(student.getGender());
        sResponse.setDateOfBirth(student.getDateOfBirth());
        return sResponse;
    }
}
