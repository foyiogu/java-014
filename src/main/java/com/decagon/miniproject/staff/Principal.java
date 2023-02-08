package com.decagon.miniproject.staff;

import com.decagon.miniproject.students.Applicant;
import com.decagon.miniproject.students.Student;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Principal extends Staff{

    private final Designation designation;

    public Principal(String name, Integer age) {
        super(name, age);
        this.designation = Designation.PRINCIPAL;
    }

    public void expel(Student student){
        if (student.getStrikeCount() >= 3){
            student.setExpelled(true);
//            System.out.println(student.getName() + " has been expelled");
        }else {
            System.out.println(student.getName() + " cannot be expelled");
        }
    }

    public void admit(Applicant applicant){
        if (applicant.getAge() > 18 && applicant.getAge() < 25){
            applicant.setAdmitted(true);
            System.out.println(applicant.getName() + " is admitted");
        }else {
            throw new RuntimeException(String.format("%s is not admitted", applicant.getName()));
        }

    }

}
