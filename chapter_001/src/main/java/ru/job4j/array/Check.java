package main.java.ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = false;
        int same_element_values_count=0;

        result=data.length==0;
        if (result) return result;
        else
        for (int i=0;i<data.length;i++)
        same_element_values_count=same_element_values_count+(data[i]?1:0);

        return (same_element_values_count==data.length);


    }
}