package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class PointTest {
    @Test
    public void testPointDistance() {

        int p1=1;
        int p2=4;
        int p3=6;
        int p4=14;

        double expected = 11.18;
        double out = Point.distance(p1,p2,p3,p4);
        Assert.assertEquals(expected, out, 0.02);

    }
}