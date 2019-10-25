package LAB10;

import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.TreeSet;

class HashSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> list = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            int r = (int) (Math.random() * 10);
            list.add(new Student(r, "S" + r));
        }
        System.out.println(list);
    }
}
class Student implements Comparable<Student>{
    private int rollNumber;
    private String name;
    private static int current = 1;

    @Override
    public String toString() {
        return "|" + this.getRollNumber()
                + " " + this.getName() + "|";
    }

    public Student() {
        this.rollNumber = current;
        this.name = "Student " + current++;
    }

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(@NotNull Student student) {
        return this.getRollNumber() - student.getRollNumber();
    }
}