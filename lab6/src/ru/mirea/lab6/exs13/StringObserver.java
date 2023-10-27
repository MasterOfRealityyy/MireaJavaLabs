package ru.mirea.lab6.exs13;

class StringObserver implements Observer {
    private final ObservableStringBuilder observableStringBuilder;

    public StringObserver(ObservableStringBuilder observableStringBuilder) {
        this.observableStringBuilder = observableStringBuilder;
        this.observableStringBuilder.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Строка была изменена. Новое содержимое: " + observableStringBuilder.toString());
    }
}

