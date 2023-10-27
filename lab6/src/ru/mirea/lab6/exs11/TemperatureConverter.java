package ru.mirea.lab6.exs11;

public class TemperatureConverter  implements  Convertable{
    public void convert(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 9/5 + 32;

        System.out.println(celsius + " градусов Цельсия = " + kelvin + " градусов Кельвина");
        System.out.println(celsius + " градусов Цельсия = " + fahrenheit + " градусов Фаренгейта");
    }
}
