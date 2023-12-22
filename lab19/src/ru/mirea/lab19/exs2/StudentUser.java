package ru.mirea.lab19.exs2;


import java.util.Arrays;
import java.util.Scanner;

public class StudentUser implements Student {
    private String fullName;
    private double averageGrade;

    public StudentUser(String fullName, double averageGrade) {
        this.fullName = fullName;
        this.averageGrade = averageGrade;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public double getAverageGrade() {
        return averageGrade;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Student[] students = {
                new StudentUser("Васильев Василий Васильевич", 4.5),
                new StudentUser("Иванов Иван Иванович", 3.8),
                new StudentUser("Петров Петр Петрович", 4.2)
        };


        Arrays.sort(students, (s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade()));


        System.out.println("Отсортированный список студентов:");
        for (Student student : students) {
            System.out.println(student.getFullName() + ": " + student.getAverageGrade());
        }


        System.out.println("\nВведите ФИО студента для поиска:");
        String searchName = scanner.nextLine();

        try {
            // Пытаемся найти студента по ФИО
            Student foundStudent = findStudentByName(students, searchName);
            System.out.println("Студент найден: " + foundStudent.getFullName() +
                    ", Средний балл: " + foundStudent.getAverageGrade());
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


    private static Student findStudentByName(Student[] students, String fullName) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО " + fullName + " не найден.");
    }
}