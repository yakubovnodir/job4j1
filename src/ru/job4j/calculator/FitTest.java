package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;


public class FitTest {

    @Test
    public void manWeigthTest() {

        double in = 170;
        double expected = 80.5-0.01;
        double out =Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.03);

    }

    @Test
    public void womanWeigthTest() {

        double in = 160;
        double expected = 57.5;
        double out =Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }
}