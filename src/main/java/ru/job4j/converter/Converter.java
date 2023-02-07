package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

   public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
   }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);

        in = 150;
        expected = 2.5f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("150 rubles are 2.5 dollars. Test result : " + passed);
    }
}
