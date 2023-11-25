package ru.mirea.lab18;

import java.util.Scanner;

public class Exs1_2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString); System.out.println( 2 / i );
    }

    public static void main(String[] args) {
        Exs1_2 task = new Exs1_2();
        task.exceptionDemo();
    }
}