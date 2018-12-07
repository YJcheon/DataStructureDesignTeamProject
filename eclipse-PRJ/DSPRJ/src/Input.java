import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Calendar;
import java.util.Scanner;

public class Input {
	protected String Start; //출발지
	protected String Desti; //도착지
	protected int userNum;
	protected String busy;
	private int sensorDir[] = new int[12];
	private int sensorNow[] = new int[12];
	private int sensorPeople[] = new int[12];
	
	public void setStart(String Start) {
		this.Start = Start;
	}
	
	public void setDesti(String Desti) {
		this.Desti = Desti;
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
		for(int i=0;i<12;i++)
			sensorNow[i] = (int)Math.random()*12;
		for(int i=0;i<12;i++)
			sensorDir[i] = ((int)Math.random()*2)*2-1;
		
		if(Calendar.MINUTE >= 0 && Calendar.MINUTE < 10) {
			for(int i =0;i<4;i++)
				sensorPeople[i]= (int)(8+Math.random()*13);
			sensorPeople[4] = (int)Math.random()*21;
			for(int i =5;i<9;i++)
				sensorPeople[i]= (int)(8+Math.random()*13);
			sensorPeople[9] = (int)Math.random()*21;
			for(int i =10;i<12;i++)
				sensorPeople[i]= (int)(6+Math.random()*15);
	}
		else if(Calendar.MINUTE >= 10 && Calendar.MINUTE < 20) {
			for(int i =0;i<12;i++)
				sensorPeople[i]= (int)(Math.random()*21);
	}
		else if(Calendar.MINUTE >= 20 && Calendar.MINUTE < 30) {
			for(int i =0;i<4;i++)
				sensorPeople[i]= (int)(8+Math.random()*13);
			sensorPeople[4] = (int)Math.random()*21;
			for(int i =5;i<9;i++)
				sensorPeople[i]= (int)(8+Math.random()*13);
			sensorPeople[9] = (int)Math.random()*21;
			for(int i =10;i<12;i++)
				sensorPeople[i]= (int)(7+Math.random()*14);
	}
		else if(Calendar.MINUTE >= 30 && Calendar.MINUTE < 40) {
			for(int i =0;i<12;i++)
				sensorPeople[i]= (int)(Math.random()*21);
	}
		else if(Calendar.MINUTE >= 40 && Calendar.MINUTE < 50) {
			for(int i =0;i<4;i++)
				sensorPeople[i]= (int)(9+Math.random()*12);
			sensorPeople[4] = (int)(7+Math.random()*14);
			for(int i =5;i<9;i++)
				sensorPeople[i]= (int)(9+Math.random()*12);
			sensorPeople[9] = (int)(7+Math.random()*14);
			for(int i =10;i<12;i++)
				sensorPeople[i]= (int)(8+Math.random()*13);
	}
		else if(Calendar.MINUTE >= 50 && Calendar.MINUTE < 60) {
			for(int i =0;i<4;i++)
				sensorPeople[i]= (int)(18+Math.random()*3);
			sensorPeople[4] = (int)(8+Math.random()*13);
			for(int i =5;i<9;i++)
				sensorPeople[i]= (int)(18+Math.random()*3);
			sensorPeople[9] = (int)(8+Math.random()*13);
			for(int i =10;i<12;i++)
				sensorPeople[i]= (int)(14+Math.random()*7);
	}
	}
	public void main(String[] args) {
		SensorReceive();
	}  
}