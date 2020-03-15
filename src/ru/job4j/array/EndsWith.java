package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int pLength=post.length;
        int wLength=word.length;

        if (pLength<wLength)
        for (int i=1;i<pLength;i++) {
            if (word[wLength-i]!=post[pLength-i]) {
                result=false;
                break;
            }
        }
        else
        result=false;

        return result;
    }
}