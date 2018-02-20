package com.wlj.domain;

public class Student {

    private int id;
    private String user_name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Student() {
    }

    public Student(int id, String user_name) {
        this.id = id;
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                '}';
    }
}



