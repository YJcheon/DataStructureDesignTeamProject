import java.util.ArrayList;

// ToDo : Input Sensor Data
// ToDo : Elevator Structure design Needed
public class ElevatorNode{
	// private int curFloor;
	private ArrayList<String> sharedFloor;
	private int[] floor;
	private String idx;
	private String name;
	private int stayT;
	private int moveT;
	private int people;
	private int now;
	private int dir;
	private int user; //사용자의 인원수를 바탕으로 EV필터링
	public ElevatorNode(String idx, String name, int nop, int direction, int nowFloor, int userNum) {
		this.idx = idx;
		this.name = name;
		this.sharedFloor = new ArrayList<>();
		this.floor = new int[18];
		people = nop;
		dir = direction;
		now = nowFloor;
		moveT = 5;
		if(people == 0) {
	         stayT = 0;
	         dir = 0;
	      }
	      else if(0 < people && people <11) {
	         stayT = 15;
	      }
	      //20명일때는 안멈춘다고 StayT가 0이 아니라 멈춘다면 20이므로 stayT = 20
	      else if(10 < people && people <=20) {
	         stayT = 20;
	      }	
		
	}
	public void addNewFloor(String floor) {
		String newFloor = floor;
		if (newFloor.length() == 1) {
			newFloor = "0" + newFloor;
		}
		switch(newFloor) {
		case "B6":
			this.floor[0] = 1;
			break;
		case "B5":
			this.floor[1] = 1;
			break;
		case "B4":
			this.floor[2] = 1;
			break;
		case "B3":
			this.floor[3] = 1;
			break;
		case "B2":
			this.floor[4] = 1;
			break;
		case "B1":
			this.floor[5] = 1;
			break;
		case "01":
			this.floor[6] = 1;
			break;
		case "02":
			this.floor[7] = 1;
			break;
		case "03":
			this.floor[8] = 1;
			break;
		case "04":
			this.floor[9] = 1;
			break;
		case "05":
			this.floor[10] = 1;
			break;
		case "06":
			this.floor[11] = 1;
			break;
		case "07":
			this.floor[12] = 1;
			break;
		case "08":
			this.floor[13] = 1;
			break;
		case "09":
			this.floor[14] = 1;
			break;
		case "10":
			this.floor[15] = 1;
			break;
		case "11":
			this.floor[16] = 1;
			break;
		case "12":
			this.floor[17] = 1;
			break;
		}
		newFloor = idx + newFloor;
		sharedFloor.add(newFloor);
	}
	public ArrayList<String> getFloorIdx() {
		return sharedFloor;
	}
	
	  public int topFloor(int []floor) {
	      int top = 0;
	      for(int i=0; i<18; i++) {
	         if(floor[i] == 1)
	            top = i;
	      }
	      return top;
	   }
	   
	   public int botFloor(int []floor) {
	      int bottom = 17;
	      for(int i=17; i>-1; i--) {
	         if(floor[i] == 1)
	            bottom = i;
	      }
	      return bottom;
	   }
	   
	   public int secTopFloor(int []floor) {
	      int top = 0;
	      for(int i=0; i<topFloor(floor); i++) {
	         if(floor[i] == 1)
	            top = i;
	      }
	      return top;
	   }
	   
	   public int secBotFloor(int []floor) {
	      int bottom = 17;
	      for(int i=17; i>botFloor(floor); i--) {
	         if(floor[i] == 1)
	            bottom = i;
	      }
	      return bottom;
	   }
	   
	   //a와 b는 index
	   public int stayable(int a, int b, int []floor) {
	      int k = 0;
	      //a와b는 indexNum
	      if(a>b) {
	         int t=a;
	         a=b;
	         b=t;
	      }
	      for(int i = a; i<b+1; i++) {
	         if(floor[i] == 1)
	            k++;
	      }
	      return k;
	   }
	   public int gap(int a, int b) {
	      if(a>b)
	         return a-b;
	      else
	         return b-a;
	   }
	   public int SfToDf(int sf, int df, int []floor, int moveT, int stayT) {
	      int k;
	      k = (stayable(sf, df, floor)-1)*(stayT)+gap(sf, df)*(moveT);
	      return k;
	   }
	   
