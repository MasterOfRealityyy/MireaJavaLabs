package ru.mirea.lab25;

public class Exs2 {

    public static boolean isThatStr(String s){
        return s.equals("abcdefghijklmnopqrstuv18340");
    }

    public static void main(String[] args) {

        System.out.println(isThatStr("abcdefghijklmnopqrstuv18340"));
        System.out.println(isThatStr("abcdefghijklmnoasdfasdpqrstuv18340"));
        System.out.println();

    }
}