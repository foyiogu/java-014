package com.decagon.miniproject.services;

import com.decagon.miniproject.students.Applicant;
import com.decagon.miniproject.students.Student;

public interface PrincipalService {
    void expel(Student student);
    void admit(Applicant applicant);
}
