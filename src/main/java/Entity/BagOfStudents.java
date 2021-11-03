package Entity;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents<T> {
    private List<T> studentListBag = new ArrayList<>();

    public BagOfStudents() {
    }

    public List<T> getStudentListBag() {
        return studentListBag;
    }

    public void addStudent(T t){
        studentListBag.add(t);
    }

    public void removeStudent(T t){
        studentListBag.remove(t);
    }

    public void clearStudents(){
        studentListBag.clear();
    }

    @Override
    public String toString() {
        return "BagOfStudents{" +
                "studentListBag=" + studentListBag +
                '}';
    }
}
