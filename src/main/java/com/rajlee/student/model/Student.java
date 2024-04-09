package com.rajlee.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //    private String email;
//    private Gender gender;
//    private Address address;
//    private List<String> subjects;
//    private BigDecimal totalSpentInBooks;
//    private ZonedDateTime created;
//    private String phone;

}
