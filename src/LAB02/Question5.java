package LAB02;


import java.util.Scanner;

public class Question5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val1= scan.nextInt();
        if(val1%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        scan.close();
    }
}