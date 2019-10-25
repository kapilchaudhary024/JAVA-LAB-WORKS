package LAB07;

public class User{

    private String fName;
    private String lName;
    private int pincode;

    User(String fName,String lName,int pincode){
        this.fName=fName;
        this.lName=lName;
        this.pincode=pincode;
    }

    public String getFName(){
        return fName;
    }

    public String getLName(){
        return lName;
    }

    public int getPincode(){
        return pincode;
    }

    private String set(String larger,String smaller){
        String uId="";
        String pin=Integer.toString(pincode);
        uId=uId + larger.charAt(0) + larger.charAt(1)+smaller.charAt(smaller.length()-1)+smaller.charAt(smaller.length()-2);
        if(pin.length()<larger.length())
        {uId=uId + pin.charAt(pin.length()-1);}
        else
        {uId+= pin.charAt(larger.length()-1);}

        if(pin.length()<smaller.length())
        {uId=uId + pin.charAt(0);}
        else
        {uId+= pin.charAt(pin.length()-smaller.length());}
        return uId;
    }

    public String userId(){
        if(fName.compareTo(lName)==0){
            return set(lName,fName);
        }
        else if(fName.compareTo(lName)>0){
            return set(fName,lName);
        }
        else{
            return set(lName,fName);
        }
    }
}