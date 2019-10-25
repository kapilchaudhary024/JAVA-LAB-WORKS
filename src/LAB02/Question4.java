package LAB02;

import java.util.Scanner;

public class Question4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val1= scan.nextInt();
        if(val1==0){
            System.out.println("Zero");
        }
        else if(val1>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
        scan.close();
    }
}