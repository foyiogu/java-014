package com.decagon.miniproject.staff;

import com.decagon.miniproject.services.PrincipalService;
import com.decagon.miniproject.services.ServiceImplementation.PrincipalServiceImpl;
import com.decagon.miniproject.students.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrincipalTest {

    Principal principal;
    Student student;

    PrincipalService principalService;

    @BeforeEach
    void before(){
        principal = new Principal("Abc", 50);
        student = new Student("Ade");
        principalService = new PrincipalServiceImpl(principal);
    }


    @Test
    void shouldExpelStudent(){
        System.err.println(student.isExpelled()); //false
        student.setStrikeCount(3);

        principalService.expel(student);

        System.err.println(student.isExpelled()); //true
        boolean expected = true;
//        assertEquals(expected, student.isExpelled());
        assertTrue(student.isExpelled());
//        assertFalse(student.isExpelled());
    }

//    @Test
//    void shouldNotExpelStudent(){
//        student.setStrikeCount(3);
//        String actual = principal.expel(student);
//        String expected = "Ade has been expelled";
//        assertNotEquals(expected, actual);
//    }
}
