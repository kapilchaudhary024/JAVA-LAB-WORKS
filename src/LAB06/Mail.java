package LAB06;



import java.util.Random;

public class Mail{
    private String name;
    private String company;
    private String age;
    private String password;
    private String email;
    Mail(String n,String a,String c){
        name = n;
        company = c;
        age = a;
        password=createPass();
    }

    private String createPass(){
        email=String.format("%s_%s@%s.com",name.toLowerCase(),age,company);
        Random rand = new Random();
        String s="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sp="~`!@#$%^&*(){}|[]\\:;\"'<,>.?/+";
        String pass="";
        pass = pass +s.charAt(Math.abs(rand.nextInt(50))%26);
        pass+=Math.abs(rand.nextInt(10));
        pass+=Math.abs(rand.nextInt(10));
        pass+=Math.abs(rand.nextInt(10));
        pass+=Math.abs(rand.nextInt(10));
        if(name.length()>4)
            pass+=name.substring(0,5);
        else
            pass+="00";
        pass+=sp.charAt(Math.abs(rand.nextInt())%20);
        return pass;
    }

    public String  getEmailAndPass(){
        return "email -- "+email+"\n"+"pass -- "+password;
    }
}