package LAB03;


import java.util.Scanner;

public class Question2{
    String money;
    Question2(String money){
        this.money=money;
    }
    String calculatePrice(){
        String price="";
        for(int i=0;i<money.length() ;i++){
            if(money.charAt(i)!='.'){
                price+=money.charAt(i);
            }
            else
                price+=" Ruppes and ";
        }
        return price+" Paise";
    }
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);
        Question2 obj=new Question2(scan.nextLine());
        System.out.println(obj.calculatePrice());
        scan.close();
    }
}
