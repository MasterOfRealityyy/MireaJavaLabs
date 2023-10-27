package ru.mirea.lab6.exs13;

import java.util.ArrayList;
import java.util.List;

class ObservableStringBuilder {

    private final StringBuilder stringBuilder;
    private final List<Observer> observers;

    public ObservableStringBuilder() {
        this.stringBuilder = new StringBuilder();
        this.observers = new ArrayList<>();
    }

    public void append(String str) {
        stringBuilder.append(str);
        notifyObservers();
    }

    public void delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String toString() {
        return stringBuilder.toString();
    }
}
