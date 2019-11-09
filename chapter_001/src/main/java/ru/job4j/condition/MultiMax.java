package main.java.ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {



        int result = 0;//(first>second && first>third)?first:(second>first && second>third)?second:(third>first && third>second)?third:third;

        if (first>second && first>third)
        {
            result=first;
        }
        else if (second>first && second>third)
        {
            result=second;
        }
        else if (third>first && third>second)
        {
            result=third;
        }

        return result;
    }
}