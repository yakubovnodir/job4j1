package main.java.ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int i=0;i<height;i++ ) {
            for (int i1=0;i1<width;i1++ ) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X                \
                if ((i1+i)%2==0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            // добавляем перевод на новую строку.
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        paint(5, 5);
//        System.out.println();
//        paint(4, 4);
//        System.out.println();
//        paint(14, 4);



    }
}