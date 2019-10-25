package LAB04;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String name;
        char gender;
        int age;
        long rollno;
        String course;

        Scanner scan = new Scanner(System.in);
        name=scan.nextLine();
        age=scan.nextInt();
        gender=scan.next().charAt(0);
        rollno=scan.nextLong();
        course=scan.next();

        Student obj =new Student(name,age,gender,rollno,course);
        System.out.print(obj.toString());
        scan.close();
    }
}