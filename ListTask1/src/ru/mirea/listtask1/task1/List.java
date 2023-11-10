package ru.mirea.listtask1.task1;

import java.util.ArrayList;

public class List {
    private java.util.List<CardNode> cards;

    public List() {
        cards = new ArrayList<>();
    }

    public void addCard() {
        CardNode cardNode = new CardNode();
        cardNode.readAttributes();
        cards.add(cardNode);
    }

    public void removeCard(int index) {
        if (index >= 0 && index < cards.size()) {
            cards.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    public void displayCard(int index) {
        if (index >= 0 && index < cards.size()) {
            CardNode cardNode = cards.get(index);
            cardNode.displayAttributes();
        } else {
            System.out.println("Invalid index");
        }
    }

    public void clearCards() {
        cards.clear();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}