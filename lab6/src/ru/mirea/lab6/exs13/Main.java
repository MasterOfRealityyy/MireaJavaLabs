package ru.mirea.lab6.exs13;

public class Main {
    public static void main(String[] args) {
        ObservableStringBuilder observableStringBuilder = new ObservableStringBuilder();
        StringObserver observer = new StringObserver(observableStringBuilder);

        observableStringBuilder.append("Hello, ");
        observableStringBuilder.append("world!");
        observableStringBuilder.delete(5, 12);
    }
}