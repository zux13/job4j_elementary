package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result += concat(symbol, counter);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result += concat(symbol, counter);
        return result;
    }

    public static String concat(char symbol, int counter) {
        return String.valueOf(symbol) + (counter == 1 ? "" : counter);
    }
}