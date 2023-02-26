package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 8;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when15and312and62Then20dot499() {
        Point a = new Point(1, 5);
        Point b = new Point(3, 12);
        Point c = new Point(6, 2);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 20.499;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when90and123and145ThenNegative1() {
        Point a = new Point(9, 0);
        Point b = new Point(12, 3);
        Point c = new Point(14, 5);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = -1;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }
}
