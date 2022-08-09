package com.example.springdependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    public Heart heart;

    public Human(){}
    @Autowired
//  @Qualifier("human") --> used to specify which bean name you want o use if you have multiple objects or beans for same class (and both bytype and byname failed)
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
