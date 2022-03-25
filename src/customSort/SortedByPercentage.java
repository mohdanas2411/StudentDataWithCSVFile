package customSort;

import student.Student;

import java.util.Comparator;

public class SortedByPercentage implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return (int) (s1.getPercentage()- s2.getPercentage());
    }
}
