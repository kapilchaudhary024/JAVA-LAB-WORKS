package LAB02;

import java.util.Scanner;

public class Question8{
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);
        char c=scan.nextLine().charAt(0);
        if ((c>='a' && c<='z')||(c>='A'&&c<='Z'))
            System.out.println("alphabet");
        else if(c>='0'&&c<='9')
            System.out.println("digit");
        else
            System.out.println("special");
    }
}
