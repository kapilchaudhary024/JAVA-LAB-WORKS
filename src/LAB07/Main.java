package LAB07;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        User obj =new User(scan.next().trim(),scan.next().trim(),scan.nextInt());
        System.out.print(obj.userId());
        scan.close();
    }
}