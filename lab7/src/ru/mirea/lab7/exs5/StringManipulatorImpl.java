package ru.mirea.lab7.exs5;

public class StringManipulatorImpl implements StringManipulator {

    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String getOddCharacters(String s) {
        StringBuilder oddCharacters = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            char character = s.charAt(i);
            oddCharacters.append(character);
        }
        return oddCharacters.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}
