package com.javalab.demos.lombokdemo;

import com.javalab.core.utils.Logger;
import com.javalab.demos.lombokdemo.models.Person;
import com.javalab.demos.lombokdemo.models.PersonWithoutLombok;

public class LombokComparison {

    public void run() {
        testBothVersions();
    }

    private void testBothVersions() {
        // Test SANS Lombok
      PersonWithoutLombok personWithout = new PersonWithoutLombok();
      personWithout.setFirstName("Marie");
      personWithout.setLastName("Martin");
      personWithout.setAge(28);
      personWithout.setEmail("marie.martin@example.com");
      Logger.info("Sans Lombok : " + personWithout);

        // Test AVEC Lombok
        Person personWith = Person.builder()
            .firstName("Marie")
            .lastName("Martin")
            .age(28)
            .email("marie.martin@example.com")
            .build();

        Logger.info("Avec Lombok : " + personWith);
    }
}

