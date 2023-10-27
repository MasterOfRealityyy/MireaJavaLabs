package ru.mirea.lab9.exs2;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Алексей", 87),
                new Student("Ирина", 95),
                new Student("Дмитрий", 75),
                new Student("Елена", 99),
                new Student("Мария", 80)
        };

        java.util.Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("Список студентов, отсортированный по убыванию баллов:");
        for (Student student : students) {
            System.out.println("Имя: " + student.getName() + ", Итоговый балл: " + student.getGpa());
        }
    }
}
