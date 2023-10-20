package lab01.task2;

import java.util.ArrayList;
import java.util.List;

public class JobMarket {
    public static void main(String[] args) {
        // Crearea listelor de studenți și companii
        List<Student> students = new ArrayList<>();
        students.add(new Student("Gigel", 3.8));
        students.add(new Student("Dorel", 3.6));
        students.add(new Student("Marcel", 4.0));
        students.add(new Student("Ionel", 3.9));

        List<Internship> internships = new ArrayList<>();
        internships.add(new Internship("Google", 3.7));
        internships.add(new Internship("Amazon", 3.5));
        internships.add(new Internship("Facebook", 3.6));
        internships.add(new Internship("Microsoft", 3.8));

        // Apelurile pentru metoda chooseCandidatesForInterview pentru fiecare companie
        for (Internship internship : internships) {
            System.out.println("Candidates for " + internship.getName() + ":");
            internship.setStudents(students);
            internship.chooseCandidatesForInterview();
            System.out.println();
        }

        System.out.println("Task 3 \n");
        Student student1 = new Student("Gigel", 3.8);

        // Comparare student1 cu primul student din lista
        if (student1.equals(students.get(0))){
            System.out.println("E acelasi student");
        } else {
            System.out.println("Studenti diferiti");
        }
        // student1 si students.get(0) sunt referinte/zone de mem diferite => false
    }
}
