package LAB04;

import java.util.Scanner;

public class Student extends Person{
    private long uniRollNumber;
    private String courseName;

    public Student(String name,int age,char gender,long uniRollNumber,String courseName){
        super(name,age,gender);
        this.uniRollNumber=uniRollNumber;
        this.courseName=courseName;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Myself "+getName()+". I am "+getAge()+" years old . I am a");
        if (getGender()=='m')
            str.append(" Male");
        else
            str.append(" Female");
        str.append(" I study "+courseName+" and roll number is "+uniRollNumber);
        return str.toString();
    }

}