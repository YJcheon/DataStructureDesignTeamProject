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
		//B6 Complete
		node.put("B601", new NodeData("B601", "�������ǽ�", 1));
		node.put("B602", new NodeData("B601", "�������ǽ�", 1));
		node.put("B603", new NodeData("B601", "�������ǽ�", 1));
		node.put("EL01", new ElevatorNode("EL01", "1ȣ��"));
		node.put("EL02", new ElevatorNode("EL02", "2ȣ��"));
		node.put("EL03", new ElevatorNode("EL03", "3ȣ��"));
		node.put("ST01", new NodeData("ST01", "1�����", 3));
		node.put("ST02", new NodeData("ST02", "2�����", 3));
		// B5
		node.put("B501", new NodeData("B501", "�������ǽ�", 1));
		node.put("B502", new NodeData("B502", "�������ǽ�", 1));
		node.put("EL01", new ElevatorNode("EL01", "1ȣ��"));
		node.put("EL02", new ElevatorNode("EL02", "2ȣ��"));
		node.put("EL03", new ElevatorNode("EL03", "3ȣ��"));
		node.put("ST01", new NodeData("ST01", "1�����", 3));
		node.put("ST02", new NodeData("ST02", "2�����", 3));
		// B4
		// B3
		node.put("B302", new NodeData("B302", "������/ȯ�����", 1));
		node.put("B303", new NodeData("B303", 1));
		node.put("B304", new NodeData("B304", "����л���������", 1));
		node.put("B305", new NodeData("B305", "�ǰ�����", 1));
		node.put("B306", new NodeData("B306", "�αǼ���", 1));
		node.put("B307", new NodeData("B307", "�⵵��", 1));
		node.put("B308", new NodeData("B308", 1));
		node.put("B309", new NodeData("B309", "APP����Ư��ȭ����", 1));
		node.put("B310", new NodeData("B310", 1));
		node.put("B311", new NodeData("B311", 1));
		node.put("B312", new NodeData("B312", 1));
		node.put("B313", new NodeData("B313", 1));
		node.put("EL01", new ElevatorNode("EL01", "1ȣ��"));
		node.put("EL02", new ElevatorNode("EL02", "2ȣ��"));
		node.put("EL03", new ElevatorNode("EL03", "3ȣ��"));
		node.put("EL04", new ElevatorNode("EL04", "4ȣ��"));
		node.put("EL05", new ElevatorNode("EL05", "5ȣ��"));
		node.put("ST01", new NodeData("ST01", "1�����", 3));
		node.put("ST02", new NodeData("ST02", "2�����", 3));
		// B2
		node.put("B201", new NodeData("B201", "�߾��췲��", 1));
		node.put("B202", new NodeData("B202", "UBS", 1));
		node.put("B203", new NodeData("B203", "������", 1));
		node.put("B204", new NodeData("B204", "�����ڷ��", 1));
		node.put("B205", new NodeData("B205", "�ߴ�Ź���", 1));
		node.put("B206", new NodeData("B206", 1));
		node.put("B207", new NodeData("B207", "���񱺿���", 1));
		node.put("B208", new NodeData("B208", "�л���Ȱ ��㼾��",1));
		node.put("B209", new NodeData("B209", 1));
		node.put("B210", new NodeData("B210", 1));
		node.put("B211", new NodeData("B211", 1));
		node.put("B212", new NodeData("B212", "3Dũ������Ƽ�귦", 1));
		node.put("B213", new NodeData("B213", 1));
		node.put("B214", new NodeData("B214", 1));
		node.put("B215", new NodeData("B215", 1));
		node.put("EL01", new ElevatorNode("EL01", "1ȣ��"));
		node.put("EL02", new ElevatorNode("EL02", "2ȣ��"));
		node.put("EL03", new ElevatorNode("EL03", "3ȣ��"));
		node.put("EL04", new ElevatorNode("EL04", "4ȣ��"));
		node.put("EL05", new ElevatorNode("EL05", "5ȣ��"));
		node.put("ST01", new NodeData("ST01", "1�����", 3));
		node.put("ST02", new NodeData("ST02", "2�����", 3));
		// B1
		node.put("B101", new NodeData("B101", 1));
		node.put("B102", new NodeData("B102", "����������", 1));
		node.put("B103", new NodeData("B103", "�ü�����ó��", 1));
		node.put("B104", new NodeData("B104", "�ü���", 1));
		node.put("B105", new NodeData("B105", 1));
		node.put("B108", new NodeData("B108", 1));
		node.put("B109", new NodeData("B109", 1));
		node.put("B110", new NodeData("B110", 1));
		node.put("B111", new NodeData("B111", 1));
		node.put("B112", new NodeData("B112", "�뵿����", 1));
		node.put("B113", new NodeData("B113", "�̷����տ�",1));
		node.put("B114", new NodeData("B114", "������Ʈ����", 1));
		node.put("B115", new NodeData("B115", "������Ʈ����", 1));
		node.put("B116", new NodeData("B116", "������Ʈ����", 1));
		node.put("B117", new NodeData("B117", "������Ʈ����", 1));
		node.put("B118", new NodeData("B118", "������Ʈ����", 1));
		node.put("B119", new NodeData("B119", "â�ǿ�����", 1));
		node.put("B120", new NodeData("B120", "â�ǿ�����", 1));
		node.put("EL01", new ElevatorNode("EL01", "1ȣ��"));
		node.put("EL02", new ElevatorNode("EL02", "2ȣ��"));
		node.put("EL03", new ElevatorNode("EL03", "3ȣ��"));
		node.put("EL04", new ElevatorNode("EL04", "4ȣ��"));
		node.put("EL05", new ElevatorNode("EL05", "5ȣ��"));
		node.put("EL06", new ElevatorNode("EL06", "6ȣ��"));
		node.put("EL07", new ElevatorNode("EL07", "7ȣ��"));
		node.put("EL08", new ElevatorNode("EL08", "8ȣ��"));
		node.put("ST01", new NodeData("ST01", "1�����", 3));
		node.put("ST02", new NodeData("ST02", "2�����", 3));
		// 1
		// 2
		// 3
		// 4
		// 5
		// 6
		// 7
		// 8
		// 9
		// 10
		// 11
		// 12
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
