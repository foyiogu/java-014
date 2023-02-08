package com.decagon.miniproject.services.ServiceImplementation;

import com.decagon.miniproject.services.PrincipalService;
import com.decagon.miniproject.staff.Principal;
import com.decagon.miniproject.students.Applicant;
import com.decagon.miniproject.students.Student;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class PrincipalServiceImpl implements PrincipalService {

    Principal principal;

    @Override
    public void expel(Student student){
        principal.expel(student);
    }

    @Override
    public void admit(Applicant applicant){
        principal.admit(applicant);
    }
}
