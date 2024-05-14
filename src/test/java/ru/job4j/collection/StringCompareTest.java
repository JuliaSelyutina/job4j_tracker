package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class StringCompareTest {
    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenFirstIsEmptyAndSecondIsEmptyThenZero() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "",
                ""
        );
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenFirstIsEmptyThenShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "",
                "Second string"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenSecondIsEmptyThenShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "First string",
                ""
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenFirstIsNullAndSecondIsNullThenZero() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                null,
                null
        );
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenFirstIsNullThenShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                null,
                "Second string"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenSecondIsNullThenShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "First string",
                null
        );
        assertThat(result).isGreaterThan(0);
    }
}
