package ru.mirea.lab25;




import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exs6 {
    public static boolean checkEmail(String s){
        Matcher m = Pattern.compile(
                "[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+").matcher(s);
        return m.find() && m.group().equals(s);
    }


    public static void main(String[] args) {

        System.out.println();
        System.out.println(checkEmail("user@example.com"));
        System.out.println(checkEmail("myhost@@@com.ru"));
        System.out.println(checkEmail("@my.ru"));

    }
}