

import Entity.*;

import java.util.List;
import java.util.stream.Collectors;
/**
 * This afternoon we're going to model a university.
 *
 * 1. In a new package, create a class Entity.Student.
 *
 * Each Entity.Student has a name, a student ID, and is either in the first, second, third or fourth year.
 *
 * 2. Create a class Entity.Lecturer. Each Entity.Lecturer has a Name, and either lectures in English Language, Maths, Physics, Programming, or Gardening.
 *
 * 3. Create a class Entity.Course. Each course has a Entity.Lecturer, a list of Students, and if it is a first, second, third or fourth-year course.
 *
 * 4. In your Main class, create a large number of students, all in different years.
 *
 * 5. Create an Intro to Programming Entity.Course for first-year students. Add all your first-year students to the course.
 *
 * 6. Create an Advanced Gardening class (a fourth-year course) and add all your third- and fourth-year students to the course.
 *
 * 7. Create a fourth-year Physics course and add to it all the 4th-year students whose name starts with a vowel.
 */

public class Main {

    public static void main(String[] args) {

        List<Student> studentLists = getStudent();


        List<Student> firstYears = studentLists
                .stream()
                .filter(student->student.getLevel().equals(Year.FIRST))
                .collect(Collectors.toList());
        firstYears.forEach(System.out::println);

        System.out.println("First Years Doing Introduction to Programming");
        Course IntroToProgramming  =  new Course(new Lecturer("fifi", LecturerCourse.Programming), firstYears, Year.FIRST);
        System.out.println(IntroToProgramming);


        Lecturer lecturer = new Lecturer("fifi", LecturerCourse.Programming);


        System.out.println("Third and Fourth Years Students");
        List<Student> thirdAndFourthYearStudents = studentLists.stream()
                .filter(students->students.getLevel().equals(Year.THIRD) || students.getLevel().equals(Year.FOURTH))
                .collect(Collectors.toList());
        thirdAndFourthYearStudents.forEach(System.out::println);
        Course AdvanceGardening = new Course(lecturer,thirdAndFourthYearStudents, Year.THIRD);


//        System.out.println("Fourth Entity.Year Students");
//        List<Entity.Student> fourthYearStudents = studentLists.stream()
//                .filter(students->students.getYear().equals(Entity.Year.FOURTH))
//                .collect(Collectors.toList());
//        fourthYearStudents.forEach(System.out::println);
//        System.out.println(fourthYearStudents);
//        Entity.Course physics = new Entity.Course(lecturer,fourthYearStudents,Entity.Year.THIRD);


        System.out.println("\nStarting With Vowels");
        List<Student> fourthYearStudentAndNameStartingWithVowel = studentLists
                .stream().filter(student -> student.getName()
                        .startsWith("A") && student.getLevel().equals(Year.FOURTH)
                        || student.getName().startsWith("E") && student.getLevel().equals(Year.FOURTH)
                        || student.getName().startsWith("I") && student.getLevel().equals(Year.FOURTH)
                        || student.getName().startsWith("O") && student.getLevel().equals(Year.FOURTH)
                        || student.getName().startsWith("U") && student.getLevel().equals(Year.FOURTH))
                .collect(Collectors.toList());
        fourthYearStudentAndNameStartingWithVowel.forEach(System.out::println);


        System.out.println("\nModified Code for the Fourth Entity.Year Starting With Vowels and in Fourth Entity.Year");
        List<Student> fourthYearStudentAndNameStartingWithVowelSecondMethod = studentLists
                .stream().filter(student -> student.getName()
                        .startsWith("A")
                        || student.getName().startsWith("E")
                        || student.getName().startsWith("I")
                        || student.getName().startsWith("O")
                        || student.getName().startsWith("U"))
                .filter(student -> student.getLevel().equals(Year.FOURTH))
                .collect(Collectors.toList());
        fourthYearStudentAndNameStartingWithVowelSecondMethod.forEach(System.out::println);
        Course physics = new Course(lecturer,fourthYearStudentAndNameStartingWithVowelSecondMethod, Year.THIRD);


        System.out.println("Grades");

        Student student = new Student
                ("1234", "Fred", Year.FOURTH, List.of(20.0,30.0));

        Student student2 = new Student
                ("1234", "DRED", Year.FIRST, List.of(20.0,30.0));


        System.out.println(student.getLevel());

// studentBag only takes student objects
        BagOfStudents<Student> studentBag = new BagOfStudents();
        studentBag.addStudent(student);
        studentBag.addStudent(student2);
//        studentBag.clearStudents();
        System.out.println(studentBag.getStudentListBag());


        System.out.println("Lecturer Bags");
        Lecturer lecturer1 = new Lecturer("Simons", LecturerCourse.Programming);
        BagOfLecturers<Lecturer> lecturersBag = new BagOfLecturers();
        lecturersBag.addStudent(lecturer1);

        System.out.println(lecturersBag);
//


    }

    private static List<Student> getStudent(){
        return List.of(
//                new Student("1234", "Fred", Year.FOURTH, List.of(20.0,30.0), Level.hundred),
//                new Student("345", "Amos", Year.SECOND, List.of(20.0,30.0), Level.hundred)
//                new Student("5689", "Moses", Year.THIRD, List.of(20.0,30.0)),
//                new Student("123", "Sabina", Year.FIRST, List.of(20.0,30.0)),
//                new Student("1234", "Stevo", Year.THIRD, List.of(20.0,30.0)),
//                new Student("1234", "Angelina", Year.FOURTH, List.of(20.0,30.0)),
//                new Student("1234", "Patience", Year.FIRST, List.of(20.0,30.0)),
//                new Student("1234", "Yoyi", Year.FOURTH, List.of(20.0,30.0)),
//                new Student("1234", "Truth", Year.THIRD, List.of(20.0,30.0)),
//                new Student("1234", "Joseph", Year.FIRST, List.of(20.0,30.0)),
//                new Student("1234", "Fausia", Year.FOURTH, List.of(20.0,30.0))
        );
    }



}
