package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(double value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value*70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {

        int rubles=120;
        int dollar=10;
        int euro=15;

        double ruble_to_dollar=rubleToDollar(rubles);
        System.out.println(rubles+" rubles are " + ruble_to_dollar + " dollar.");

        double ruble_to_euro=rubleToEuro(rubles);
        System.out.println(rubles+" rubles are " + ruble_to_euro + " euro.");

        int euro_to_ruble=euroToRuble(euro);
        System.out.println(euro+" euro are " + euro_to_ruble + " rubles.");

        int dollar_to_ruble=dollarToRuble(dollar);
        System.out.println(dollar+" dollars are " + dollar_to_ruble + " rubles.");

        int expected_result_from_ruble_to_dollar=2;
        boolean test=ruble_to_dollar==expected_result_from_ruble_to_dollar;
        System.out.println(rubles+" rubles to dollar are 2 , test result is " + test );

        double expected_result_from_ruble_to_euro=(double)120/70;
        test=ruble_to_euro==expected_result_from_ruble_to_euro;
        System.out.println(rubles+" rubles to euro are "+(double)120/70+" , test result is " + test );

        int expected_result_from_dollar_to_ruble=600;
        test=dollar_to_ruble==expected_result_from_dollar_to_ruble;
        System.out.println(dollar+" dollar to rubles are 600 , test result is " + test );

        int expected_result_from_euro_to_ruble=1050;
        test=euro_to_ruble==expected_result_from_euro_to_ruble;
        System.out.println(euro+" euro to rubles are 1050 , test result is " + test );
    }
}
