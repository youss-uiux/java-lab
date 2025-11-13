package com.javalab.demos.lombokdemo;

import com.javalab.core.utils.Logger;
import com.javalab.demos.lombokdemo.models.Employee;
import com.javalab.demos.lombokdemo.models.Person;

public class LombokComparison {

    public void run() {
        testBothVersions();
    }

    private void testBothVersions() {

        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setAge(28);
        employee.setEmail("marie.martin@example.com");
        Logger.info("Sans Lombok (Employee) : " + employee);

    }
}

