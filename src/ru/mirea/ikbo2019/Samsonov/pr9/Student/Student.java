package ru.mirea.ikbo2019.Samsonov.pr9.Student;
public class Student implements Comparable<Student>{
    private final String name;
    private final int grade;

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.grade, o.getGrade());
        //return Integer.compare(this.ID, o.getID());
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                " name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
