package ru.mirea.lab6.exs6789;

public class PrintableTest {
    public static void main(String[] args) {
        Book book1 = new Book("My book 1");
        Book book2 = new Book("My book 2");
        Shop shop1 = new Shop("Milk");
        Shop shop2 = new Shop("Cheese");
        Printable[] printables = {book1, book2, shop1, shop2};
        for(Printable printable: printables){
            printable.print();
        }
    }
}
