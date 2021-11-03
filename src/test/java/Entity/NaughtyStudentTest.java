package Entity;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @org.junit.jupiter.api.Test
    void getGrades() {
    }

    @org.junit.jupiter.api.Test
    void getAverageGrade() {

       NaughtyStudent naughtyStudent = new NaughtyStudent
               ("1234", "Fred", Year.FOURTH, List.of(20.0,30.0));
       assertEquals(naughtyStudent.getAverageGrade(), 27.5, "Not Passed");
    }

    @org.junit.jupiter.api.Test
    void getStudentAverageGrade(){
        Student student = new Student
                ("1234", "Fred", Year.FOURTH, List.of(20.0,30.0));
        assertEquals(student.getAverageGrade(), 25.0, "Not Passed");
    }

    @org.junit.jupiter.api.Test
    void compareGrades(){
        Student student = new Student
                ("1234", "Fred", Year.FOURTH, List.of(20.0,30.0));
        NaughtyStudent naughtyStudent = new NaughtyStudent
                ("1234", "Fred", Year.FOURTH, List.of(20.0,30.0));
        assertNotEquals(student.getAverageGrade(), naughtyStudent.getAverageGrade(), "Not Equals");
    }

    @Test
    void nameableNamesOfStudents(){

        Student student = new Student
                ("1234", "Fred", Year.FOURTH, List.of(20.0,30.0));

        Student albe = new Student
                ("1234", "Alberta", Year.FIRST, List.of(20.0,30.0));

        NaughtyStudent naughtyStudent = new NaughtyStudent
                ("1234", "Sampson", Year.FOURTH, List.of(20.0,30.0));

       Register register = new Register(List.of(student, naughtyStudent, albe));

       register.getRegister().stream().forEach(System.out::println);

        System.out.println("*************************************************");
        System.out.println("Names in the Register " + Year.FIRST + " Year");
        System.out.println(register.getRegisterByLevel(Year.FOURTH));

//        register.getRegisterByLevel(Year.FOURTH).forEach(System.out::println);


//PrintReports
        System.out.println("Reports");
//        System.out.println(register.printReport());




    }
}
