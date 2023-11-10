package ru.mirea.listtask1.task3;

import java.util.Scanner;

class Card {
    String name;
    private int age;

    public void readAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }

    public void displayAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Node {
    Card data;
    Node next;

    public Node(Card data) {
        this.data = data;
        this.next = null;
    }

    public Card getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void addNode(Card data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            newNode.setNext(head);
        } else {
            Node current = head;
            while (current.getNext() != head) {
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setNext(head);
        }
    }

    public void deleteNode(String name) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        ru.mirea.listtask1.task3.Node currNode = head, prevNode = null;
        do {
            if (currNode.data.name.equals(name)) {
                if (prevNode == null) {
                    ru.mirea.listtask1.task3.Node lastNode = head;
                    while (lastNode.next != head) {
                        lastNode = lastNode.next;
                    }
                    head = currNode.next;
                    lastNode.next = head;
                } else {
                    prevNode.next = currNode.next;
                }
                System.out.println("Node with name '" + name + "' deleted.");
                return;
            }
            prevNode = currNode;
            currNode = currNode.next;
        } while (currNode != head);

        System.out.println("Node with name '" + name + "' not found.");
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node current = head;
            do {
                current.getData().displayAttributes();
                current = current.getNext();
            } while (current != head);
        }
    }

    public void clearList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

