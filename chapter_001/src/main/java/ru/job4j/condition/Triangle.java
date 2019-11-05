package main.java.ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {

        //Нужно проверить. что ab + ac > dc и ac + bc > ab и ab + bc > ac. то этом случае треугольник существует.
        return (ab + ac > bc && ac + bc > ab && ab + bc > ac);
    }
}