package ru.mirea.listtask1.task2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        List list = new List();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add element");
            System.out.println("2. Delete element");
            System.out.println("3. Display element");
            System.out.println("4. Clear list");
            System.out.println("5. Check if Card Index is Empty");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    list.addElement();
                    break;
                case 2:
                    list.deleteElement();
                    break;
                case 3:
                    list.displayElement();
                    break;
                case 4:
                    list.clearList();
                    break;
                case 5:
                    if (list.isEmpty()) {
                        System.out.println("Card Index is empty.");
                    } else {
                        System.out.println("Card Index is not empty.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 0);
    }
}