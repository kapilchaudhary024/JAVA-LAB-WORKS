package LAB03;


import  java.util.Scanner;

public class Question1{
    int n;
    double sum;
    Question1 (int n){
        this.n=n;
        this.sum=0.0;
    }
    double calculateSum(){
        for(int i=1;i<=n;i++){
            sum+=(double)1/i;
        }
        return sum;
    }
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        Question1 obj=new Question1(scan.nextInt());
        System.out.println(obj.calculateSum());
        scan.close();
    }

}