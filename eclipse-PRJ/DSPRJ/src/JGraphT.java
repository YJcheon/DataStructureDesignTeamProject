

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
	private static JNode node;
	private static ArrayList<DefaultWeightedEdge> edges;
	static DefaultUndirectedWeightedGraph<String, DefaultEdge> undirectedGraph;
	public static void main(String[] main) {
		node = new JNode();
		edges = new ArrayList<>();
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
		testing();
	}
	private static void testing() {
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
