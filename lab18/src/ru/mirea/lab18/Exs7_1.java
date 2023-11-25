package ru.mirea.lab18;

import java.util.Scanner;

public class Exs7_1 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            // Обработка исключения
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    private String getDetails(String key) {
        if (key.equals("")) {
            throw new IllegalArgumentException("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Exs7_1 demo = new Exs7_1();
        demo.getKey();
    }
}
