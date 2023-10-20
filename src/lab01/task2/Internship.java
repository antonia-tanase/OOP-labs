package lab01.task2;

import lab01.task2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Internship {
    private String name;
    private double minGrade;
    private List<Student> students = new ArrayList<>();

    // Constructor cu 2 param
    public Internship(String name, double minGrade) {
        this.name = name;
        this.minGrade = minGrade;
    }
    // Getters & setters
    public List<Student> getStudents() {
        return this.students;
    }

    public double getMinGrade(){
        return minGrade;
    }

    public String getName() {
        return name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student chooseCandidateRand(){
        if (students == null || students.size() == 0) {
            return null;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(students.size());

        return students.get(randomIndex);
    }

    public void chooseCandidatesForInterview() {
        for (Student student : students) {
            if (Double.compare(student.getGrade(), this.getMinGrade()) >= 0) {
                System.out.println("Candidate " + student.getName() + " got a phone interview at " + this.getName());
            }
        }
    }
}
