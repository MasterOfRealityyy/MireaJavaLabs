package ru.mirea.listtask1.task3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Add card");
            System.out.println("2. Delete card");
            System.out.println("3. Display cards");
            System.out.println("4. Clear cards");
            System.out.println("5. Check if Card Index is Empty");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Card card = new Card();
                    card.readAttributes();
                    list.addNode(card);
                    break;
                case 2:
                    System.out.print("Enter the name of the card to delete: ");
                    String nameToDelete = scanner.next();
                    list.deleteNode(nameToDelete);
                    break;
                case 3:
                    list.displayList();
                    break;
                case 4:
                    list.clearList();
                    System.out.println("Cards cleared");
                    break;
                case 5:
                    if (list.isEmpty()) {
                        System.out.println("Card Index is empty.");
                    } else {
                        System.out.println("Card Index is not empty.");
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}