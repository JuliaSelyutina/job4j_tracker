package ru.job4j.ex;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactTest {
    @Test
    public void whenException() {
        int n = -100;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Fact.calc(n);
                }
                );
        assertThat(exception.getMessage()).isEqualTo("N could not be less than 0");
    }

    @Test
    public void when0Than1() {
        int n = 0;
        int expected = 1;
        int result = Fact.calc(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when1Than1() {
        int n = 1;
        int expected = 1;
        int result = Fact.calc(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when5Than120() {
        int n = 5;
        int expected = 120;
        int result = Fact.calc(n);
        assertThat(result).isEqualTo(expected);
    }
}
