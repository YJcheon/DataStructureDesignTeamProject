import java.util.ArrayList;

// ToDo : Input Sensor Data
// ToDo : Elevator Structure design Needed
public class ElevatorNode{
	// private int curFloor;
	private ArrayList<String> sharedFloor;
	private String idx;
	private String name;
	public ElevatorNode(String idx, String name) {
		this.idx = idx;
		this.name = name;
		this.sharedFloor = new ArrayList<>();
	}
	public void addNewFloor(String floor) {
		String newFloor = floor;
		if (newFloor.length() == 1) {
			newFloor = "0" + newFloor;
		}
		newFloor = idx + newFloor;
		sharedFloor.add(newFloor);
	}
	public ArrayList<String> getFloorIdx() {
		return sharedFloor;
	}
	
}