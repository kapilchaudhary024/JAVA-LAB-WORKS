package LAB08;

public class LedStrip extends Led{

    private int noOfLed;
    private Led[] leds;
    private int red;
    private int blue;
    private int green;
    private int white;

    public void setRed(int red){this.red=red;}
    public int getRed(){return red;}

    public void setGreen(int green){this.green=green;}
    public int getGreen(){return green;}

    public void setBlue(int blue){this.blue=blue;}
    public int getBlue(){return blue;}

    public void setWhite(int white){this.white=white;}
    public int getWhite(){return white;}

    public void lenLedStrip(int noOfLed){
        this.noOfLed=noOfLed;
        leds=new Led[noOfLed];
    }

    public void setLeds(String colourName,boolean working,int i){
        leds[i]=new Led();
        leds[i].setColourName(colourName);
        leds[i].setWorking(working);
    }

    private int numberOfDefectiveLed(){
        int Red=0;
        int Blue=0;
        int Green=0;
        int White=0;
        int defective=0;
        for(int i=0;i<noOfLed;i++){
            if(!leds[i].isWorking()){
                defective++;
                if(leds[i].getColourName().compareTo("red")==0)
                    Red++;
                if(leds[i].getColourName().compareTo("green")==0)
                    Green++;
                if(leds[i].getColourName().compareTo("blue")==0)
                    Blue++;
                if(leds[i].getColourName().equals("white"))
                    White++;
            }
        }
        setBlue(Blue);
        setGreen(Green);
        setRed(Red);
        setWhite(White);
        return defective;
    }

    private boolean isStripDefective(){
        if(((int)noOfLed/2)<numberOfDefectiveLed())
            return true;
        else
            return false;
    }

    public boolean defective(){
        return isStripDefective();
    }
}