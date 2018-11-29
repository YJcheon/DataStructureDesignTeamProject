import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// All About Nodes
// Control Flow of All nodes

public class JNode {
	private static HashMap<String, NodeData> node;
	public JNode() {
		node = new HashMap<String, NodeData>();
		createNode();
	}
	private static void createNode() {
		String dir = System.getProperty("user.dir");
		dir += "/nodeData.csv";
		BufferedReader br;
		try {
			File csvFile = new File(dir);
			String line;
			 br = new BufferedReader(new FileReader(csvFile));
			 line = br.readLine(); // Header Passing
			 while ((line = br.readLine()) != null) {
	                String[] token = line.split(",");
	                node.put(token[0], new NodeData(token[0], token[1], Integer.parseInt(token[2])));
	            }
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
	// ToDO : Search By Floor
	
	// Return Specific Node's Name
	public String getNodeName(String nodeIdx) {
		return node.get(nodeIdx).getName();
	}
	// Return Specific Node's Type
	public int getNodeType(String nodeIdx) {
		return node.get(nodeIdx).getType();
	}
	
}
