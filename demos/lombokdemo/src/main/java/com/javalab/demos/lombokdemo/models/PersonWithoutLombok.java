package com.javalab.demos.lombokdemo.models;

import java.util.Objects;

/**
 * Modèle Person SANS Lombok - Version traditionnelle avec tout le code boilerplate
 * Compare cette classe avec Person.java pour voir la différence !
 */
public class PersonWithoutLombok {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    
    // Constructeur par défaut
    public PersonWithoutLombok() {
    }
    
    // Constructeur avec tous les paramètres
    public PersonWithoutLombok(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }
    
    // Getters
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getEmail() {
        return email;
    }
    
    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    // equals()
    @Override
    public boolean equals(Object o) {
        if (this == o)return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        PersonWithoutLombok that = (PersonWithoutLombok) o;
        
        if (age != that.age) return false;
        if (!Objects.equals(firstName, that.firstName)) return false;
        if (!Objects.equals(lastName, that.lastName)) return false;
        return Objects.equals(email, that.email);
    }
    
    // hashCode()
    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
    
    // toString()
    @Override
    public String toString() {
        return "PersonWithoutLombok{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
    
    /*Builder pattern (version manuelle)
    public static Builder builder() {
        return new Builder();
    }
    
    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String email;
        
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        
        public PersonWithoutLombok build() {
            return new PersonWithoutLombok(firstName, lastName, age, email);
        }
    }*/
}

