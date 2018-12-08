

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultUndirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;


// ToDo : Make All Nodes - Till 11/19
//		: Make All Edges - Till 11/26
//		: Run Shortest Path Algorithms - Till 12/03

public class JGraphT {
	Input input;
	private static JNode node;
	private static ArrayList<DefaultWeightedEdge> edges;
	static DefaultUndirectedWeightedGraph<String, DefaultEdge> undirectedGraph;
	public static void main(String[] main) {
		node = new JNode();
		edges = new ArrayList<>();
		JGraphT graph = new JGraphT();
		undirectedGraph = new DefaultUndirectedWeightedGraph<>(DefaultEdge.class);
		
		//Set All nodes to Graph
		int count = 0;
		for(Iterator iter = node.getNodesKey().iterator(); iter.hasNext();) {
			String keyName = (String)iter.next();
			undirectedGraph.addVertex(keyName);
			count++;
		}
		System.out.println("total " + String.valueOf(count) + "node added");
		
		//EDGE CREATION
		BufferedReader br;
		String line;
		try {
			//READ FILE AND MAKE CONNECTION
			String edgedir = System.getProperty("user.dir") + "/src/resource/Data_structure_tp_Edge.csv";
			br = new BufferedReader(new FileReader(new File(edgedir)));
			line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] token = line.split(",");
				if (token.length == 0) continue; //Skip the empty line
				String sourceGroup = token[0];
				String destGroup = token[1];
				int thisWeight = Integer.parseInt(token[2]);
				for (String sourceIdx : node.getNodesByGroup(sourceGroup)) {
					for (String destIdx : node.getNodesByGroup(destGroup)) {
						DefaultEdge tmpEdge = undirectedGraph.addEdge(sourceIdx, destIdx);
						undirectedGraph.setEdgeWeight(tmpEdge, thisWeight);
						System.out.println("SOURCE : " + sourceIdx + "/ DEST : " + destIdx + "/ WEIGHT : " + thisWeight);
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//MAKE EDGE BETWEEN SAME ELEVATORS
		HashMap<String, ArrayList<String>> elevMap = node.getElevNodes();
		for(String elevKey: elevMap.keySet()) {
			ArrayList<String> elevList = elevMap.get(elevKey);
			for(int i = 0; i < elevList.size(); i++) {
				for (int j = i + 1; j < elevList.size(); j++) {
					DefaultEdge tmpEdge = undirectedGraph.addEdge(elevList.get(i), elevList.get(j));
					undirectedGraph.setEdgeWeight(tmpEdge, 0);
				}
			}
		}
		//MAKE EDGE BETWEEN SAME STAIRS
		HashMap<String, ArrayList<String>> stairMap = node.getStairNodes();
		for(String stairKey: stairMap.keySet()) {
			ArrayList<String> stairList = stairMap.get(stairKey);
			for(int i = 0; i < stairList.size(); i++) {
				for (int j = i + 1; j < stairList.size(); j++) {
					DefaultEdge tmpEdge = undirectedGraph.addEdge(stairList.get(i), stairList.get(j));
					undirectedGraph.setEdgeWeight(tmpEdge, 0);
				}
			}
		}
		graph.testing();
	}
	private void testing() {
		//�Ʒ� �ڵ� ��ġ ��Ȯ��. ���������� ���� �� ev weight ���� �ڵ�
		//public ElevatorNode(String idx, String name, int nop, int direction, int nowFloor, int userNum)
		
		String source,dest;
		Scanner scan = new Scanner(System.in);
		String msg = new String();
		while(!node.isThisNodeExist(msg)) {
			System.out.println("SOURCE : ");
			msg = scan.nextLine();
		}
		
		input.setStart(msg);
		msg = new String();
		while(!node.isThisNodeExist(msg)) {
			System.out.println("DEST : ");
			msg = scan.nextLine();
		}
		
		input.setDesti(msg);
		
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
		 evArr[11].setter("12", input.sensorPeople[11], input.sensorDir[11], input.sensorNow[11], input.userNum);​
		
		 verticalSetter vSet = new verticalSetter();
		 vSet.evSetter(evArr, input.dFloor-input.sFloor);
		
		dest = msg;
	    DijkstraShortestPath dijkstraShortestPath = new DijkstraShortestPath(undirectedGraph);
	    List<String> shortestPath = dijkstraShortestPath.getPath(input.Start, input.Desti).getVertexList();
		for (String path: shortestPath) {
			System.out.print(path + " -> ");
		}
		System.out.print("\n");
		System.out.println("FINALLY : " + dijkstraShortestPath.getPathWeight(input.Start,  input.Desti));
	}
}
