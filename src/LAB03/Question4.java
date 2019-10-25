package LAB03;


import java.util.Scanner;

public class Question4{
    int n;
    Question4(int n){
        this.n=n;
    }
    void pattern(){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Question4 obj =new Question4(scan.nextInt());
        obj.pattern();
        scan.close();
    }
}