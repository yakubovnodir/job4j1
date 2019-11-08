package main.java.ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {



        int result = (first>second && first>third)?first:(second>first && second>third)?second:(third>first && third>second)?third:third;
        return result;
    }
}