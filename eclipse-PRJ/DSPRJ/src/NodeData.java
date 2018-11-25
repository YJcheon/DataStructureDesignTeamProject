
public class NodeData {
	private String nodeIdx;
	private String nodeName;
	private int nodeType;
	//Will be Added later
	//private int nodeX;
	//private int nodeY;
	public NodeData(String idx, int type) {
		nodeIdx = new String(idx);
		nodeName = new String(idx);
		nodeType = type;
	}
	public NodeData(String idx, String name, int type) {
		nodeIdx = new String(idx);
		nodeName = new String(name);
		// 1 is room, 2 is elevator, 3 is stair
		nodeType = type;
	}
	public String getIdx() {
		return nodeIdx;
	}
	public String getName() {
		return nodeName;
	}
	public int getType() {
		return nodeType;
	}
}