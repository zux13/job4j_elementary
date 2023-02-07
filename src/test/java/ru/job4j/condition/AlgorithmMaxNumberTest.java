package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AlgorithmMaxNumberTest {

    @Test
    public void whenA1B2C3Then3() {
        int a = 1;
        int b = 2;
        int c = 3;
        int result = AlgorithmMaxNumber.maxNumber(a, b, c);
        int expected = 3;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void whenA5B4C3Then5() {
        int a = 5;
        int b = 4;
        int c = 3;
        int result = AlgorithmMaxNumber.maxNumber(a, b, c);
        int expected = 5;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void whenAminus1B8C2Then8() {
        int a = -1;
        int b = 8;
        int c = 2;
        int result = AlgorithmMaxNumber.maxNumber(a, b, c);
        int expected = 8;
        Assertions.assertEquals(expected, result);
    }
}