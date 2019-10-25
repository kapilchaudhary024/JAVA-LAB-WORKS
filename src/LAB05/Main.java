package LAB05.BottleNeckQuestion;


import java.util.Scanner;
import java.util.Arrays;

public class Main{
    int n;
    int []a;
    Main(){
        Scanner scan =new Scanner(System.in);
        n=scan.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        scan.close();
        System.out.println("Hello World");
    }
    public void print(){
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    }
    public static void main(String []args){
        Main obj=new Main();
    }
}