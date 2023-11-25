package ru.mirea.lab18;

public class Exs1 {
    public void exceptionDemo() {
        System.out.println(2.0 / 0.0);
    }

    public static void main(String[] args) {
        Exs1 task = new Exs1();
        task.exceptionDemo();
    }
}