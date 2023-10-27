package ru.mirea.lab8.exs5;

public class Task5 {
    static int task_5(int number) {
        return (number == 0) ? 0 : (number % 10) + task_5(number / 10);
    }

    public static void main(String[] args) {
        System.out.println(task_5(135));
    }

}
