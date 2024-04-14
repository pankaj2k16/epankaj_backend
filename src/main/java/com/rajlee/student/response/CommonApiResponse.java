package com.rajlee.student.response;

import lombok.Data;

@Data
public class CommonApiResponse {

    int status_code = 200;
    Boolean success = true;
    String message;
}
