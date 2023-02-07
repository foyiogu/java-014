package com.decagon.miniproject.staff;

import com.decagon.miniproject.students.Student;
import lombok.Data;

@Data
public abstract class Staff {
    private String name;
    private Integer age;

    public Staff(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void strikeStudent(Student student){
        if (student.isExpelled()){
            System.out.printf("%s is already expelled", student.getName());
        }else {
            student.setStrikeCount(student.getStrikeCount() + 1);
            System.out.printf("%s has %d strikes", student.getName(), student.getStrikeCount());
        }
    }
}
