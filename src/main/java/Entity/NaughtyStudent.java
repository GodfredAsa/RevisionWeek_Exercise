package Entity;

import java.util.List;

public class NaughtyStudent extends Student{
    public NaughtyStudent(String id, String name, Year year, List<Double> grades) {
        super(id, name, year, grades);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Year getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(Year year) {
        super.setYear(year);
    }

    @Override
    public List<Double> getGrades() {
        return super.getGrades();
    }

    @Override
    public void setGrades(List<Double> grades) {
        super.setGrades(grades);
    }

    @Override
    public double getAverageGrade() {
        return super.getAverageGrade() + super.getAverageGrade() *0.1 ;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
