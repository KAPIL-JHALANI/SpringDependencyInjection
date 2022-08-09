package com.example.springdependencyInjection;

public class sciencetest {

    int id;
    ScienceCheat scienceCheat;

    public void setId(int id) {
        this.id = id;
    }

    public void setScienceCheat(ScienceCheat scienceCheat) {
        this.scienceCheat = scienceCheat;
    }

    public void cheat(){
        scienceCheat.show();
    }
}
