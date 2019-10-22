package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {

        //p = 2 * (L + h);
        //L = h * k;

        // p = 2 * (h*k+h); => p/2=h*(k+1); => h=(p/2)/(k+1);


        double h=(p/2)/(k+1);
        double L=h*k;
        double s=L*h;

        return s;
        }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}