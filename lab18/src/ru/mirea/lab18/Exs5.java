package ru.mirea.lab18;

public class Exs5 {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }

        } catch (NullPointerException e) {

            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Exs5 demo = new Exs5();
        demo.getDetails(null);
    }
}