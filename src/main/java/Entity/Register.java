package Entity;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Register implements Comparable<Student> {
    List<Student> students;

    public Register(List<Student> students) {
        this.students = students;
    }


//    List of names of Students
    public List<String> getRegister(){
        return students.stream()
                .map(s -> s.getName())
                .collect(Collectors.toList());
    }


//    public List<String> getRegisterByLevel(Year year){
//       return students.stream()
//               .filter(student -> student.getLevel() == year)
//               .map(Student::getName)
//               .collect(Collectors.toList());
//    }

    public Map<Year, List<Student>> getRegisterByLevel(Year year){
        Map<Year, List<Student>> studentList  = new HashMap<>();
//        studentList.put(year, students.stream()
//        .filter(s-> s.getYear()==year)
//        .map(std->std)
//        .collect(Collectors.toList())) ;

        studentList.put(year, students.stream()
                .filter(s-> s.getYear()==year)
                .collect(Collectors.toList())) ;
        return  studentList;
    };



//    get back to this code Fred
    public List<String> printReport(){
       return students.stream()
                .filter(s->s.getLevel()== Year.FIRST)
                .map(Student::getName)
                .collect(Collectors.toList());
    }

//    public void sort(){
//        List<Student> studentsArr = new ArrayList<>();
//        Collections.sort(studentsArr);
//    }


    @Override
    public String toString() {
        return "Register{" +
                "students=" + students +
                '}';
    }




    @Override
    public int compareTo(Student o) {
//        students.stream().sorted()
        return 0;
    }
}
