package com.example.springdependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

    public Heart heart;

    public Human(){}
    @Autowired
    public Human(Heart heart) {
        this.heart = heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startpump(){
        heart.pump();
    }
}
