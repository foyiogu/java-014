package com.decagon.miniproject.staff;

import lombok.Getter;

@Getter
public class Teacher extends Staff{
    private Designation designation;

    public Teacher(String name, Integer age) {
        super(name, age);
        this.designation = Designation.TEACHER;
    }

    public void teach(){
        if (this.designation !=  Designation.TEACHER) System.out.println("can not teach");
        System.out.println("can teach");
    }


}
