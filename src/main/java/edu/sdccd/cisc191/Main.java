package edu.sdccd.cisc191;

import java.util.Arrays;
import java.util.List;

import static edu.sdccd.cisc191.StudentAnalyzer.*;

public class Main {
    public static void main(String[] args) {

        // TODO create students
        Student[] students = {
                new Student("Reha", 3.5, 101),
                new Student("Eva", 3.8, 102),
                new Student("Charlie", 3.8, 103),
                new Student("David", 3.2, 104),
                new Student("Joseph", 4.0, 105),
                new Student("Danny", 2.9, 106)
        };

        List<Student> studentList = Arrays.asList(students);
        // TODO demonstrate filtering
        List<Student> highGpa = filter(studentList, s -> s.getGpa() >= 3.5);
        System.out.println("Students with GPA >= 3.5:");
        for (Student s : highGpa) {
            System.out.println("  " + s.getName() + " - " + s.getGpa());
        }

        // TODO demonstrate sorting
        sort(studentList, (a, b) -> Double.compare(b.getGpa(), a.getGpa()));
        System.out.println("\nStudents sorted by GPA (descending):");
        for (Student s : studentList) {
            System.out.println("  " + s.getName() + " - " + s.getGpa());
        }

        // TODO print average GPA
        double avg = averageGpa(studentList);
        System.out.printf("%nAverage GPA: %.2f%n", avg);
    }
}