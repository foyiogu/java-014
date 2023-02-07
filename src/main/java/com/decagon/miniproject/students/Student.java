package com.decagon.miniproject.students;

import lombok.Data;

@Data
public class Student {
    private String name;
    private int strikeCount;
    private boolean expelled = false;

    public Student(String name) {
        this.name = name;
    }
}
