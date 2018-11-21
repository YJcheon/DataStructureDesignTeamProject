

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultUndirectedWeightedGraph;


// ToDo : Make All Nodes - Till 11/19
//		: Make All Edges - Till 11/26
//		: Run Shortest Path Algorithms - Till 12/03

public class JGraphT {
	private static JNode node;
	public static void main(String[] main) {
		node = new JNode();
		DefaultUndirectedWeightedGraph<String, DefaultEdge> directedGraph 
		  = new DefaultUndirectedWeightedGraph<>(DefaultEdge.class);
		//Set All nodes to Graph
		int count = 0;
		for(Iterator iter = node.getNodesKey().iterator(); iter.hasNext();) {
			String keyName = (String)iter.next();
			directedGraph.addVertex(keyName);
			count++;
		}
		System.out.println("total " + String.valueOf(count) + "node added");
		// ToDo : Set Edges in same Floor
		// ToDo : Set Edges in Elevator & stairs
	}

}
