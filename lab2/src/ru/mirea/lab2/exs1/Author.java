package ru.mirea.lab2.exs1;


public class Author {
    private final String name;
    private String email;
    private final char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}

class TestAuthor{
    public static void main(String[] args) {
        Author a1 = new Author("Name", "E-mail@yandex.ru", 'm');
        System.out.println(a1);
        a1.setEmail("E-mail@mail.ru");
        System.out.println(a1);
        System.out.println("name: " + a1.getName() + ", email: "
                + a1.getEmail() + ", gender: " + a1.getGender());
    }
}