package com.javalab.demos.lombokdemo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeLombok {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
}

