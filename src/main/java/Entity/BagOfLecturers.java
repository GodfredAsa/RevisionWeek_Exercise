package Entity;

import java.util.ArrayList;
import java.util.List;

public class BagOfLecturers<T> {

    private List<T> bagOfLecturers = new ArrayList<>();



    public List<T> getBagOfLecturers() {
        return bagOfLecturers;
    }

    public void addStudent(T t){
        bagOfLecturers.add(t);
    }

    public void removeStudent(T t){
        bagOfLecturers.remove(t);
    }

    public void clearStudents(){
        bagOfLecturers.clear();
    }

    @Override
    public String toString() {
        return "BagOfLecturers{" +
                "bagOfLecturers=" + bagOfLecturers +
                '}';
    }
}
