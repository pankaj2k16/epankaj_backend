package com.rajlee.student.model;

import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public class Student extends BaseModel{
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private  Address address;
    private Gender gender;
    private String dateOfBirth;


}
