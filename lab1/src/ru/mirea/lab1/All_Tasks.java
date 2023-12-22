package ru.mirea.lab1;
import java.util.Scanner;

public class All_Tasks {
    public static void main(String[] args) {
        Punkt_3();
        Punkt_4();
        Punkt_5(args);
        Punkt_6();
        System.out.println(Punkt_7(7));
    }

    public static void Punkt_3(){
        int[] mas = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int i = 0; i < mas.length; i++){
            sum += mas[i];
        }
        double average = sum / 10.0;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }

    public static void Punkt_4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число элементов массива:");
        int n = sc.nextInt();
        int[] mas = new int[n];
        System.out.println("Введите числа в массив через пробел:");
        int i = 0;
        do{
            mas[i] = sc.nextInt();
            i++;
        }while(n > i);
        int sum = 0, max = 0, min = 1000;
        int j = 0;
        while(j < n){
            sum += mas[j];
            if(max < mas[j]){
                max = mas[j];
            }
            if(min > mas[j]){
                min = mas[j];
            }
            j++;
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Макс. элемент " + max);
        System.out.println("Мин. элемент " + min);
    }


    public static void Punkt_5(String[] args){
        for(String x : args){
            System.out.println(x);
        }
    }

    public static void Punkt_6(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " число : " + "1/" + i);
        }
    }

    public static long Punkt_7(int f){
        long result = 1;
        for(int i = 1; i <= f; i++){
            result *= i;
        }
        return result;
    }

}