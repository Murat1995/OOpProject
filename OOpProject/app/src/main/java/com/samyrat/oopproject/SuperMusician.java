package com.samyrat.oopproject;

public class SuperMusician extends Musician{
    //Inheritance

    public SuperMusician(String name, String instrument, int age) {
        super(name, instrument, age);
    }

    public String sing(){
        return "Nothing Else Matters";
    }

}
