package ru.mirea.lab9.exs2;
import java.util.Comparator;
class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getGpa() < student2.getGpa()) {
            return 1;
        } else if (student1.getGpa() > student2.getGpa()) {
            return -1;
        } else {
            return 0;
        }
    }
}
