package com.javalab.demos.lombokdemo;

import com.javalab.demos.lombokdemo.models.Employee;
import com.javalab.demos.lombokdemo.models.EmployeeLombok;


public class EmployeeComparison {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Alice", "Martin", 28, "alice@example.com");

        Employee emp2 = new Employee();
        emp2.setFirstName("Bob");
        emp2.setLastName("Dupont");
        emp2.setAge(35);
        emp2.setEmail("bob@example.com");

        System.out.println("   Employee - Nom complet:        " +
                emp1.getFirstName() + " " + emp1.getLastName());

        Employee emp3 = new Employee("Alice", "Martin", 28, "alice@example.com");

        System.out.println("   emp1.equals(emp3):           " + emp1.equals(emp3) + " (même contenu)");

        System.out.println("   emp1.hashCode():        " + emp1.hashCode());







        EmployeeLombok empLombok1 = new EmployeeLombok("Alice", "Martin", 28, "alice@example.com");


        EmployeeLombok empLombok2 = new EmployeeLombok();
        empLombok2.setFirstName("Bob");
        empLombok2.setLastName("Dupont");
        empLombok2.setAge(35);
        empLombok2.setEmail("bob@example.com");

        System.out.println("   EmployeeLombok - Nom complet:  " +
                empLombok1.getFirstName() + " " + empLombok1.getLastName());
        System.out.println();



        System.out.println("   Employee:        " + emp2);
        System.out.println("   EmployeeLombok:  " + empLombok2);
        System.out.println();



        EmployeeLombok empLombok3 = EmployeeLombok.builder()
                .firstName("Charlie")
                .age(90)
                .lastName("Dubois")
                .email("charlie@example.com")

                .build();

        EmployeeLombok empLombok4 = new EmployeeLombok("Alice",90, "Martin","alice@example.com");


        System.out.println("   empLombok1.equals(empLombok4): " + empLombok1.equals(empLombok4) + " (même contenu)");

        System.out.println("   empLombok1.hashCode():  " + empLombok1.hashCode());
        System.out.println();



    }
}

