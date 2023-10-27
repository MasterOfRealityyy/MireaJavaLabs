package ru.mirea.lab9.exs1;

class Student implements Comparable<Student> {
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

