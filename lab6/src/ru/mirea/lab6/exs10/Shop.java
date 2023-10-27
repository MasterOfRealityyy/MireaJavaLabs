package ru.mirea.lab6.exs10;
import java.util.ArrayList;
class Shop {
    private ArrayList<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер добавлен в магазин.");
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
        System.out.println("Компьютер удален из магазина.");
    }

    public Computer findComputer(ComputerBrand brand, String processorModel, int memorySizeGB, String monitorType) {
        for (Computer computer : computers) {
            if (computer.getBrand() == brand &&
                    computer.getProcessor().getModel().equals(processorModel) &&
                    computer.getMemory().getSizeGB() == memorySizeGB &&
                    computer.getMonitor().getType().equals(monitorType)) {
                return computer;
            }
        }
        return null;
    }
}