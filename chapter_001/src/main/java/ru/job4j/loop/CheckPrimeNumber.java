package main.java.ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = false;
        int check=0;

        for (int i=1;i<=num;i++)
        {
            if (num%i==0)
            {
                check++;
            }
        }
        prime=check==2;
        return prime;
    }
}