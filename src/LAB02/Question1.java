package LAB02;

import java.util.Scanner;

public class Question1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine().trim();
        System.out.println("Welcome ,"+userName+"!");
        scan.close();
    }
}