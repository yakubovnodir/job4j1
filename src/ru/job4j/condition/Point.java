package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
       double result =
               Math.sqrt(
                       (  Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)  )
               );

       return result;
    }

    public static void main(String[] args) {
        int x1=1;
        int y1=4;
        int x2=6;
        int y2=14;

        double result = distance(x1, y1, x2, y2);
        System.out.println("result ("+x1+", "+y1+") to ("+x2+", "+y2+") " + result);
    }
}