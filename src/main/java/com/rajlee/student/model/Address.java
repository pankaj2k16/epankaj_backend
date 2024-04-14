package com.rajlee.student.model;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class Address {
    private String country;
    private String city;
    private String postCode;
}
