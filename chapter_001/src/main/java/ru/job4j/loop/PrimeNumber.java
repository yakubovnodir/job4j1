package main.java.ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        int check=0;

        for (int i=2;i<=finish;i++)
        {
            for (int i1=1;i1<=i;i1++)
            {
                if (i%i1==0)
                {
                    check++;
                }
            }
            count+=check==2?1:0;
            check=0;
        }

        return count;
    }
}