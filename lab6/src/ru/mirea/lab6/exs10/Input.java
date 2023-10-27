package ru.mirea.lab6.exs10;

import java.util.Scanner;

public interface Input {
    Scanner scanner = new Scanner(System.in);

    static ComputerBrand enterBrand() {
        System.out.println("Введите марку компьютера (HP, DELL, ASUS, ACER): ");
        String input = scanner.nextLine().toUpperCase();
        return ComputerBrand.valueOf(input);
    }

    static Processor enterProcessor() {
        System.out.println("Введите модель процессора: ");
        String model = scanner.nextLine();
        return new Processor(model);
    }

    static Memory enterMemory() {
        System.out.println("Введите объем оперативной памяти (в ГБ): ");
        int sizeGB = scanner.nextInt();
        scanner.nextLine();
        return new Memory(sizeGB);
    }

    static Monitor enterMonitor() {
        System.out.println("Введите тип монитора: ");
        String type = scanner.nextLine();
        return new Monitor(type);
    }
}


