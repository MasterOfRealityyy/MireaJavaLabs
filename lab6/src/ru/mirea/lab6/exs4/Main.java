package ru.mirea.lab6.exs4;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Apple", 1.99);
        System.out.println(product.getPrice());
        Car car = new Car("Toyota", 20000.00);
        System.out.println(car.getPrice());
    }
}
