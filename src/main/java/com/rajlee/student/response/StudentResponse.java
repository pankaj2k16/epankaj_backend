package com.rajlee.student.response;

import com.rajlee.student.model.Address;
import com.rajlee.student.model.Gender;
import com.rajlee.student.model.Student;
import lombok.Data;

@Data
public class StudentResponse extends CommonApiResponse {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Address address;
    private Gender gender;
    private String dateOfBirth;
}
