package com.example.freemarker.model;

/**
 * @author Mohammed Amr
 * @created 26/12/2020 - 00:39
 * @project freemarker
 */

public class Student {

    private Integer Id;
    private String studenName;
    private double grade;

    public Student(Integer id, String studenName, double grade) {
        Id = id;
        this.studenName = studenName;
        this.grade = grade;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getStudenName() {
        return studenName;
    }

    public void setStudenName(String studenName) {
        this.studenName = studenName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
