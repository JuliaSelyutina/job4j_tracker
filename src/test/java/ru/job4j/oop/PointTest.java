package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when0100to0100then0() {
        double expected = 0;
        Point a = new Point(0, 10, 0);
        Point b = new Point(0, 10, 0);
        double delta = 0.01;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when012to345then5dot2() {
        double expected = 5.19;
        Point a = new Point(0, 1, 2);
        Point b = new Point(3, 4, 5);
        double delta = 0.01;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when555to666then1dot73() {
        double expected = 1.73;
        Point a = new Point(5, 5, 5);
        Point b = new Point(6, 6, 6);
        double delta = 0.01;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double delta = 0.01;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when34to08then5() {
        double expected = 5;
        Point a = new Point(3, 4);
        Point b = new Point(0, 8);
        double delta = 0.01;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when17to1030then24dot7() {
        double expected = 24.7;
        Point a = new Point(1, 7);
        Point b = new Point(10, 30);
        double delta = 0.01;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when1325to1827then5dot39() {
        double expected = 5.39;
        Point a = new Point(13, 25);
        Point b = new Point(18, 27);
        double delta = 0.01;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when66to54then2dot24() {
        double expected = 2.24;
        Point a = new Point(6, 6);
        Point b = new Point(5, 4);
        double delta = 0.01;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, delta);
    }
}
