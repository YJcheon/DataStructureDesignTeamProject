package com.cau.dsprj.dsprj;

import java.util.Random;

public class Input {
    protected String Start; //출발지
    protected String Desti; //도착지
    protected int sFloor;
    protected int dFloor;
    protected int userNum;
    protected int busy;
    protected int []sensorDir = new int[18];
    protected int []sensorNow = new int[18];
    protected int []sensorPeople = new int[18];
    private int currentMin;
    public Input(int currentMin, String src, String dest, int userNum, String busy) {
        this.currentMin = currentMin;
        setStart(src);
        setDesti(dest);
        setUserNum(userNum);
        setBusy(busy);
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
        int tmp = Integer.valueOf(busy);
        switch (tmp){
            case 0:
                this.busy = 170;
                break;
                case 1:
                this.busy = 110;
                break;
            case 2:
                this.busy = 70;
                break;
            case 3:
                this.busy = 40;
            break;
        }
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
            sensorDir[i] = 2*rnd.nextInt(2) - 1;

        if(currentMin >= 0 && currentMin < 10) {
            for(int i =0;i < 4;i++)
                sensorPeople[i]= 7+userNum + rnd.nextInt(13);
            sensorPeople[4] = rnd.nextInt(21);
            for(int i =5;i<9;i++)
                sensorPeople[i]= 7+userNum + rnd.nextInt(13);
            sensorPeople[9] = rnd.nextInt(21);
            for(int i =10;i<12;i++)
                sensorPeople[i]= 7+userNum +rnd.nextInt(15);
        }
        else if(currentMin >= 10 && currentMin < 20) {
            for(int i =0;i<12;i++)
                sensorPeople[i]= userNum -1 + rnd.nextInt(21);
        }
        else if(currentMin >= 20 && currentMin < 30) {
            for(int i =0;i<4;i++)
                sensorPeople[i]= 7+userNum+rnd.nextInt(13);
            sensorPeople[4] = rnd.nextInt(21);
            for(int i =5;i<9;i++)
                sensorPeople[i]= 7+userNum + rnd.nextInt(13);
            sensorPeople[9] = rnd.nextInt(21);
            for(int i =10;i<12;i++)
                sensorPeople[i]= 6+userNum+rnd.nextInt(14);
        }
        else if(currentMin >= 30 && currentMin < 40) {
            for(int i =0;i<12;i++)
                sensorPeople[i]= userNum -1 + rnd.nextInt(21);
        }
        else if(currentMin >= 40 && currentMin < 50) {
            for(int i =0;i<4;i++)
                sensorPeople[i]= 9+userNum +rnd.nextInt(12);
            sensorPeople[4] = 7 + rnd.nextInt(14);
            for(int i =5;i<9;i++)
                sensorPeople[i]= 8+userNum +rnd.nextInt(12);
            sensorPeople[9] = rnd.nextInt(14);
            for(int i =10;i<12;i++)
                sensorPeople[i]= 7+ userNum +rnd.nextInt(13);
        }
        else if(currentMin >= 50 && currentMin < 60) {
            for(int i =0;i<4;i++)
                sensorPeople[i]= 17+ userNum + rnd.nextInt(3);
            sensorPeople[4] = 7+ userNum + rnd.nextInt(13);
            for(int i =5;i<9;i++)
                sensorPeople[i]= 17+ userNum + rnd.nextInt(3);
            sensorPeople[9] = 7+ userNum + rnd.nextInt(13);
            for(int i =10;i<12;i++)
                sensorPeople[i]= 13+ userNum+rnd.nextInt(7);
        }
    }
}
