package ru.mirea.lab25;

import java.util.regex.Pattern;

public class Exs4 {
    public static boolean hasDigitPlus(String s){
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }

    public static void main(String[] args) {

        System.out.println(hasDigitPlus("(1 + 8) – 9 / 4"));
        System.out.println(hasDigitPlus("6 / 5 – 2 * 9 "));
        System.out.println();

    }
}