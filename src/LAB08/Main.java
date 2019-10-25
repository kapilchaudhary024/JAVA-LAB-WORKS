package LAB08;


import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int noOfLed=scan.nextInt();
        LedStrip obj=new LedStrip();
        obj.lenLedStrip(noOfLed);
        for(int i=0;i<noOfLed;i++){
            obj.setLeds(scan.next().strip(),scan.nextBoolean(),i);
        }
        if(obj.defective())
            System.out.println("Strip is Defective");
        else
            System.out.println("Strip is Not Defective");
        System.out.println("Red--"+obj.getRed());
        System.out.println("Green--"+obj.getGreen());
        System.out.println("White--"+obj.getWhite());
        System.out.println("Blue--"+obj.getBlue());
    }
}