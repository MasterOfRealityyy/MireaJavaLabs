package ru.mirea.lab2.exs8;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String[] a = {"1", "2", "3", "4", "5"};
        System.out.println("Before: ");
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length / 2; i++) {
            String temp = a[a.length - 1 - i];
            a[a.length - 1 - i] = a[i];
            a[i] = temp;
        }
        System.out.println("After: ");
        System.out.println(Arrays.toString(a));
    }
}