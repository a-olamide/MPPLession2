package lesson2.lab.prob2A.ext;

import lesson2.lab.prob2A.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Olamide Akinoso");
        System.out.println("Student: "+ student.getName() + " Grade Report: " + student.getGradeReport());
    }
}
