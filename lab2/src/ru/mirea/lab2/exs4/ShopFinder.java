package ru.mirea.lab2.exs4;

public interface ShopFinder {
    void add(Computer computer);
    void delete(Computer computer);
    Computer findByName(String name) throws Exception;
    Computer findByCost(int cost) throws Exception;
}