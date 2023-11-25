package ru.mirea.lab18;

import java.util.Scanner;

public class Exs7_2 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Exs7_2 demo = new Exs7_2();
        try {
            demo.getKey();
        } catch (Exception e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }
    }
}
