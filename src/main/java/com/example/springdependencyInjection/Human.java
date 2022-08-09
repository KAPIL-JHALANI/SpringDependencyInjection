package com.example.springdependencyInjection;

public class Human {

    public Heart heart;

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startpump(){
        heart.pump();
    }
}
