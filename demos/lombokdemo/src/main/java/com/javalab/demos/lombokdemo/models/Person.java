package com.javalab.demos.lombokdemo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Modèle Person démontrant les annotations Lombok
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
}
