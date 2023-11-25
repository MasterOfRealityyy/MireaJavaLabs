package ru.mirea.lab18;

public class Exs6 {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            // Обработка исключения
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Exs6 demo = new Exs6();

        //Выполнение с правильным значением ключа
        demo.printMessage("validKey");

        //Выполнение с нулем в ключе
        try {
            demo.printMessage(null);
        } catch (NullPointerException e) {
            // Обработка исключения
            System.out.println("Caught NullPointerException in main: " + e.getMessage());
        }
    }
}