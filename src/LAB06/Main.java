package LAB06;

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for(int i=0;i<n;i++){
            Mail obj =new Mail(scan.next(),scan.next(),scan.next());
            System.out.println(obj.getEmailAndPass());
        }
        scan.close();
    }
}