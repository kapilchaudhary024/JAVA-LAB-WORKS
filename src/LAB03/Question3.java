package LAB03;

import java.util.Scanner;

public class Question3{
    double tempInFarenheit;
    Question3(double temp){
        tempInFarenheit=temp;
    }
    double calculateCelsisus(){
        return (tempInFarenheit-32)/1.8;
    }
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);
        Question3 obj=new Question3(scan.nextDouble());
        System.out.println(obj.calculateCelsisus());
        scan.close();
    }
}