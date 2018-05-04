package com.company;

import java.util.Date;

public class Main {

    static double velocitycalc(double distance,double timeinmin){
        return distance/timeinmin;
    }
    public static void main(String[] args) {
         final double distance=10.5;
         final double timeinmin = 0.5;
        //System.out.println("Today is ");
        //System.out.println(new Date());
//        System.getProperties().list(System.out);
//        System.out.println(System.getProperty("user.name"));
//        System.out.println(System.getProperty("java.library.path"));

        /*System.out.println(First.i);
        System.out.println(First.c);
        First.printHello();*/

        System.out.println(velocitycalc(distance,timeinmin));






    }
}
