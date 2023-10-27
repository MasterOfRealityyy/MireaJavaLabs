package ru.mirea.lab11.exs1;

import java.util.Calendar;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String developerName = "Гераськин";

        // Дата и время получения задания
        Date dateOfReception = new Date();

        // Дата и время сдачи задания
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfReception);
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        Date dateOfSubmission = calendar.getTime();

        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + dateOfReception);
        System.out.println("Дата и время сдачи задания: " + dateOfSubmission);
    }
}