package ru.mirea.lab25;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exs3 {



    public static ArrayList<String> findRubEurUsd(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(findRubEurUsd("20.3 RUB, ERR3.789USD, 44 ERR, 0.004 EU"));
        System.out.println();

    }
}