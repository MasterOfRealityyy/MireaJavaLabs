package ru.mirea.lab8.exs6;

public class Task6 {
    static String task_6(int n, int i) {
        // i должен быть равен 2.
        if (n < 2) {
            return "NO";
        }
        else if (n == 2) {
            return "YES";
        }
        else if (n % i == 0) {
            return "NO";
        }
        else if (i < n / 2) {
            return task_6(n, i + 1);
        } else {
            return "YES";
        }
    }

    public static void main(String[] args) {
        System.out.println(task_6(20, 2));
    }
}
