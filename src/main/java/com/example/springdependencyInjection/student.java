package com.example.springdependencyInjection;

public class student {

    private String name;

    public student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displaystudentinfo(){
        System.out.println(name);
    }
}
