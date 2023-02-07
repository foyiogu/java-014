package com.decagon.miniproject;

import com.decagon.miniproject.staff.Teacher;
import com.decagon.miniproject.students.Student;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Department {

    private String departmentName;
    private List<Course> courses;

    public void teachCourse(Teacher teacher, List<Student> students, String course){
//        for (Course cours : this.courses) {
//            if (!(course.toLowerCase().equals(cours.getName().toUpperCase()))){
//                System.out.printf("%s cannot be taught in this department", course);
////                return;
//            }
////            continue;
//        }
        StringBuilder studentsList = new StringBuilder();
        for (Student student : students) {
            if (!student.isExpelled()) {
                studentsList.append(student.getName()).append(" ");
            }
        }
        String words = String.format("%s is teaching %s to %s", teacher.getName(), course, studentsList );
        System.out.println(words);
    }

    public void takeCourse(Teacher teacher, Student student, Course course){
        if (!student.isExpelled()) {
            System.out.printf("%s cannot take this course", student.getName());
        }else {
            String words = String.format("%s is learning %s from %s", student.getName(), course.getName(), teacher.getName() );
            System.out.println(words);
        }
    }
}
