package com.decagon.miniproject;

import com.decagon.miniproject.staff.NAStaff;
import com.decagon.miniproject.staff.Principal;
import com.decagon.miniproject.staff.Staff;
import com.decagon.miniproject.staff.Teacher;
import com.decagon.miniproject.students.Applicant;
import com.decagon.miniproject.students.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal("Mr A", 50);
        System.out.printf("Principal with name %s and age %d created", principal.getName(), principal.getAge());
        System.out.println("\n*******************************\n");
        Teacher teacher = new Teacher("Teacher A", 30);
        Staff nas = new NAStaff("NAS A", 25);

        Course math = new Course("maths");
        Course english = new Course("english");
        Course science = new Course("science");

        Department java = new Department("java class", List.of(math, english));

        Applicant ab = new Applicant("AB", 17);
        Applicant cd = new Applicant("CD", 19);

        Student student1 = new Student("student1");
        Student student2 = new Student("student2");

        teacher.strikeStudent(student1);
        System.out.println("\n*******************************\n");
        nas.strikeStudent(student1);
        System.out.println("\n*******************************\n");
        principal.expel(student1);
        System.out.println("\n*******************************\n");
        teacher.strikeStudent(student1);
        System.out.println("\n*******************************\n");
        principal.expel(student1);
        System.out.println("\n*******************************\n");

        java.teachCourse(teacher, List.of(student1, student2), "maths");
        System.out.println("\n*******************************\n");

        java.takeCourse(teacher, student1, math);
        System.out.println("\n*******************************\n");
        java.takeCourse(teacher, student2, math);

    }
}
