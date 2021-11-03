package Entity;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private Lecturer lecturer;
    private List<Student> studentList = new ArrayList<>();
    private Year year;

    public Course(Lecturer lecturer, List<Student> studentList, Year year) {
        this.lecturer = lecturer;
        this.studentList = studentList;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Entity.Course{" +
                "lecturer=" + lecturer +
                ", studentList=" + studentList +
                ", year=" + year +
                '}';
    }
}
