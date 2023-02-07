package com.decagon.miniproject.staff;

import lombok.Data;
import lombok.Getter;

@Getter
public class NAStaff extends Staff{

    private final Designation designation;

    public NAStaff(String name, Integer age) {
        super(name, age);
        this.designation = Designation.N_A_S;
    }
}
