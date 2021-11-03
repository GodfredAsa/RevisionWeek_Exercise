package Entity;


import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable, HasLevel{
    private String Id;
    private String name;
    private Year year;
    List<Double> grades = new ArrayList<>();


    public Student(String id, String name, Year year, List<Double> grades) {
        Id = id;
        this.name = name;
        this.year = year;
        this.grades = grades;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }



    public double getAverageGrade(){
        Double sum =  grades.stream().reduce(0.0, (a, b)->a+b);
        Double result = sum / grades.size();
        return result;
    }

    @Override
    public String toString() {
        return "Entity.Student{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", studentYear=" + year +
                '}';
    }

    @Override
    public Year getLevel() {
        return year;
    }
}
