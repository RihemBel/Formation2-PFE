package com.example.demo.student;

public class Student {
    private final Integer StudentId;
    private final String StudentName;

    public Student(Integer studentId, String studentName) {
        StudentId = studentId;
        StudentName = studentName;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                '}';
    }
}
