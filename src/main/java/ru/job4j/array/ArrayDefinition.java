package ru.job4j.array;

import java.sql.Array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages " + ages.length);
        System.out.println("Размер массива surnames " + surnames.length);
        System.out.println("Размер массива prices " + prices.length);
        System.out.println();

        String[] names = new String[4];
        names[0] = "Алёша";
        names[1] = "Понкрат";
        names[2] = "Алессандра";
        names[3] = "Патриция";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
