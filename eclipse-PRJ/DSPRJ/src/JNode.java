import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// All About Nodes
// Control Flow of All nodes

public class JNode {
	private static HashMap<String, NodeData> node;
	private static HashMap<String, ElevatorNode> elevator;
	private static HashMap<String, ElevatorNode> stairs;
	public JNode() {
		node = new HashMap<String, NodeData>();
		elevator = new HashMap<String, ElevatorNode>();
		stairs = new HashMap<String, ElevatorNode>();
		createNode();
	}
	private static void createNode() {
		String dir = System.getProperty("user.dir") + "/src/resource";
		BufferedReader br;
		String line;
		int count = 0;
		try {
			//READ AND CREATE BASIC NODES
			String nodedir = dir + "/Data_structure_tp_nodes_sc.csv";
			br = new BufferedReader(new FileReader(new File(nodedir)));
			line = br.readLine(); // Header Passing
			while ((line = br.readLine()) != null) {
				String[] token = line.split(",");
	            node.put(token[0], new NodeData(token[0], token[1], Integer.parseInt(token[2])));
	            count++;
	        }
			br.close();
			System.out.println("BASIC : " + count);
			
			count = 0;
			//READ AND CREATE ELEVATOR NODES
			String elevdir = dir + "/Data_structure_tp_nodes_el.csv";
			br = new BufferedReader(new FileReader(new File(elevdir)));
			line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] token = line.split(",");
				ElevatorNode newElev = new ElevatorNode(token[0], token[1]);
				for ( int i = 3; i < token.length; i++) {
					String newFloor = token[i];
					if (i == 3) newFloor = newFloor.substring(1);
					if (i == token.length - 1) newFloor = newFloor.substring(0, newFloor.length() - 1);
					newElev.addNewFloor(newFloor);
				}
				ArrayList<String> nodeIdx = newElev.getFloorIdx();
				for (String newIdx : nodeIdx) {
					node.put(newIdx, new NodeData(newIdx, token[1], Integer.parseInt(token[2])));
					count++;
				}
				elevator.put(token[0], newElev);
			}
			br.close();
			System.out.println("ELEVATOR : " + count);
			
			count = 0;
			//READ AND CREATE STAIR NODES
			String stairdir = dir + "/Data_structure_tp_nodes_st.csv";
			br = new BufferedReader(new FileReader(new File(stairdir)));
			line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] token = line.split(",");
				ElevatorNode newStair = new ElevatorNode(token[0], token[1]);
				for ( int i = 3; i < token.length - 1; i++) {
					String newFloor = token[i];
					if (i == 3) newFloor = newFloor.substring(1);
					if (i == token.length - 2) newFloor = newFloor.substring(0, newFloor.length() - 1);
					newStair.addNewFloor(newFloor);
				}
				ArrayList<String> nodeIdx = newStair.getFloorIdx();
				for (String newIdx : nodeIdx) {
					node.put(newIdx, new NodeData(newIdx, token[1], Integer.parseInt(token[2])));
					count++;
				}
				stairs.put(token[0], newStair);
			}
			br.close();
			System.out.println("STAIRS : " + count);
			
			//GROUPING BASIC NODES
			String groupdir = dir + "/Data_structure_tp_Group.csv";
			br = new BufferedReader(new FileReader(new File(groupdir)));
			line = br.readLine();
			while((line = br.readLine()) != null) {
				String[] token = line.split(",");
				if (token.length == 0) continue; //Skip the empty line
				for (int i = 2; i < token.length; i++) {
					if(token[i].equals("")) break; //End when meet empty space
					String newNode = token[i];
					if(newNode.length() < 4) {
						newNode = "0" + newNode;
					}
					node.get(newNode).setGroup(token[0]);
				}
			}
			br.close();
		}	
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	// Return All Nodes Set
	public Set getNodesKey(){
		return node.keySet();
	}
	
	// ToDo : Return Elevator Nodes
	// ToDo : Return Stair Nodes
	
	// Search By Floor
	public ArrayList<String> getNodesByFloor(String floorName) {
		ArrayList<String> ret = new ArrayList<>();
		for(String nodeKey : node.keySet()) {
			NodeData tmp = node.get(nodeKey);
			if (floorName.equals(tmp.getIdx().substring(0,2))) {
				ret.add(tmp.getIdx());
			}
		}
		return ret;
	}
	
	// Return Specific Group Nodes
	public ArrayList<String> getNodesByGroup(String groupName) {
		ArrayList<String> ret = new ArrayList<>();
		for(String nodeKey : node.keySet()) {
			NodeData tmp = node.get(nodeKey);
			if (groupName.equals(tmp.getGroup())) {
				ret.add(tmp.getIdx());
			}
		}
		return ret;
	}
	
	// Return Specific Node's Name
	public String getNodeName(String nodeIdx) {
		return node.get(nodeIdx).getName();
	}
	// Return Specific Node's Type
	public int getNodeType(String nodeIdx) {
		return node.get(nodeIdx).getType();
	}
	
}
