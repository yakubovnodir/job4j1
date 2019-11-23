package main.java.ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 1;
//        int check=0;

        for (int i=2;i<=finish;i++)
        {

            for (int i1=2;i1<i;i1++)
            {
                if (i%i1==0) break;
                if (i1==i-1) count++;
            }


        }

        return count;
    }
}