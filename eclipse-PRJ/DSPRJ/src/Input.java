import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.Calendar;
import java.util.Scanner;

public class Input {
    protected String Start; //출발지
    protected String Desti; //도착지
    protected int sFloor;
    protected int dFloor;
    protected int userNum;
    protected String busy;
    protected int []sensorDir = new int[18];
    protected int []sensorNow = new int[18];
    protected int []sensorPeople = new int[18];
    private int currentMin;
    public Input(int currentMin) {
        this.currentMin = currentMin;
        SensorReceive();
    }
    public void setStart(String msg) {
        Start = new String(msg);
        String pre2,pre3;
        pre2= Start.substring(1,2);
        pre3= Start.substring(0,2);
        if(Start.startsWith("B")) {
            int x = Integer.parseInt(pre2);
            sFloor = -x;
        }
        else {
            sFloor = Integer.parseInt(pre3);
        }
    }

    public void setDesti(String msg) {
        Desti =new String(msg);
        String pre2,pre3;
        pre2= Desti.substring(1,2);
        pre3= Desti.substring(0,2);
        if(Desti.startsWith("B")) {
            int x = Integer.parseInt(pre2);
            dFloor = -x;
        }
        else {
            dFloor = Integer.parseInt(pre3);
        }
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
        //소수 1, 다수 2
    }


    public void setBusy(String busy) {
        this.busy = busy;
        //계단 웨이트
    }

    public void SensorReceive() {
        Random rnd = new Random();
        for(int i=0;i<12;i++) {
            sensorNow[i] = rnd.nextInt(18) -6;
            while(sensorNow[i] == 0) {
                sensorNow[i] = rnd.nextInt(18) -6;
            }
        }
        for(int i=0;i<12;i++)
            sensorDir[i] = rnd.nextInt(3) - 1;

        if(currentMin >= 0 && currentMin < 10) {
            for(int i =0;i < 4;i++)
                sensorPeople[i]= 8 + rnd.nextInt(13);
            sensorPeople[4] = rnd.nextInt(21);
            for(int i =5;i<9;i++)
                sensorPeople[i]= 8 + rnd.nextInt(13);
            sensorPeople[9] = rnd.nextInt(21);
            for(int i =10;i<12;i++)
                sensorPeople[i]= 6+rnd.nextInt(15);
        }
        else if(currentMin >= 10 && currentMin < 20) {
            for(int i =0;i<12;i++)
                sensorPeople[i]= rnd.nextInt(21);
        }
        else if(currentMin >= 20 && currentMin < 30) {
            for(int i =0;i<4;i++)
                sensorPeople[i]= 8+rnd.nextInt(13);
            sensorPeople[4] = rnd.nextInt(21);
            for(int i =5;i<9;i++)
                sensorPeople[i]= 8 + rnd.nextInt(13);
            sensorPeople[9] = rnd.nextInt(21);
            for(int i =10;i<12;i++)
                sensorPeople[i]= 7+rnd.nextInt(14);
        }
        else if(currentMin >= 30 && currentMin < 40) {
            for(int i =0;i<12;i++)
                sensorPeople[i]= rnd.nextInt(21);
        }
        else if(currentMin >= 40 && currentMin < 50) {
            for(int i =0;i<4;i++)
                sensorPeople[i]= 9+rnd.nextInt(12);
            sensorPeople[4] = 7 + rnd.nextInt(14);
            for(int i =5;i<9;i++)
                sensorPeople[i]= 9+rnd.nextInt(12);
            sensorPeople[9] = rnd.nextInt(14);
            for(int i =10;i<12;i++)
                sensorPeople[i]= 8+rnd.nextInt(13);
        }
        else if(currentMin >= 50 && currentMin < 60) {
            for(int i =0;i<4;i++)
                sensorPeople[i]= 18 + rnd.nextInt(3);
            sensorPeople[4] = 8 + rnd.nextInt(13);
            for(int i =5;i<9;i++)
                sensorPeople[i]= 18 + rnd.nextInt(3);
            sensorPeople[9] = 8 + rnd.nextInt(13);
            for(int i =10;i<12;i++)
                sensorPeople[i]= 14+rnd.nextInt(7);
        }
    }
}