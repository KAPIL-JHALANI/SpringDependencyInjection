package com.example.springdependencyInjection;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Teacher {

    //@value use for injecting the primitive data literal values
    //@Required   making the field required ,  if this value is not inject then object do not created


    @Value("${Teacher.name}")
    private String name;


    @Value("${Teacher.interestedcurse}")
    private String interestedcurse;

    @Value("${Teacher.hobby}")
    private String hobby;


    public void show(){
        System.out.println("name is: "+name);
        System.out.println("Interested course is: "+interestedcurse);
        System.out.println("hobby is: "+hobby);
    }
}
