//X
/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultUndirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;

public class testing_sensor {
	Input input;
	private static JNode node;
	private static ArrayList<DefaultWeightedEdge> edges;
	static DefaultUndirectedWeightedGraph<String, DefaultEdge> undirectedGraph;
	
	Scanner scan = new Scanner(System.in);
	String msg = new String();
	msg = scan.nextLine();
	while(!node.isThisNodeExist(msg)) {
		System.out.println("SOURCE : ");
		msg = scan.nextLine();
	}
	input.setStart(msg);

/*	public void test() {
		

	ElevatorNode []evArr = new ElevatorNode[12];
	  evArr[0].setter("1", input.sensorPeople[0], input.sensorDir[0], input.sensorNow[0], input.userNum);
	  evArr[1].setter("2", input.sensorPeople[1], input.sensorDir[1], input.sensorNow[1], input.userNum);
	  evArr[2].setter("3", input.sensorPeople[2], input.sensorDir[2], input.sensorNow[2], input.userNum);
	  evArr[3].setter("4", input.sensorPeople[3], input.sensorDir[3], input.sensorNow[3], input.userNum);
	  evArr[4].setter("5", input.sensorPeople[4], input.sensorDir[4], input.sensorNow[4], input.userNum);
	  evArr[5].setter("6", input.sensorPeople[5], input.sensorDir[5], input.sensorNow[5], input.userNum);
	  evArr[6].setter("7", input.sensorPeople[6], input.sensorDir[6], input.sensorNow[6], input.userNum);
	  evArr[7].setter("8", input.sensorPeople[7], input.sensorDir[7], input.sensorNow[7], input.userNum);
	  evArr[8].setter("9", input.sensorPeople[8], input.sensorDir[8], input.sensorNow[8], input.userNum);
	  evArr[9].setter("10", input.sensorPeople[9], input.sensorDir[9], input.sensorNow[9], input.userNum);
	  evArr[10].setter("11", input.sensorPeople[10], input.sensorDir[10], input.sensorNow[10], input.userNum);
	  evArr[11].setter("12", input.sensorPeople[11], input.sensorDir[1], input.sensorNow[11], input.userNum);
	  ​
	  verticalSetter vSet = new verticalSetter();
	  vset.evSetter(evArr, dFloor-sFloor);
	}
	
	private static void testing() {
		//�Ʒ� �ڵ� ��ġ ��Ȯ��. ���������� ���� �� ev weight ���� �ڵ�
		//public ElevatorNode(String idx, String name, int nop, int direction, int nowFloor, int userNum)
		
		
		Scanner scan = new Scanner(System.in);
		String msg = new String();
		String source, dest;
		while(!node.isThisNodeExist(msg)) {
			System.out.println("SOURCE : ");
			msg = scan.nextLine();
		}
		source = msg;
		msg = new String();
		while(!node.isThisNodeExist(msg)) {
			System.out.println("DEST : ");
			msg = scan.nextLine();
		}
		dest = msg;
	    DijkstraShortestPath dijkstraShortestPath 
	      = new DijkstraShortestPath(undirectedGraph);
	    List<String> shortestPath = dijkstraShortestPath
	      .getPath(source, dest).getVertexList();
		for (String path: shortestPath) {
			System.out.print(path + " -> ");
		}
		System.out.print("\n");
		System.out.println("FINALLY : " + dijkstraShortestPath.getPathWeight(source, dest));
	}
}
*/