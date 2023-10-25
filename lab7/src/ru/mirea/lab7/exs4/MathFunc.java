package ru.mirea.lab7.exs4;

public class MathFunc implements MathCalculable {
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double complexModulus(double realPart, double imaginaryPart) {
        return Math.sqrt(Math.pow(realPart, 2) + Math.pow(imaginaryPart, 2));
    }
}