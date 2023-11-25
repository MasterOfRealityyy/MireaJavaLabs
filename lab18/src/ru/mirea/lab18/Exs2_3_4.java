package ru.mirea.lab18;


public class Exs2_3_4 {
    public void exceptionDemo() {

        try {
            System.out.println(2 / 0);

        } catch (Exception e) {
            System.out.println("Поймали исключение Exception");

        } finally {
            System.out.println("Это всегда будет в консоли");
        }
    }

    public static void main(String[] args) {
        Exs2_3_4 task = new Exs2_3_4();
        task.exceptionDemo();
    }
}