package ru.job4j.condition;

public class AlgorithmMaxNumber {
    public static int maxNumber(int a, int b, int c) {
        int result;
        if (a > b) {
            if (a > c) {
                result = a;
            } else {
                result = c;
            }
        } else {
            if (c > b) {
                result = c;
            } else {
                result = b;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxNumber(3, 4, 7));
    }
}
