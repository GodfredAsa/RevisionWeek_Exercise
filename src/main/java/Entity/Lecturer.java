package Entity;

public class Lecturer {
    private String name;
    private LecturerCourse lecturerCourse;


    public Lecturer(String name, LecturerCourse lecturerCourse) {
        this.name = name;
        this.lecturerCourse = lecturerCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LecturerCourse getLecturerCourse() {
        return lecturerCourse;
    }

    public void setLecturerCourse(LecturerCourse lecturerCourse) {
        this.lecturerCourse = lecturerCourse;
    }

    public void Enter(Student student){
        System.out.println(student  + " Student Enter Lecture Hall");
    }

//    NOT IMPLEMENTED
    public void getHighestGrade(){

    }

    @Override
    public String toString() {
        return "Entity.Lecturer{" +
                "name='" + name + '\'' +
                ", lecturerCourse=" + lecturerCourse +
                '}';
    }
}
