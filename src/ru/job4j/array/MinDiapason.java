package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) throws Exception {
        if (finish>array.length)
        throw new Exception("Net takovo indeksa");
        
        int min = array[start];
        for (int i = start; i < finish; i++) {
            if (min>array[i]){
                min=array[i];
                break;
            }
        }
        return min;
    }
}