package com.decagon.miniproject.students;

import lombok.Data;

@Data
public class Applicant {
    private String name;
    private int age;
    private boolean admitted = false;

    public Applicant(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
