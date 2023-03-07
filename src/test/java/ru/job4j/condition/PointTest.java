package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to11then0() {
        double expected = 0;
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to00then2dot82() {
        double expected = 2.82;
        Point a = new Point(2, 2);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to03then4dot24() {
        double expected = 4.24;
        Point a = new Point(3, 0);
        Point b = new Point(0, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when303to031then3ot6() {
        double expected = 3.6;
        Point a = new Point(3, 0, 3);
        Point b = new Point(0, 3, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when511to447then6dot16() {
        double expected = 6.16;
        Point a = new Point(5, 1, 1);
        Point b = new Point(4, 4, 7);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}