package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void testSqAreaSquare() {

        int p_in=6;
        int k_in=2;


        double expected = 2;
        double out = SqArea.square(p_in,k_in);
        Assert.assertEquals(expected, out, 0.01);

    }
}