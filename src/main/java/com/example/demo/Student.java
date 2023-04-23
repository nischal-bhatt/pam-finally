package com.example.demo;

import java.io.Serializable;


public class Student implements Serializable {

    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
