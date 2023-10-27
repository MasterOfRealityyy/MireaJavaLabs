package ru.mirea.lab6.exs10;

public class Main {
    public static void main(String[] args) {
        Shop computerShop = new Shop();

        ComputerBrand brand = Input.enterBrand();
        Processor processor = Input.enterProcessor();
        Memory memory = Input.enterMemory();
        Monitor monitor = Input.enterMonitor();

        Computer computer = new Computer(brand, processor, memory, monitor);

        computerShop.addComputer(computer);

        Computer foundComputer = computerShop.findComputer(brand, processor.getModel(), memory.getSizeGB(), monitor.getType());

        if (foundComputer != null) {
            System.out.println("Найден компьютер:");
            System.out.println("Марка: " + foundComputer.getBrand());
            System.out.println("Процессор: " + foundComputer.getProcessor().getModel());
            System.out.println("Оперативная память: " + foundComputer.getMemory().getSizeGB() + " ГБ");
            System.out.println("Монитор: " + foundComputer.getMonitor().getType());
        } else {
            System.out.println("Компьютер не найден в магазине.");
        }
    }
}