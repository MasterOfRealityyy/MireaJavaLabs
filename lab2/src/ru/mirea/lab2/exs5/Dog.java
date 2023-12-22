package ru.mirea.lab2.exs5;

import java.util.Arrays;

public class Dog {
    private String nickname;
    private int age;

    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int toHumanAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}

class DogKennel {
    Dog[] dogs;

    public DogKennel(Dog[] dogs) {
        this.dogs = dogs;
    }

    public void add(Dog dog) {
        Dog[] temp = dogs.clone();
        dogs = new Dog[temp.length + 1];
        System.arraycopy(temp, 0, dogs, 0, temp.length);
        dogs[dogs.length - 1] = dog;
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Dog1", 4);
        dogs[1] = new Dog("Dog2", 2);
        dogs[2] = new Dog("Dog3", 6);
        DogKennel kennel = new DogKennel(dogs);
        kennel.add(new Dog("1", 10));
        kennel.add(new Dog("2", 5));
        System.out.println(kennel);

    }

    @Override
    public String toString() {
        return "DogKennel{" +
                "dogs=" + Arrays.toString(dogs) +
                '}';
    }
}