import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Calendar;
import java.util.Scanner;


public class SensorReceiver {
	private int dir[] = new int[12];
	private int now[] = new int[12];
	private int people[] = new int[12];
	
	
	public void SensorReceive() {
		for(int i=0;i<12;i++) 
			now[i] = (int)Math.random()*12;
		for(int i=0;i<12;i++)
			dir[i] = ((int)Math.random()*2)*2-1;
		
		
		
		if(Calendar.MINUTE >= 0 && Calendar.MINUTE < 10) {
			for(int i =0;i<4;i++) 
				people[i]= (int)(8+Math.random()*13);
			people[4] = (int)Math.random()*21;
			for(int i =5;i<9;i++) 
				people[i]= (int)(8+Math.random()*13);
			people[9] = (int)Math.random()*21;
			for(int i =10;i<12;i++) 
				people[i]= (int)(6+Math.random()*15);
	}
		else if(Calendar.MINUTE >= 10 && Calendar.MINUTE < 20) {
			for(int i =0;i<12;i++) 
				people[i]= (int)(Math.random()*21);
	}
		else if(Calendar.MINUTE >= 20 && Calendar.MINUTE < 30) {
			for(int i =0;i<4;i++) 
				people[i]= (int)(8+Math.random()*13);
			people[4] = (int)Math.random()*21;
			for(int i =5;i<9;i++) 
				people[i]= (int)(8+Math.random()*13);
			people[9] = (int)Math.random()*21;
			for(int i =10;i<12;i++) 
				people[i]= (int)(7+Math.random()*14);
	}
		else if(Calendar.MINUTE >= 30 && Calendar.MINUTE < 40) {
			for(int i =0;i<12;i++) 
				people[i]= (int)(Math.random()*21);
	}
		else if(Calendar.MINUTE >= 40 && Calendar.MINUTE < 50) {
			for(int i =0;i<4;i++) 
				people[i]= (int)(9+Math.random()*12);
			people[4] = (int)(7+Math.random()*14);
			for(int i =5;i<9;i++) 
				people[i]= (int)(9+Math.random()*12);
			people[9] = (int)(7+Math.random()*14);
			for(int i =10;i<12;i++) 
				people[i]= (int)(8+Math.random()*13);
	}
		else if(Calendar.MINUTE >= 50 && Calendar.MINUTE < 60) {
			for(int i =0;i<4;i++) 
				people[i]= (int)(18+Math.random()*3);
			people[4] = (int)(8+Math.random()*13);
			for(int i =5;i<9;i++) 
				people[i]= (int)(18+Math.random()*3);
			people[9] = (int)(8+Math.random()*13);
			for(int i =10;i<12;i++) 
				people[i]= (int)(14+Math.random()*7);
	}
	}
	public void main(String[] args) {
		SensorReceive(); 
	}
}
