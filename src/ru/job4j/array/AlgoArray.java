package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
     //   int temp = array[0]; // переменная для временного хранения значение ячейки с индексом 0.
      //  array[0] = array[3]; // записываем в ячейку с индексом 0 значение ячейки с индексом 3.
       // array[3] = temp; // записываем в ячейку с индексом 3 значение временной переменной.

        for (int index = 0; index < array.length; index++) {
       //     System.out.println(array[index]);
        }

        //1. Сортировка
        //1.1. Копирование всех элементов на массив temp_array
        int[] temp_array = new int[array.length];
        //1.2. Проверка и сортировка значений массива по возрастанию
        for (int j=0;j<temp_array.length;j++)
        {
            int temp1=array[0];
            for (int i=0;i<array.length;i++){
                if (temp1>=array[i])
                    temp1=array[i];
            }
            temp_array[j]=temp1;

            for (int i=0;i<array.length;i++)
            {
                if (temp1==array[i]) array[i]=999999;
            }
        }
        array=temp_array;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }


    }
}