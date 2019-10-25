package LAB04;

import java.util.Scanner;

public class Person{

    private String name;
    private int age;
    private char gender;

    //methods of Person class

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public char getGender(){
        return gender;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setGender(char gender){
        this.gender=gender;
    }

    public Person(String name,int age,char gender){
        introduction();
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public void introduction(){
        System.out.println("Hello, My name is Tarun.");
        System.out.println("The program you are going to use is developed by me.");
        System.out.println("I am from Etah,Uttar Pradesh,India.");
        System.out.println("I am pursuing Bachelor's Degree in Engineering in Computer Science major from G.L.A. University Mathura.");
        System.out.println("So go and use this program.");
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Myself "+getName()+". I am "+getAge()+" years old . I am a");
        if (gender=='m')
            str.append(" Male");
        else
            str.append(" Female");
        return str.toString();
    }
}