package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {

        int in_r_to_e = 140;
        int expected_r_to_e = 2;
        int out_r_to_e = (int)Converter.rubleToEuro((double)in_r_to_e);
        Assert.assertEquals(expected_r_to_e, out_r_to_e);
    }

    @Test
    public void rubleToDollar() {
        int in_r_to_d = 120;
        int expected_r_to_d = 2;
        int out_r_to_d = Converter.rubleToDollar(in_r_to_d);
        Assert.assertEquals(expected_r_to_d, out_r_to_d);

    }

    @Test
    public void dollarToRuble() {
        int in = 2;
        int expected = 120;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void euroToRuble() {
        int in = 2;
        int expected = 140;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);

    }
}