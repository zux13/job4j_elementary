package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result;
        if (left == right) {
            result = left;
        } else {
            result = left > right ? left : right;
        }
        return result;
    }
}
