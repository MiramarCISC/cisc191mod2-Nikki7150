package edu.sdccd.cisc191;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentAnalyzer {
    static List<Student> filter(List<Student> list, StudentFilter filter) {
        List<Student> result = new ArrayList<>();
        for (Student s : list) {
            if (filter.test(s)) {
                result.add(s);
            }
        }
        return result;
    }

    static void sort(List<Student> list, Comparator<Student>  comparator) {
        list.sort(comparator);
    }
    static double averageGpa(List<Student>List) {
        double sum = 0.0;
        for (Student s : List) {
            sum += s.getGpa();
        }
        return sum / List.size();
    }
}
