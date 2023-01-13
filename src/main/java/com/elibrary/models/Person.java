package com.elibrary.models;

import javax.validation.constraints.*;
import java.util.List;

public class Person {

    private int id;

    @NotEmpty(message = "")
    @Size(min = 2, max = 100, message = "")
    private String fullName;
    @NotNull
    @Min(value = 1900, message = "Year of birth should be more than 1900")
    private int yearOfBirth;

    public Person(String fullName, int yearOfBirth) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

}