	   public int weightGiver(int sf, int df) {
	      //now : realFloor
	      //index = realFloor+6
	      if(now<0)
	         now+=6;
	      else if(now>0)
	         now+=5;
	      if(sf<0)
	         sf+=6;
	      else if(sf>0)
	         sf+=5;
	      if(df<0)
	         df+=6;
	      else if(df>0)
	         df+=5;
	      
	      int userDir;      
	      int CASE = 0;
	      int time = 0;
	      //If Full(=20) : 1, else 0
	      int Full = 0;
	      if(people == 20)
	         Full = 1;
	      if(df - sf >0)
	         userDir = 1;
	      else
	         userDir = -1;
	      if(dir == 0) {
	         time = (gap(now, sf) + gap(sf, df)) * moveT + 15;
	         return time;
	      }
	      if(user == 1 && people >10) {
	    	  return -1;
	      }
	      if(user == 2 && people > 0) {
	    	  return -1;
	      }
	      if(userDir == 1 && Full == 1) {
	         if(dir == 1 && now > sf)
	            CASE = 1;
	         else if(dir == 1 && now < sf)
	            CASE = 3;
	         else if(dir == -1 && now > sf)
	            CASE = 2;
	         else if(dir == -1 && now < sf)
	            CASE = 4;
	         else if(now == sf)
	            CASE = 5;
	         
	         //Full일때는 floor배열이 예외적으로 달라짐
	         int tf = topFloor(floor);
	         int bf = botFloor(floor);
	         int sectf = secTopFloor(floor);
	         int secbf = secBotFloor(floor);
	         for(int i=0; i<18; i++)
	            floor[i]=0;
	         floor[tf]=1;
	         floor[bf]=1;
	         floor[sectf]=1;
	         floor[secbf]=1;
	         floor[6]=1;
	         //sf가 1층인데 1층이 bottom인 경우는 예외적으로 return isn't 999
	         if(floor[sf] == 0 || (sf == 6 && sf!=tf && sf!=bf && sf!=sectf && sf!=secbf)) {
	            time = -1;
	            return time;
	         }
	         else {
	            switch(CASE) {
	            case 1:
	               time = ((stayable(now, topFloor(floor), floor)-1)*(stayT)+gap(now, topFloor(floor))*(moveT))
	               + ((stayable(botFloor(floor),topFloor(floor),floor)-1)*(stayT)+gap(botFloor(floor), topFloor(floor))*(moveT))
	               + ((stayable(botFloor(floor), sf, floor)-1)*(stayT)+gap(botFloor(floor),sf)*moveT)
	               + (SfToDf(sf, df, floor, moveT, stayT));
	               
	               break;
	            case 3:
	               time = ((stayable(now, sf, floor)-1)*(stayT)+gap(now, sf)*moveT)
	               + (SfToDf(sf, df, floor, moveT, stayT));
	               break;
	            case 2:
	               time = ((stayable(botFloor(floor), now, floor)-1)*(stayT)+gap(botFloor(floor), now)*moveT)
	               + ((stayable(botFloor(floor), sf, floor)-1)*(stayT) + gap(botFloor(floor),sf)*moveT)
	               + (SfToDf(sf, df, floor, moveT, stayT));
	               break;
	            case 4:
	               time = ((stayable(botFloor(floor), now, floor)-1)*(stayT)+gap(botFloor(floor),now)*moveT)
	               + ((stayable(botFloor(floor), sf, floor)-1)*stayT+gap(botFloor(floor),sf)*moveT)
	               + (SfToDf(sf, df, floor, moveT, stayT));
	               break;      
	            case 5:
	               time = (SfToDf(sf, df, floor, moveT, stayT));
	               break;
	            }
	            return time;
	         }
	         
	      }
	      else if(userDir == -1 && Full == 1) {
	         if(dir == 1 && now > sf)
	            CASE = 1;
	         else if(dir == 1 && now < sf)
	            CASE = 3;
	         else if(dir == -1 && now > sf)
	            CASE = 2;
	         else if(dir == -1 && now < sf)
	            CASE = 4;
	         else if(now == sf)
	            CASE = 5;
	         
	         //Full일때는 floor배열이 예외적으로 달라짐
	         int tf = topFloor(floor);
	         int bf = botFloor(floor);
	         int sectf = secTopFloor(floor);
	         int secbf = secBotFloor(floor);
	         for(int i=0; i<18; i++)
	            floor[i]=0;
	         floor[tf]=1;
	         floor[bf]=1;
	         floor[sectf]=1;
	         floor[secbf]=1;
	         floor[6]=1;
	         
	         if(floor[sf] == 0 || sf == 6) {
	            time = 999;
	            return time;
	         }
	         else {
	            switch(CASE) {
	            case 1:
	               time = ((stayable(now, topFloor(floor), floor)-1)*(stayT)+gap(now, topFloor(floor))*moveT)
	               + ((stayable(sf,topFloor(floor),floor)-1)*(stayT)+gap(sf, topFloor(floor))*moveT)
	               + (SfToDf(sf, df, floor, moveT, stayT));
	               break;
	            case 3:
	               time = ((stayable(now, topFloor(floor), floor)-1)*(stayT)+gap(now, topFloor(floor))*moveT)
	               + ((stayable(sf,topFloor(floor),floor)-1)*stayT+gap(sf,topFloor(floor))*moveT)
	               + (SfToDf(sf, df, floor, moveT, stayT));
	               break;
	            case 2:
	               time = ((stayable(sf, now, floor)-1)*(stayT)+gap(sf, now)*moveT)
	               + (SfToDf(sf, df, floor, moveT, stayT));
	               break;
	            case 4:
	               time = ((stayable(botFloor(floor), now, floor)-1)*(stayT)+gap(botFloor(floor),now)*moveT)
	               + ((stayable(botFloor(floor), topFloor(floor), floor)-1)*(stayT) + gap(botFloor(floor), topFloor(floor))*moveT)
	               + ((stayable(sf, topFloor(floor), floor)-1)*(stayT) + gap(sf, topFloor(floor))*moveT)
	               + (SfToDf(sf, df, floor, moveT, stayT));
	               break;   
	            case 5:
	               time = (SfToDf(df, sf, floor, moveT, stayT));
	               break;
	            }         
	            return time;
	         }
	      }
	      else if(userDir == 1 && Full == 0) {
	         if(dir == 1 && now > sf)
	            CASE = 1;
	         else if(dir == 1 && now < sf)
	            CASE = 3;
	         else if(dir == -1 && now > sf)
	            CASE = 2;
	         else if(dir == -1 && now < sf)
	            CASE = 4;
	         else if(now == sf)
	            CASE = 5;
	         
	         switch(CASE) {
	         case 1:
	            time = ((stayable(now, topFloor(floor), floor)-1)*(stayT)+gap(now, topFloor(floor))*(moveT))
	            + ((stayable(botFloor(floor),topFloor(floor),floor)-1)*(stayT)+gap(botFloor(floor), topFloor(floor))*(moveT))
	            + ((stayable(botFloor(floor), sf, floor)-1)*(stayT)+gap(botFloor(floor),sf)*moveT)
	            + (SfToDf(sf, df, floor, moveT, stayT));
	            break;
	         case 3:
	            time = ((stayable(now, sf, floor)-1)*(stayT)+gap(now, sf)*moveT)
	            + (SfToDf(sf, df, floor, moveT, stayT));
	            break;
	         case 2:
	            time = ((stayable(botFloor(floor), now, floor)-1)*(stayT)+gap(botFloor(floor), now)*moveT)
	            + ((stayable(botFloor(floor), sf, floor)-1)*(stayT) + gap(botFloor(floor),sf)*moveT)
	            + (SfToDf(sf, df, floor, moveT, stayT));
	            break;
	         case 4:
	            time = ((stayable(botFloor(floor), now, floor)-1)*(stayT)+gap(botFloor(floor),now)*moveT)
	            + ((stayable(botFloor(floor), sf, floor)-1)*stayT+gap(botFloor(floor),sf)*moveT)
	            + (SfToDf(sf, df, floor, moveT, stayT));
	            break;      
	         case 5:
	            time = (SfToDf(sf, df, floor, moveT, stayT));
	            break;
	         }
	         return time;
	      }
	      else if(userDir == -1 && Full == 0) {
	         if(dir == 1 && now > sf)
	            CASE = 1;
	         else if(dir == 1 && now < sf)
	            CASE = 3;
	         else if(dir == -1 && now > sf)
	            CASE = 2;
	         else if(dir == -1 && now < sf)
	            CASE = 4;
	         else if(now == sf)
	            CASE = 5;
	      
	         switch(CASE) {
	         case 1:
	            time = ((stayable(now, topFloor(floor), floor)-1)*(stayT)+gap(now, topFloor(floor))*moveT)
	            + ((stayable(sf,topFloor(floor),floor)-1)*(stayT)+gap(sf, topFloor(floor))*moveT)
	            + (SfToDf(sf, df, floor, moveT, stayT));
	            break;
	         case 3:
	            time = ((stayable(now, topFloor(floor), floor)-1)*(stayT)+gap(now, topFloor(floor))*moveT)
	            + ((stayable(sf,topFloor(floor),floor)-1)*stayT+gap(sf,topFloor(floor))*moveT)
	            + (SfToDf(sf, df, floor, moveT, stayT));
	            break;
	         case 2:
	            time = ((stayable(sf, now, floor)-1)*(stayT)+gap(sf, now)*moveT)
	            + (SfToDf(sf, df, floor, moveT, stayT));
	            break;
	         case 4:
	            time = ((stayable(botFloor(floor), now, floor)-1)*(stayT)+gap(botFloor(floor),now)*moveT)
	            + ((stayable(botFloor(floor), topFloor(floor), floor)-1)*(stayT) + gap(botFloor(floor), topFloor(floor))*moveT)
	            + ((stayable(sf, topFloor(floor), floor)-1)*(stayT) + gap(sf, topFloor(floor))*moveT)
	            + (SfToDf(sf, df, floor, moveT, stayT));
	            break;   
	         case 5:
	            time = (SfToDf(df, sf, floor, moveT, stayT));
	            break;
	         }         
	         return time;
	      }
	      return -1;
	   }

}