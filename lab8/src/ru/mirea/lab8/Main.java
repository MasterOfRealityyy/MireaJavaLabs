package ru.mirea.lab8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество цифр (k): ");
        int k = scanner.nextInt();

        System.out.print("Введите сумму цифр (s): ");
        int s = scanner.nextInt();

        int count = countNumbers(k, s);
        System.out.println("Количество чисел: " + count);
    }

    public static int countNumbers(int k, int s) {
        // Проверка на некорректные значения
        if (k <= 0 || s < 0 || s > 9 * k) {
            return 0;
        }

        // Инициализация начальных значений
        int count = 0;
        int[] digits = new int[k];
        digits[0] = 1; // Первая цифра не может быть 0

        // Генерация чисел
        while (true) {
            // Проверяем, что сумма цифр равна s
            int sum = getSum(digits);
            if (sum == s) {
                count++;
            }

            // Переходим к следующему числу
            int index = k - 1;
            while (index >= 0 && digits[index] == 9) {
                digits[index] = 0;
                index--;
            }
            if (index < 0) {
                break;
            }
            digits[index]++;
        }

        return count;
    }

    public static int getSum(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
}