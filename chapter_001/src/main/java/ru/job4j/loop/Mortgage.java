package main.java.ru.job4j.loop;

public class Mortgage {
    public int year(double amount, double salary, double percent) {
        int year = 0;

        while (amount>0)
        {
            amount=(amount+(amount*percent/100))-salary;
            year++;
        }

        return year;
    }
}