package main.java.ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;

        CheckPrimeNumber check = new CheckPrimeNumber();

        for (int i=finish;i>1;i--)
        {

            if(check.check(i)) {

                count++;

            }

        }

        return count;
    }
}