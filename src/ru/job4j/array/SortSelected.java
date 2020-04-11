package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) throws Exception {
        for (int i=0;i<data.length;i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoop1.indexOf(data, min, i, data.length);
            data[index]=data[i];
            data[i]=min;
        }
        return data;
    }
}