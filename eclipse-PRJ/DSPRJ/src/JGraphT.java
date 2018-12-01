

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

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
	public static void main(String[] main) {
		node = new JNode();
		edges = new ArrayList<>();
		
		DefaultUndirectedWeightedGraph<String, DefaultEdge> undirectedGraph 
		  = new DefaultUndirectedWeightedGraph<>(DefaultEdge.class);
		//Set All nodes to Graph
		int count = 0;
		for(Iterator iter = node.getNodesKey().iterator(); iter.hasNext();) {
			String keyName = (String)iter.next();
			undirectedGraph.addVertex(keyName);
			count++;
		}
		System.out.println("total " + String.valueOf(count) + "node added");
		
		
		BufferedReader br;
		String line;
		try {
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
		// ToDo : Set Edges in same Floor
		// ToDo : Set Edges in Elevator & stairs
	}
}
