import java.util.ArrayList;

// ToDo : Input Sensor Data
// ToDo : Elevator Structure design Needed
public class ElevatorNode{
	// private int curFloor;
	private ArrayList<String> sharedFloor;
	private int[] floor;
	private String idx;
	private String name;
	public ElevatorNode(String idx, String name) {
		this.idx = idx;
		this.name = name;
		this.sharedFloor = new ArrayList<>();
		this.floor = new int[18];
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
	
}