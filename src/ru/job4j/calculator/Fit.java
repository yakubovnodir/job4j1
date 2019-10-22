package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        //Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
        double ideal_weigth= (height-100)*1.15;
        return ideal_weigth;
    }


    public static double womanWeight(double height) {
        //Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
        double ideal_weigth= (height-110)*1.15;
        return ideal_weigth;
    }

    public static void main(String[] args) {

        double man_height=180;
        double woman_height=160;

        double man = manWeight(man_height);
        System.out.println("Man "+man_height+" is " + man);

        double woman = womanWeight(woman_height);
        System.out.println("Woman "+woman_height+" is " + woman);
    }
}