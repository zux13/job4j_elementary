package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import  static org.assertj.core.api.Assertions.assertThat;

public class SwitchWeekTest {

    @Test
    public void when1thenMonday() {
        int in = 1;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Понедельник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when5thenFriday() {
        int in = 5;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Пятница";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when8thenErr() {
        int in = 8;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Ошибка";
        assertThat(result).isEqualTo(expected);
    }
}