package main.java.ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = false;

        result=data.length==0;
        if (result) return result;
        else {

            for (int i = 0; i < data.length; i++)
            {
                if (data[0]!=data[i])
                {
                    result=false;
                    return result;
                }
            }
            result=true;
        }
        return (result);
    }
}