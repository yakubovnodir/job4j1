package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i=1;i<=bound;i++)
        rst[i-1]=i;
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}