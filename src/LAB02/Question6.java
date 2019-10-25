package LAB02;


import java.util.Scanner;

public class Question6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String al1= scan.nextLine();
        char s1=al1.charAt(0);
        char s2=al1.charAt(2);
        if (s1>s2)
            System.out.println(s2+" "+s1);
        else
            System.out.println(s1+" "+s2);
        scan.close();
    }
}