package com.samyrat.oopproject;

public class Piano implements Insturment,HouseDecor {
    String brand;
    boolean digital;


    /**
     *
     */
    @Override
    public void info() {
        System.out.println("override method");

    }
}
