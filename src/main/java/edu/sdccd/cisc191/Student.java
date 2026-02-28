package edu.sdccd.cisc191;

public class Student {
    /***Fields must be private
    Fields:
    name
            gpa
    id
    Constructor must validate:
    name not empty
    gpa between 0–4
    id positive
    Invalid input → throw IllegalArgumentException
    Must include getters
    Override toString()***/
    private final String name;
    private final double gpa;
    private final int id;

    public Student(String name, double gpa, int id) {
        this.name = name;
        this.gpa = gpa;
        this.id = id;

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null or empty");
        }

        if (gpa < 0 || gpa > 4) {
            throw new IllegalArgumentException("Student gpa must be between 0 and 4");
        }

        if (id <= 0) {
            throw new IllegalArgumentException("Student id cannot be lesser than 0");
        }
    }


    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", gpa=" + gpa + ", id=" + id + "]";
    }
}
