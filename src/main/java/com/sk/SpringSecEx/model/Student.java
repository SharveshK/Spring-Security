package com.sk.SpringSecEx.model;

public class Student {
    int Id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        Id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
