package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayEnThen1() {
        String in = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 1;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void whenSundayRuThen7() {
        String in = "Воскресенье";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 7;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void whenErrorRuThenMinus1() {
        String in = "Ошибка";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = -1;
        assertThat(expected).isEqualTo(result);
    }
}