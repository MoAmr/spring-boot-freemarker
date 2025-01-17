package com.example.freemarker.model;

/**
 * @author Mohammed Amr
 * @created 26/12/2020 - 00:39
 * @project freemarker
 */

public class Student {
    private Integer Id;
    private String studentName;
    private double grade;

    public Student(Integer id, String studentName, double grade) {
        Id = id;
        this.studentName = studentName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getId() {

        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}
