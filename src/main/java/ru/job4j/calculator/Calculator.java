package ru.job4j.calculator;

public class Calculator {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        short s = 1500;
        char c = (char) s;
        double d = c;
        c  = (char) d;

        System.out.println("s = " + s);
        System.out.println("d = " + d);
        System.out.println("c = " + c);
    }
}
