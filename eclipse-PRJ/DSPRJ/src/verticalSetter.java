import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultUndirectedWeightedGraph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class verticalSetter {
	static DefaultUndirectedWeightedGraph<String, DefaultEdge> undirectedGraph;
public void evSetter(ElevatorNode [] cal, int up_down) {
		if(up_down > 0) {	

 

			DefaultEdge evEdge010103 = undirectedGraph.addEdge("EV0101", "EV0103");

			undirectedGraph.setEdgeWeight(evEdge010103, cal[0].weightGiver(1, 3));

			DefaultEdge evEdge010105 = undirectedGraph.addEdge("EV0101", "EV0105");

			undirectedGraph.setEdgeWeight(evEdge010105, cal[0].weightGiver(1, 5));

			DefaultEdge evEdge010107 = undirectedGraph.addEdge("EV0101", "EV0107");

			undirectedGraph.setEdgeWeight(evEdge010107, cal[0].weightGiver(1, 7));

			DefaultEdge evEdge010109 = undirectedGraph.addEdge("EV0101", "EV0109");

			undirectedGraph.setEdgeWeight(evEdge010109, cal[0].weightGiver(1, 9));

			DefaultEdge evEdge010305 = undirectedGraph.addEdge("EV0103", "EV0105");

			undirectedGraph.setEdgeWeight(evEdge010305, cal[0].weightGiver(3, 5));

			DefaultEdge evEdge010307 = undirectedGraph.addEdge("EV0103", "EV0107");

			undirectedGraph.setEdgeWeight(evEdge010307, cal[0].weightGiver(3, 7));

			DefaultEdge evEdge010309 = undirectedGraph.addEdge("EV0103", "EV0109");

			undirectedGraph.setEdgeWeight(evEdge010309, cal[0].weightGiver(3, 9));

			DefaultEdge evEdge010507 = undirectedGraph.addEdge("EV0105", "EV0107");

			undirectedGraph.setEdgeWeight(evEdge010507, cal[0].weightGiver(5, 7));

			DefaultEdge evEdge010509 = undirectedGraph.addEdge("EV0105", "EV0109");

			undirectedGraph.setEdgeWeight(evEdge010509, cal[0].weightGiver(5, 9));

			DefaultEdge evEdge010709 = undirectedGraph.addEdge("EV0107", "EV0109");

			undirectedGraph.setEdgeWeight(evEdge010709, cal[0].weightGiver(7, 9));

 

			DefaultEdge evEdge020102 = undirectedGraph.addEdge("EV0201", "EV0202");

			undirectedGraph.setEdgeWeight(evEdge020102, cal[1].weightGiver(1, 2));

			DefaultEdge evEdge020104 = undirectedGraph.addEdge("EV0201", "EV0204");

			undirectedGraph.setEdgeWeight(evEdge020104, cal[1].weightGiver(1, 4));

			DefaultEdge evEdge020106 = undirectedGraph.addEdge("EV0201", "EV0206");

			undirectedGraph.setEdgeWeight(evEdge020106, cal[1].weightGiver(1, 6));

			DefaultEdge evEdge020108 = undirectedGraph.addEdge("EV0201", "EV0208");

			undirectedGraph.setEdgeWeight(evEdge020108, cal[1].weightGiver(1, 8));

			DefaultEdge evEdge020204 = undirectedGraph.addEdge("EV0202", "EV0204");

			undirectedGraph.setEdgeWeight(evEdge020204, cal[1].weightGiver(2, 4));

			DefaultEdge evEdge020206 = undirectedGraph.addEdge("EV0202", "EV0206");

			undirectedGraph.setEdgeWeight(evEdge020206, cal[1].weightGiver(2, 6));

			DefaultEdge evEdge020208 = undirectedGraph.addEdge("EV0202", "EV0208");

			undirectedGraph.setEdgeWeight(evEdge020208, cal[1].weightGiver(2, 8));

			DefaultEdge evEdge020406 = undirectedGraph.addEdge("EV0204", "EV0206");

			undirectedGraph.setEdgeWeight(evEdge020406, cal[1].weightGiver(4, 6));

			DefaultEdge evEdge020408 = undirectedGraph.addEdge("EV0204", "EV0208");

			undirectedGraph.setEdgeWeight(evEdge020408, cal[1].weightGiver(4, 8));

			DefaultEdge evEdge020608 = undirectedGraph.addEdge("EV0206", "EV0208");

			undirectedGraph.setEdgeWeight(evEdge020608, cal[1].weightGiver(6, 8));

			

 

			DefaultEdge evEdge03B6B5 = undirectedGraph.addEdge("EV03B6", "EV03B5");

			undirectedGraph.setEdgeWeight(evEdge03B6B5, cal[2].weightGiver(-6, -5));

			DefaultEdge evEdge03B6B4 = undirectedGraph.addEdge("EV03B6", "EV03B4");

			undirectedGraph.setEdgeWeight(evEdge03B6B4, cal[2].weightGiver(-6, -4));

			DefaultEdge evEdge03B6B3 = undirectedGraph.addEdge("EV03B6", "EV03B3");

			undirectedGraph.setEdgeWeight(evEdge03B6B3, cal[2].weightGiver(-6, -3));

			DefaultEdge evEdge03B601 = undirectedGraph.addEdge("EV03B6", "EV0301");

			undirectedGraph.setEdgeWeight(evEdge03B601, cal[2].weightGiver(-6, 1));

			DefaultEdge evEdge03B603 = undirectedGraph.addEdge("EV03B6", "EV0303");

			undirectedGraph.setEdgeWeight(evEdge03B603, cal[2].weightGiver(-6, 3));

			DefaultEdge evEdge03B605 = undirectedGraph.addEdge("EV03B6", "EV0305");

			undirectedGraph.setEdgeWeight(evEdge03B605, cal[2].weightGiver(-6, 5));

			DefaultEdge evEdge03B607 = undirectedGraph.addEdge("EV03B6", "EV0307");

			undirectedGraph.setEdgeWeight(evEdge03B607, cal[2].weightGiver(-6, 7));

			DefaultEdge evEdge03B609 = undirectedGraph.addEdge("EV03B6", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge03B609, cal[2].weightGiver(-6, 9));

			DefaultEdge evEdge03B5B4 = undirectedGraph.addEdge("EV03B5", "EV03B4");

			undirectedGraph.setEdgeWeight(evEdge03B5B4, cal[2].weightGiver(-5, -4));

			DefaultEdge evEdge03B5B3 = undirectedGraph.addEdge("EV03B5", "EV03B3");

			undirectedGraph.setEdgeWeight(evEdge03B5B3, cal[2].weightGiver(-5, -3));

			DefaultEdge evEdge03B501 = undirectedGraph.addEdge("EV03B5", "EV0301");

			undirectedGraph.setEdgeWeight(evEdge03B501, cal[2].weightGiver(-5, 1));

			DefaultEdge evEdge03B503 = undirectedGraph.addEdge("EV03B5", "EV0303");

			undirectedGraph.setEdgeWeight(evEdge03B503, cal[2].weightGiver(-5, 3));

			DefaultEdge evEdge03B505 = undirectedGraph.addEdge("EV03B5", "EV0305");

			undirectedGraph.setEdgeWeight(evEdge03B505, cal[2].weightGiver(-5, 5));

			DefaultEdge evEdge03B507 = undirectedGraph.addEdge("EV03B5", "EV0307");

			undirectedGraph.setEdgeWeight(evEdge03B507, cal[2].weightGiver(-5, 7));

			DefaultEdge evEdge03B509 = undirectedGraph.addEdge("EV03B5", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge03B509, cal[2].weightGiver(-5, 9));

			DefaultEdge evEdge03B4B3 = undirectedGraph.addEdge("EV03B4", "EV03B3");

			undirectedGraph.setEdgeWeight(evEdge03B4B3, cal[2].weightGiver(-4, -3));

			DefaultEdge evEdge03B401 = undirectedGraph.addEdge("EV03B4", "EV0301");

			undirectedGraph.setEdgeWeight(evEdge03B401, cal[2].weightGiver(-4, 1));

			DefaultEdge evEdge03B403 = undirectedGraph.addEdge("EV03B4", "EV0303");

			undirectedGraph.setEdgeWeight(evEdge03B403, cal[2].weightGiver(-4, 3));

			DefaultEdge evEdge03B405 = undirectedGraph.addEdge("EV03B4", "EV0305");

			undirectedGraph.setEdgeWeight(evEdge03B405, cal[2].weightGiver(-4, 5));

			DefaultEdge evEdge03B407 = undirectedGraph.addEdge("EV03B4", "EV0307");

			undirectedGraph.setEdgeWeight(evEdge03B407, cal[2].weightGiver(-4, 7));

			DefaultEdge evEdge03B409 = undirectedGraph.addEdge("EV03B4", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge03B409, cal[2].weightGiver(-4, 9));

			DefaultEdge evEdge03B301 = undirectedGraph.addEdge("EV03B3", "EV0301");

			undirectedGraph.setEdgeWeight(evEdge03B301, cal[2].weightGiver(-3, 1));

			DefaultEdge evEdge03B303 = undirectedGraph.addEdge("EV03B3", "EV0303");

			undirectedGraph.setEdgeWeight(evEdge03B303, cal[2].weightGiver(-3, 3));

			DefaultEdge evEdge03B305 = undirectedGraph.addEdge("EV03B3", "EV0305");

			undirectedGraph.setEdgeWeight(evEdge03B305, cal[2].weightGiver(-3, 5));

			DefaultEdge evEdge03B307 = undirectedGraph.addEdge("EV03B3", "EV0307");

			undirectedGraph.setEdgeWeight(evEdge03B307, cal[2].weightGiver(-3, 7));

			DefaultEdge evEdge03B309 = undirectedGraph.addEdge("EV03B3", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge03B309, cal[2].weightGiver(-3, 9));

			DefaultEdge evEdge030103 = undirectedGraph.addEdge("EV0301", "EV0303");

			undirectedGraph.setEdgeWeight(evEdge030103, cal[2].weightGiver(1, 3));

			DefaultEdge evEdge030105 = undirectedGraph.addEdge("EV0301", "EV0305");

			undirectedGraph.setEdgeWeight(evEdge030105, cal[2].weightGiver(1, 5));

			DefaultEdge evEdge030107 = undirectedGraph.addEdge("EV0301", "EV0307");

			undirectedGraph.setEdgeWeight(evEdge030107, cal[2].weightGiver(1, 7));

			DefaultEdge evEdge030109 = undirectedGraph.addEdge("EV0301", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge030109, cal[2].weightGiver(1, 9));

			DefaultEdge evEdge030305 = undirectedGraph.addEdge("EV0303", "EV0305");

			undirectedGraph.setEdgeWeight(evEdge030305, cal[2].weightGiver(3, 5));

			DefaultEdge evEdge030307 = undirectedGraph.addEdge("EV0303", "EV0307");

			undirectedGraph.setEdgeWeight(evEdge030307, cal[2].weightGiver(3, 7));

			DefaultEdge evEdge030309 = undirectedGraph.addEdge("EV0303", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge030309, cal[2].weightGiver(3, 9));

			DefaultEdge evEdge030507 = undirectedGraph.addEdge("EV0305", "EV0307");

			undirectedGraph.setEdgeWeight(evEdge030507, cal[2].weightGiver(5, 7));

			DefaultEdge evEdge030509 = undirectedGraph.addEdge("EV0305", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge030509, cal[2].weightGiver(5, 9));

			DefaultEdge evEdge030709 = undirectedGraph.addEdge("EV0307", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge030709, cal[2].weightGiver(7, 9));

	

			DefaultEdge evEdge04B6B5 = undirectedGraph.addEdge("EV04B6", "EV04B5");

			undirectedGraph.setEdgeWeight(evEdge04B6B5, cal[3].weightGiver(-6, -5));

			DefaultEdge evEdge04B6B4 = undirectedGraph.addEdge("EV04B6", "EV04B4");

			undirectedGraph.setEdgeWeight(evEdge04B6B4, cal[3].weightGiver(-6, -4));

			DefaultEdge evEdge04B6B3 = undirectedGraph.addEdge("EV04B6", "EV04B3");

			undirectedGraph.setEdgeWeight(evEdge04B6B3, cal[3].weightGiver(-6, -3));

			DefaultEdge evEdge04B601 = undirectedGraph.addEdge("EV04B6", "EV0401");

			undirectedGraph.setEdgeWeight(evEdge04B601, cal[3].weightGiver(-6, 1));

			DefaultEdge evEdge04B604 = undirectedGraph.addEdge("EV04B6", "EV0404");

			undirectedGraph.setEdgeWeight(evEdge04B604, cal[3].weightGiver(-6, 4));

			DefaultEdge evEdge04B606 = undirectedGraph.addEdge("EV04B6", "EV0406");

			undirectedGraph.setEdgeWeight(evEdge04B606, cal[3].weightGiver(-6, 6));

			DefaultEdge evEdge04B608 = undirectedGraph.addEdge("EV04B6", "EV0408");

			undirectedGraph.setEdgeWeight(evEdge04B608, cal[3].weightGiver(-6, 8));

			DefaultEdge evEdge04B5B4 = undirectedGraph.addEdge("EV04B5", "EV04B4");

			undirectedGraph.setEdgeWeight(evEdge04B5B4, cal[3].weightGiver(-5, -4));

			DefaultEdge evEdge04B5B3 = undirectedGraph.addEdge("EV04B5", "EV04B3");

			undirectedGraph.setEdgeWeight(evEdge04B5B3, cal[3].weightGiver(-5, -3));

			DefaultEdge evEdge04B501 = undirectedGraph.addEdge("EV04B5", "EV0401");

			undirectedGraph.setEdgeWeight(evEdge04B501, cal[3].weightGiver(-5, 1));

			DefaultEdge evEdge04B504 = undirectedGraph.addEdge("EV04B5", "EV0404");

			undirectedGraph.setEdgeWeight(evEdge04B504, cal[3].weightGiver(-5, 4));

			DefaultEdge evEdge04B506 = undirectedGraph.addEdge("EV04B5", "EV0406");

			undirectedGraph.setEdgeWeight(evEdge04B506, cal[3].weightGiver(-5, 6));

			DefaultEdge evEdge04B508 = undirectedGraph.addEdge("EV04B5", "EV0408");

			undirectedGraph.setEdgeWeight(evEdge04B508, cal[3].weightGiver(-5, 8));

			DefaultEdge evEdge04B4B3 = undirectedGraph.addEdge("EV04B4", "EV04B3");

			undirectedGraph.setEdgeWeight(evEdge04B4B3, cal[3].weightGiver(-4, -3));

			DefaultEdge evEdge04B401 = undirectedGraph.addEdge("EV04B4", "EV0401");

			undirectedGraph.setEdgeWeight(evEdge04B401, cal[3].weightGiver(-4, 1));

			DefaultEdge evEdge04B404 = undirectedGraph.addEdge("EV04B4", "EV0404");

			undirectedGraph.setEdgeWeight(evEdge04B404, cal[3].weightGiver(-4, 4));

			DefaultEdge evEdge04B406 = undirectedGraph.addEdge("EV04B4", "EV0406");

			undirectedGraph.setEdgeWeight(evEdge04B406, cal[3].weightGiver(-4, 6));

			DefaultEdge evEdge04B408 = undirectedGraph.addEdge("EV04B4", "EV0408");

			undirectedGraph.setEdgeWeight(evEdge04B408, cal[3].weightGiver(-4, 8));

			DefaultEdge evEdge04B301 = undirectedGraph.addEdge("EV04B3", "EV0401");

			undirectedGraph.setEdgeWeight(evEdge04B301, cal[3].weightGiver(-3, 1));

			DefaultEdge evEdge04B304 = undirectedGraph.addEdge("EV04B3", "EV0404");

			undirectedGraph.setEdgeWeight(evEdge04B304, cal[3].weightGiver(-3, 4));

			DefaultEdge evEdge04B306 = undirectedGraph.addEdge("EV04B3", "EV0406");

			undirectedGraph.setEdgeWeight(evEdge04B306, cal[3].weightGiver(-3, 6));

			DefaultEdge evEdge04B308 = undirectedGraph.addEdge("EV04B3", "EV0408");

			undirectedGraph.setEdgeWeight(evEdge04B308, cal[3].weightGiver(-3, 8));

			DefaultEdge evEdge040104 = undirectedGraph.addEdge("EV0401", "EV0404");

			undirectedGraph.setEdgeWeight(evEdge040104, cal[3].weightGiver(1, 4));

			DefaultEdge evEdge040106 = undirectedGraph.addEdge("EV0401", "EV0406");

			undirectedGraph.setEdgeWeight(evEdge040106, cal[3].weightGiver(1, 6));

			DefaultEdge evEdge040108 = undirectedGraph.addEdge("EV0401", "EV0408");

			undirectedGraph.setEdgeWeight(evEdge040108, cal[3].weightGiver(1, 8));

			DefaultEdge evEdge040406 = undirectedGraph.addEdge("EV0404", "EV0406");

			undirectedGraph.setEdgeWeight(evEdge040406, cal[3].weightGiver(4, 6));

			DefaultEdge evEdge040408 = undirectedGraph.addEdge("EV0404", "EV0408");

			undirectedGraph.setEdgeWeight(evEdge040408, cal[3].weightGiver(4, 8));

			DefaultEdge evEdge040608 = undirectedGraph.addEdge("EV0406", "EV0408");

			undirectedGraph.setEdgeWeight(evEdge040608, cal[3].weightGiver(6, 8));

			

 

			DefaultEdge evEdge05B6B5 = undirectedGraph.addEdge("EV05B6", "EV05B5");

			undirectedGraph.setEdgeWeight(evEdge05B6B5, cal[4].weightGiver(-6, -5));

			DefaultEdge evEdge05B6B4 = undirectedGraph.addEdge("EV05B6", "EV05B4");

			undirectedGraph.setEdgeWeight(evEdge05B6B4, cal[4].weightGiver(-6, -4));

			DefaultEdge evEdge05B6B3 = undirectedGraph.addEdge("EV05B6", "EV05B3");

			undirectedGraph.setEdgeWeight(evEdge05B6B3, cal[4].weightGiver(-6, -3));

			DefaultEdge evEdge05B6B2 = undirectedGraph.addEdge("EV05B6", "EV05B2");

			undirectedGraph.setEdgeWeight(evEdge05B6B2, cal[4].weightGiver(-6, -2));

			DefaultEdge evEdge05B6B1 = undirectedGraph.addEdge("EV05B6", "EV05B1");

			undirectedGraph.setEdgeWeight(evEdge05B6B1, cal[4].weightGiver(-6, -1));

			DefaultEdge evEdge05B601 = undirectedGraph.addEdge("EV05B6", "EV0501");

			undirectedGraph.setEdgeWeight(evEdge05B601, cal[4].weightGiver(-6, 1));

			DefaultEdge evEdge05B602 = undirectedGraph.addEdge("EV05B6", "EV0502");

			undirectedGraph.setEdgeWeight(evEdge05B602, cal[4].weightGiver(-6, 2));

			DefaultEdge evEdge05B603 = undirectedGraph.addEdge("EV05B6", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge05B603, cal[4].weightGiver(-6, 3));

			DefaultEdge evEdge05B604 = undirectedGraph.addEdge("EV05B6", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge05B604, cal[4].weightGiver(-6, 4));

			DefaultEdge evEdge05B605 = undirectedGraph.addEdge("EV05B6", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge05B605, cal[4].weightGiver(-6, 5));

			DefaultEdge evEdge05B606 = undirectedGraph.addEdge("EV05B6", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge05B606, cal[4].weightGiver(-6, 6));

			DefaultEdge evEdge05B607 = undirectedGraph.addEdge("EV05B6", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge05B607, cal[4].weightGiver(-6, 7));

			DefaultEdge evEdge05B608 = undirectedGraph.addEdge("EV05B6", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge05B608, cal[4].weightGiver(-6, 8));

			DefaultEdge evEdge05B609 = undirectedGraph.addEdge("EV05B6", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge05B609, cal[4].weightGiver(-6, 9));

			DefaultEdge evEdge05B5B4 = undirectedGraph.addEdge("EV05B5", "EV05B4");

			undirectedGraph.setEdgeWeight(evEdge05B5B4, cal[4].weightGiver(-5, -4));

			DefaultEdge evEdge05B5B3 = undirectedGraph.addEdge("EV05B5", "EV05B3");

			undirectedGraph.setEdgeWeight(evEdge05B5B3, cal[4].weightGiver(-5, -3));

			DefaultEdge evEdge05B5B2 = undirectedGraph.addEdge("EV05B5", "EV05B2");

			undirectedGraph.setEdgeWeight(evEdge05B5B2, cal[4].weightGiver(-5, -2));

			DefaultEdge evEdge05B5B1 = undirectedGraph.addEdge("EV05B5", "EV05B1");

			undirectedGraph.setEdgeWeight(evEdge05B5B1, cal[4].weightGiver(-5, -1));

			DefaultEdge evEdge05B501 = undirectedGraph.addEdge("EV05B5", "EV0501");

			undirectedGraph.setEdgeWeight(evEdge05B501, cal[4].weightGiver(-5, 1));

			DefaultEdge evEdge05B502 = undirectedGraph.addEdge("EV05B5", "EV0502");

			undirectedGraph.setEdgeWeight(evEdge05B502, cal[4].weightGiver(-5, 2));

			DefaultEdge evEdge05B503 = undirectedGraph.addEdge("EV05B5", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge05B503, cal[4].weightGiver(-5, 3));

			DefaultEdge evEdge05B504 = undirectedGraph.addEdge("EV05B5", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge05B504, cal[4].weightGiver(-5, 4));

			DefaultEdge evEdge05B505 = undirectedGraph.addEdge("EV05B5", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge05B505, cal[4].weightGiver(-5, 5));

			DefaultEdge evEdge05B506 = undirectedGraph.addEdge("EV05B5", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge05B506, cal[4].weightGiver(-5, 6));

			DefaultEdge evEdge05B507 = undirectedGraph.addEdge("EV05B5", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge05B507, cal[4].weightGiver(-5, 7));

			DefaultEdge evEdge05B508 = undirectedGraph.addEdge("EV05B5", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge05B508, cal[4].weightGiver(-5, 8));

			DefaultEdge evEdge05B509 = undirectedGraph.addEdge("EV05B5", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge05B509, cal[4].weightGiver(-5, 9));

			DefaultEdge evEdge05B4B3 = undirectedGraph.addEdge("EV05B4", "EV05B3");

			undirectedGraph.setEdgeWeight(evEdge05B4B3, cal[4].weightGiver(-4, -3));

			DefaultEdge evEdge05B4B2 = undirectedGraph.addEdge("EV05B4", "EV05B2");

			undirectedGraph.setEdgeWeight(evEdge05B4B2, cal[4].weightGiver(-4, -2));

			DefaultEdge evEdge05B4B1 = undirectedGraph.addEdge("EV05B4", "EV05B1");

			undirectedGraph.setEdgeWeight(evEdge05B4B1, cal[4].weightGiver(-4, -1));

			DefaultEdge evEdge05B401 = undirectedGraph.addEdge("EV05B4", "EV0501");

			undirectedGraph.setEdgeWeight(evEdge05B401, cal[4].weightGiver(-4, 1));

			DefaultEdge evEdge05B402 = undirectedGraph.addEdge("EV05B4", "EV0502");

			undirectedGraph.setEdgeWeight(evEdge05B402, cal[4].weightGiver(-4, 2));

			DefaultEdge evEdge05B403 = undirectedGraph.addEdge("EV05B4", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge05B403, cal[4].weightGiver(-4, 3));

			DefaultEdge evEdge05B404 = undirectedGraph.addEdge("EV05B4", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge05B404, cal[4].weightGiver(-4, 4));

			DefaultEdge evEdge05B405 = undirectedGraph.addEdge("EV05B4", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge05B405, cal[4].weightGiver(-4, 5));

			DefaultEdge evEdge05B406 = undirectedGraph.addEdge("EV05B4", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge05B406, cal[4].weightGiver(-4, 6));

			DefaultEdge evEdge05B407 = undirectedGraph.addEdge("EV05B4", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge05B407, cal[4].weightGiver(-4, 7));

			DefaultEdge evEdge05B408 = undirectedGraph.addEdge("EV05B4", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge05B408, cal[4].weightGiver(-4, 8));

			DefaultEdge evEdge05B409 = undirectedGraph.addEdge("EV05B4", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge05B409, cal[4].weightGiver(-4, 9));

			DefaultEdge evEdge05B3B2 = undirectedGraph.addEdge("EV05B3", "EV05B2");

			undirectedGraph.setEdgeWeight(evEdge05B3B2, cal[4].weightGiver(-3, -2));

			DefaultEdge evEdge05B3B1 = undirectedGraph.addEdge("EV05B3", "EV05B1");

			undirectedGraph.setEdgeWeight(evEdge05B3B1, cal[4].weightGiver(-3, -1));

			DefaultEdge evEdge05B301 = undirectedGraph.addEdge("EV05B3", "EV0501");

			undirectedGraph.setEdgeWeight(evEdge05B301, cal[4].weightGiver(-3, 1));

			DefaultEdge evEdge05B302 = undirectedGraph.addEdge("EV05B3", "EV0502");

			undirectedGraph.setEdgeWeight(evEdge05B302, cal[4].weightGiver(-3, 2));

			DefaultEdge evEdge05B303 = undirectedGraph.addEdge("EV05B3", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge05B303, cal[4].weightGiver(-3, 3));

			DefaultEdge evEdge05B304 = undirectedGraph.addEdge("EV05B3", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge05B304, cal[4].weightGiver(-3, 4));

			DefaultEdge evEdge05B305 = undirectedGraph.addEdge("EV05B3", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge05B305, cal[4].weightGiver(-3, 5));

			DefaultEdge evEdge05B306 = undirectedGraph.addEdge("EV05B3", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge05B306, cal[4].weightGiver(-3, 6));

			DefaultEdge evEdge05B307 = undirectedGraph.addEdge("EV05B3", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge05B307, cal[4].weightGiver(-3, 7));

			DefaultEdge evEdge05B308 = undirectedGraph.addEdge("EV05B3", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge05B308, cal[4].weightGiver(-3, 8));

			DefaultEdge evEdge05B309 = undirectedGraph.addEdge("EV05B3", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge05B309, cal[4].weightGiver(-3, 9));

			DefaultEdge evEdge05B2B1 = undirectedGraph.addEdge("EV05B2", "EV05B1");

			undirectedGraph.setEdgeWeight(evEdge05B2B1, cal[4].weightGiver(-2, -1));

			DefaultEdge evEdge05B201 = undirectedGraph.addEdge("EV05B2", "EV0501");

			undirectedGraph.setEdgeWeight(evEdge05B201, cal[4].weightGiver(-2, 1));

			DefaultEdge evEdge05B202 = undirectedGraph.addEdge("EV05B2", "EV0502");

			undirectedGraph.setEdgeWeight(evEdge05B202, cal[4].weightGiver(-2, 2));

			DefaultEdge evEdge05B203 = undirectedGraph.addEdge("EV05B2", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge05B203, cal[4].weightGiver(-2, 3));

			DefaultEdge evEdge05B204 = undirectedGraph.addEdge("EV05B2", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge05B204, cal[4].weightGiver(-2, 4));

			DefaultEdge evEdge05B205 = undirectedGraph.addEdge("EV05B2", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge05B205, cal[4].weightGiver(-2, 5));

			DefaultEdge evEdge05B206 = undirectedGraph.addEdge("EV05B2", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge05B206, cal[4].weightGiver(-2, 6));

			DefaultEdge evEdge05B207 = undirectedGraph.addEdge("EV05B2", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge05B207, cal[4].weightGiver(-2, 7));

			DefaultEdge evEdge05B208 = undirectedGraph.addEdge("EV05B2", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge05B208, cal[4].weightGiver(-2, 8));

			DefaultEdge evEdge05B209 = undirectedGraph.addEdge("EV05B2", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge05B209, cal[4].weightGiver(-2, 9));

			DefaultEdge evEdge05B101 = undirectedGraph.addEdge("EV05B1", "EV0501");

			undirectedGraph.setEdgeWeight(evEdge05B101, cal[4].weightGiver(-1, 1));

			DefaultEdge evEdge05B102 = undirectedGraph.addEdge("EV05B1", "EV0502");

			undirectedGraph.setEdgeWeight(evEdge05B102, cal[4].weightGiver(-1, 2));

			DefaultEdge evEdge05B103 = undirectedGraph.addEdge("EV05B1", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge05B103, cal[4].weightGiver(-1, 3));

			DefaultEdge evEdge05B104 = undirectedGraph.addEdge("EV05B1", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge05B104, cal[4].weightGiver(-1, 4));

			DefaultEdge evEdge05B105 = undirectedGraph.addEdge("EV05B1", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge05B105, cal[4].weightGiver(-1, 5));

			DefaultEdge evEdge05B106 = undirectedGraph.addEdge("EV05B1", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge05B106, cal[4].weightGiver(-1, 6));

			DefaultEdge evEdge05B107 = undirectedGraph.addEdge("EV05B1", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge05B107, cal[4].weightGiver(-1, 7));

			DefaultEdge evEdge05B108 = undirectedGraph.addEdge("EV05B1", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge05B108, cal[4].weightGiver(-1, 8));

			DefaultEdge evEdge05B109 = undirectedGraph.addEdge("EV05B1", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge05B109, cal[4].weightGiver(-1, 9));

			DefaultEdge evEdge050102 = undirectedGraph.addEdge("EV0501", "EV0502");

			undirectedGraph.setEdgeWeight(evEdge050102, cal[4].weightGiver(1, 2));

			DefaultEdge evEdge050103 = undirectedGraph.addEdge("EV0501", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge050103, cal[4].weightGiver(1, 3));

			DefaultEdge evEdge050104 = undirectedGraph.addEdge("EV0501", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge050104, cal[4].weightGiver(1, 4));

			DefaultEdge evEdge050105 = undirectedGraph.addEdge("EV0501", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge050105, cal[4].weightGiver(1, 5));

			DefaultEdge evEdge050106 = undirectedGraph.addEdge("EV0501", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge050106, cal[4].weightGiver(1, 6));

			DefaultEdge evEdge050107 = undirectedGraph.addEdge("EV0501", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge050107, cal[4].weightGiver(1, 7));

			DefaultEdge evEdge050108 = undirectedGraph.addEdge("EV0501", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge050108, cal[4].weightGiver(1, 8));

			DefaultEdge evEdge050109 = undirectedGraph.addEdge("EV0501", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050109, cal[4].weightGiver(1, 9));

			DefaultEdge evEdge050203 = undirectedGraph.addEdge("EV0502", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge050203, cal[4].weightGiver(2, 3));

			DefaultEdge evEdge050204 = undirectedGraph.addEdge("EV0502", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge050204, cal[4].weightGiver(2, 4));

			DefaultEdge evEdge050205 = undirectedGraph.addEdge("EV0502", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge050205, cal[4].weightGiver(2, 5));

			DefaultEdge evEdge050206 = undirectedGraph.addEdge("EV0502", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge050206, cal[4].weightGiver(2, 6));

			DefaultEdge evEdge050207 = undirectedGraph.addEdge("EV0502", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge050207, cal[4].weightGiver(2, 7));

			DefaultEdge evEdge050208 = undirectedGraph.addEdge("EV0502", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge050208, cal[4].weightGiver(2, 8));

			DefaultEdge evEdge050209 = undirectedGraph.addEdge("EV0502", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050209, cal[4].weightGiver(2, 9));

			DefaultEdge evEdge050304 = undirectedGraph.addEdge("EV0503", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge050304, cal[4].weightGiver(3, 4));

			DefaultEdge evEdge050305 = undirectedGraph.addEdge("EV0503", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge050305, cal[4].weightGiver(3, 5));

			DefaultEdge evEdge050306 = undirectedGraph.addEdge("EV0503", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge050306, cal[4].weightGiver(3, 6));

			DefaultEdge evEdge050307 = undirectedGraph.addEdge("EV0503", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge050307, cal[4].weightGiver(3, 7));

			DefaultEdge evEdge050308 = undirectedGraph.addEdge("EV0503", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge050308, cal[4].weightGiver(3, 8));

			DefaultEdge evEdge050309 = undirectedGraph.addEdge("EV0503", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050309, cal[4].weightGiver(3, 9));

			DefaultEdge evEdge050405 = undirectedGraph.addEdge("EV0504", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge050405, cal[4].weightGiver(4, 5));

			DefaultEdge evEdge050406 = undirectedGraph.addEdge("EV0504", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge050406, cal[4].weightGiver(4, 6));

			DefaultEdge evEdge050407 = undirectedGraph.addEdge("EV0504", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge050407, cal[4].weightGiver(4, 7));

			DefaultEdge evEdge050408 = undirectedGraph.addEdge("EV0504", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge050408, cal[4].weightGiver(4, 8));

			DefaultEdge evEdge050409 = undirectedGraph.addEdge("EV0504", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050409, cal[4].weightGiver(4, 9));

			DefaultEdge evEdge050506 = undirectedGraph.addEdge("EV0505", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge050506, cal[4].weightGiver(5, 6));

			DefaultEdge evEdge050507 = undirectedGraph.addEdge("EV0505", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge050507, cal[4].weightGiver(5, 7));

			DefaultEdge evEdge050508 = undirectedGraph.addEdge("EV0505", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge050508, cal[4].weightGiver(5, 8));

			DefaultEdge evEdge050509 = undirectedGraph.addEdge("EV0505", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050509, cal[4].weightGiver(5, 9));

			DefaultEdge evEdge050607 = undirectedGraph.addEdge("EV0506", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge050607, cal[4].weightGiver(6, 7));

			DefaultEdge evEdge050608 = undirectedGraph.addEdge("EV0506", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge050608, cal[4].weightGiver(6, 8));

			DefaultEdge evEdge050609 = undirectedGraph.addEdge("EV0506", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050609, cal[4].weightGiver(6, 9));

			DefaultEdge evEdge050708 = undirectedGraph.addEdge("EV0507", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge050708, cal[4].weightGiver(7, 8));

			DefaultEdge evEdge050709 = undirectedGraph.addEdge("EV0507", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050709, cal[4].weightGiver(7, 9));

			DefaultEdge evEdge050809 = undirectedGraph.addEdge("EV0508", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050809, cal[4].weightGiver(8, 9));

 

			DefaultEdge evEdge06B3B2 = undirectedGraph.addEdge("EV06B3", "EV06B2");

			undirectedGraph.setEdgeWeight(evEdge06B3B2, cal[5].weightGiver(-3, -2));

			DefaultEdge evEdge06B3B1 = undirectedGraph.addEdge("EV06B3", "EV06B1");

			undirectedGraph.setEdgeWeight(evEdge06B3B1, cal[5].weightGiver(-3, -1));

			DefaultEdge evEdge06B301 = undirectedGraph.addEdge("EV06B3", "EV0601");

			undirectedGraph.setEdgeWeight(evEdge06B301, cal[5].weightGiver(-3, 1));

			DefaultEdge evEdge06B302 = undirectedGraph.addEdge("EV06B3", "EV0602");

			undirectedGraph.setEdgeWeight(evEdge06B302, cal[5].weightGiver(-3, 2));

			DefaultEdge evEdge06B303 = undirectedGraph.addEdge("EV06B3", "EV0603");

			undirectedGraph.setEdgeWeight(evEdge06B303, cal[5].weightGiver(-3, 3));

			DefaultEdge evEdge06B304 = undirectedGraph.addEdge("EV06B3", "EV0604");

			undirectedGraph.setEdgeWeight(evEdge06B304, cal[5].weightGiver(-3, 4));

			DefaultEdge evEdge06B305 = undirectedGraph.addEdge("EV06B3", "EV0605");

			undirectedGraph.setEdgeWeight(evEdge06B305, cal[5].weightGiver(-3, 5));

			DefaultEdge evEdge06B306 = undirectedGraph.addEdge("EV06B3", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge06B306, cal[5].weightGiver(-3, 6));

			DefaultEdge evEdge06B307 = undirectedGraph.addEdge("EV06B3", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge06B307, cal[5].weightGiver(-3, 7));

			DefaultEdge evEdge06B308 = undirectedGraph.addEdge("EV06B3", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge06B308, cal[5].weightGiver(-3, 8));

			DefaultEdge evEdge06B309 = undirectedGraph.addEdge("EV06B3", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge06B309, cal[5].weightGiver(-3, 9));

			DefaultEdge evEdge06B310 = undirectedGraph.addEdge("EV06B3", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge06B310, cal[5].weightGiver(-3, 10));

			DefaultEdge evEdge06B311 = undirectedGraph.addEdge("EV06B3", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge06B311, cal[5].weightGiver(-3, 11));

			DefaultEdge evEdge06B312 = undirectedGraph.addEdge("EV06B3", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge06B312, cal[5].weightGiver(-3, 12));

			

			DefaultEdge evEdge06B2B1 = undirectedGraph.addEdge("EV06B2", "EV06B1");

			undirectedGraph.setEdgeWeight(evEdge06B2B1, cal[5].weightGiver(-2, -1));

			DefaultEdge evEdge06B201 = undirectedGraph.addEdge("EV06B2", "EV0601");

			undirectedGraph.setEdgeWeight(evEdge06B201, cal[5].weightGiver(-2, 1));

			DefaultEdge evEdge06B202 = undirectedGraph.addEdge("EV06B2", "EV0602");

			undirectedGraph.setEdgeWeight(evEdge06B202, cal[5].weightGiver(-2, 2));

			DefaultEdge evEdge06B203 = undirectedGraph.addEdge("EV06B2", "EV0603");

			undirectedGraph.setEdgeWeight(evEdge06B203, cal[5].weightGiver(-2, 3));

			DefaultEdge evEdge06B204 = undirectedGraph.addEdge("EV06B2", "EV0604");

			undirectedGraph.setEdgeWeight(evEdge06B204, cal[5].weightGiver(-2, 4));

			DefaultEdge evEdge06B205 = undirectedGraph.addEdge("EV06B2", "EV0605");

			undirectedGraph.setEdgeWeight(evEdge06B205, cal[5].weightGiver(-2, 5));

			DefaultEdge evEdge06B206 = undirectedGraph.addEdge("EV06B2", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge06B206, cal[5].weightGiver(-2, 6));

			DefaultEdge evEdge06B207 = undirectedGraph.addEdge("EV06B2", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge06B207, cal[5].weightGiver(-2, 7));

			DefaultEdge evEdge06B208 = undirectedGraph.addEdge("EV06B2", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge06B208, cal[5].weightGiver(-2, 8));

			DefaultEdge evEdge06B209 = undirectedGraph.addEdge("EV06B2", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge06B209, cal[5].weightGiver(-2, 9));

			DefaultEdge evEdge06B210 = undirectedGraph.addEdge("EV06B2", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge06B210, cal[5].weightGiver(-2, 10));

			DefaultEdge evEdge06B211 = undirectedGraph.addEdge("EV06B2", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge06B211, cal[5].weightGiver(-2, 11));

			DefaultEdge evEdge06B212 = undirectedGraph.addEdge("EV06B2", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge06B212, cal[5].weightGiver(-2, 12));

 

			DefaultEdge evEdge06B101 = undirectedGraph.addEdge("EV06B1", "EV0601");

			undirectedGraph.setEdgeWeight(evEdge06B101, cal[5].weightGiver(-1, 1));

			DefaultEdge evEdge06B102 = undirectedGraph.addEdge("EV06B1", "EV0602");

			undirectedGraph.setEdgeWeight(evEdge06B102, cal[5].weightGiver(-1, 2));

			DefaultEdge evEdge06B103 = undirectedGraph.addEdge("EV06B1", "EV0603");

			undirectedGraph.setEdgeWeight(evEdge06B103, cal[5].weightGiver(-1, 3));

			DefaultEdge evEdge06B104 = undirectedGraph.addEdge("EV06B1", "EV0604");

			undirectedGraph.setEdgeWeight(evEdge06B104, cal[5].weightGiver(-1, 4));

			DefaultEdge evEdge06B105 = undirectedGraph.addEdge("EV06B1", "EV0605");

			undirectedGraph.setEdgeWeight(evEdge06B105, cal[5].weightGiver(-1, 5));

			DefaultEdge evEdge06B106 = undirectedGraph.addEdge("EV06B1", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge06B106, cal[5].weightGiver(-1, 6));

			DefaultEdge evEdge06B107 = undirectedGraph.addEdge("EV06B1", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge06B107, cal[5].weightGiver(-1, 7));

			DefaultEdge evEdge06B108 = undirectedGraph.addEdge("EV06B1", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge06B108, cal[5].weightGiver(-1, 8));

			DefaultEdge evEdge06B109 = undirectedGraph.addEdge("EV06B1", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge06B109, cal[5].weightGiver(-1, 9));

			DefaultEdge evEdge06B110 = undirectedGraph.addEdge("EV06B1", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge06B110, cal[5].weightGiver(-1, 10));

			DefaultEdge evEdge06B111 = undirectedGraph.addEdge("EV06B1", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge06B111, cal[5].weightGiver(-1, 11));

			DefaultEdge evEdge06B112 = undirectedGraph.addEdge("EV06B1", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge06B112, cal[5].weightGiver(-1, 12));

			

			DefaultEdge evEdge060102 = undirectedGraph.addEdge("EV0601", "EV0602");

			undirectedGraph.setEdgeWeight(evEdge060102, cal[5].weightGiver(1, 2));

			DefaultEdge evEdge060103 = undirectedGraph.addEdge("EV0601", "EV0603");

			undirectedGraph.setEdgeWeight(evEdge060103, cal[5].weightGiver(1, 3));

			DefaultEdge evEdge060104 = undirectedGraph.addEdge("EV0601", "EV0604");

			undirectedGraph.setEdgeWeight(evEdge060104, cal[5].weightGiver(1, 4));

			DefaultEdge evEdge060105 = undirectedGraph.addEdge("EV0601", "EV0605");

			undirectedGraph.setEdgeWeight(evEdge060105, cal[5].weightGiver(1, 5));

			DefaultEdge evEdge060106 = undirectedGraph.addEdge("EV0601", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge060106, cal[5].weightGiver(1, 6));

			DefaultEdge evEdge060107 = undirectedGraph.addEdge("EV0601", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge060107, cal[5].weightGiver(1, 7));

			DefaultEdge evEdge060108 = undirectedGraph.addEdge("EV0601", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge060108, cal[5].weightGiver(1, 8));

			DefaultEdge evEdge060109 = undirectedGraph.addEdge("EV0601", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060109, cal[5].weightGiver(1, 9));

			DefaultEdge evEdge060110 = undirectedGraph.addEdge("EV0601", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060110, cal[5].weightGiver(1, 10));

			DefaultEdge evEdge060111 = undirectedGraph.addEdge("EV0601", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060111, cal[5].weightGiver(1, 11));

			DefaultEdge evEdge060112 = undirectedGraph.addEdge("EV0601", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060112, cal[5].weightGiver(1, 12));

 

			DefaultEdge evEdge060203 = undirectedGraph.addEdge("EV0602", "EV0603");

			undirectedGraph.setEdgeWeight(evEdge060203, cal[5].weightGiver(2, 3));

			DefaultEdge evEdge060204 = undirectedGraph.addEdge("EV0602", "EV0604");

			undirectedGraph.setEdgeWeight(evEdge060204, cal[5].weightGiver(2, 4));

			DefaultEdge evEdge060205 = undirectedGraph.addEdge("EV0602", "EV0605");

			undirectedGraph.setEdgeWeight(evEdge060205, cal[5].weightGiver(2, 5));

			DefaultEdge evEdge060206 = undirectedGraph.addEdge("EV0602", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge060206, cal[5].weightGiver(2, 6));

			DefaultEdge evEdge060207 = undirectedGraph.addEdge("EV0602", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge060207, cal[5].weightGiver(2, 7));

			DefaultEdge evEdge060208 = undirectedGraph.addEdge("EV0602", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge060208, cal[5].weightGiver(2, 8));

			DefaultEdge evEdge060209 = undirectedGraph.addEdge("EV0602", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060209, cal[5].weightGiver(2, 9));

			DefaultEdge evEdge060210 = undirectedGraph.addEdge("EV0602", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060210, cal[5].weightGiver(2, 10));

			DefaultEdge evEdge060211 = undirectedGraph.addEdge("EV0602", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060211, cal[5].weightGiver(2, 11));

			DefaultEdge evEdge060212 = undirectedGraph.addEdge("EV0602", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060212, cal[5].weightGiver(2, 12));

 

			DefaultEdge evEdge060304 = undirectedGraph.addEdge("EV0603", "EV0604");

			undirectedGraph.setEdgeWeight(evEdge060304, cal[5].weightGiver(3, 4));

			DefaultEdge evEdge060305 = undirectedGraph.addEdge("EV0603", "EV0605");

			undirectedGraph.setEdgeWeight(evEdge060305, cal[5].weightGiver(3, 5));

			DefaultEdge evEdge060306 = undirectedGraph.addEdge("EV0603", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge060306, cal[5].weightGiver(3, 6));

			DefaultEdge evEdge060307 = undirectedGraph.addEdge("EV0603", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge060307, cal[5].weightGiver(3, 7));

			DefaultEdge evEdge060308 = undirectedGraph.addEdge("EV0603", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge060308, cal[5].weightGiver(3, 8));

			DefaultEdge evEdge060309 = undirectedGraph.addEdge("EV0603", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060309, cal[5].weightGiver(3, 9));

			DefaultEdge evEdge060310 = undirectedGraph.addEdge("EV0603", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060310, cal[5].weightGiver(3, 10));

			DefaultEdge evEdge060311 = undirectedGraph.addEdge("EV0603", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060311, cal[5].weightGiver(3, 11));

			DefaultEdge evEdge060312 = undirectedGraph.addEdge("EV0603", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060312, cal[5].weightGiver(3, 12));

 

			DefaultEdge evEdge060405 = undirectedGraph.addEdge("EV0604", "EV0605");

			undirectedGraph.setEdgeWeight(evEdge060405, cal[5].weightGiver(4, 5));

			DefaultEdge evEdge060406 = undirectedGraph.addEdge("EV0604", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge060406, cal[5].weightGiver(4, 6));

			DefaultEdge evEdge060407 = undirectedGraph.addEdge("EV0604", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge060407, cal[5].weightGiver(4, 7));

			DefaultEdge evEdge060408 = undirectedGraph.addEdge("EV0604", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge060408, cal[5].weightGiver(4, 8));

			DefaultEdge evEdge060409 = undirectedGraph.addEdge("EV0604", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060409, cal[5].weightGiver(4, 9));

			DefaultEdge evEdge060410 = undirectedGraph.addEdge("EV0604", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060410, cal[5].weightGiver(4, 10));

			DefaultEdge evEdge060411 = undirectedGraph.addEdge("EV0604", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060411, cal[5].weightGiver(4, 11));

			DefaultEdge evEdge060412 = undirectedGraph.addEdge("EV0604", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060412, cal[5].weightGiver(4, 12));

 

			DefaultEdge evEdge060506 = undirectedGraph.addEdge("EV0605", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge060506, cal[5].weightGiver(5, 6));

			DefaultEdge evEdge060507 = undirectedGraph.addEdge("EV0605", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge060507, cal[5].weightGiver(5, 7));

			DefaultEdge evEdge060508 = undirectedGraph.addEdge("EV0605", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge060508, cal[5].weightGiver(5, 8));

			DefaultEdge evEdge060509 = undirectedGraph.addEdge("EV0605", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060509, cal[5].weightGiver(5, 9));

			DefaultEdge evEdge060510 = undirectedGraph.addEdge("EV0605", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060510, cal[5].weightGiver(5, 10));

			DefaultEdge evEdge060511 = undirectedGraph.addEdge("EV0605", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060511, cal[5].weightGiver(5, 11));

			DefaultEdge evEdge060512 = undirectedGraph.addEdge("EV0605", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060512, cal[5].weightGiver(5, 12));

			

			DefaultEdge evEdge060607 = undirectedGraph.addEdge("EV0606", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge060607, cal[5].weightGiver(6, 7));

			DefaultEdge evEdge060608 = undirectedGraph.addEdge("EV0606", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge060608, cal[5].weightGiver(6, 8));

			DefaultEdge evEdge060609 = undirectedGraph.addEdge("EV0606", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060609, cal[5].weightGiver(6, 9));

			DefaultEdge evEdge060610 = undirectedGraph.addEdge("EV0606", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060610, cal[5].weightGiver(6, 10));

			DefaultEdge evEdge060611 = undirectedGraph.addEdge("EV0606", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060611, cal[5].weightGiver(6, 11));

			DefaultEdge evEdge060612 = undirectedGraph.addEdge("EV0606", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060612, cal[5].weightGiver(6, 12));

 

			DefaultEdge evEdge060708 = undirectedGraph.addEdge("EV0607", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge060708, cal[5].weightGiver(7, 8));

			DefaultEdge evEdge060709 = undirectedGraph.addEdge("EV0607", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060709, cal[5].weightGiver(7, 9));

			DefaultEdge evEdge060710 = undirectedGraph.addEdge("EV0607", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060710, cal[5].weightGiver(7, 10));

			DefaultEdge evEdge060711 = undirectedGraph.addEdge("EV0607", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060711, cal[5].weightGiver(7, 11));

			DefaultEdge evEdge060712 = undirectedGraph.addEdge("EV0607", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060712, cal[5].weightGiver(7, 12));

 

			DefaultEdge evEdge060809 = undirectedGraph.addEdge("EV0608", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060809, cal[5].weightGiver(8, 9));

			DefaultEdge evEdge060810 = undirectedGraph.addEdge("EV0608", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060810, cal[5].weightGiver(8, 10));

			DefaultEdge evEdge060811 = undirectedGraph.addEdge("EV0608", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060811, cal[5].weightGiver(8, 11));

			DefaultEdge evEdge060812 = undirectedGraph.addEdge("EV0608", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060812, cal[5].weightGiver(8, 12));

			

			DefaultEdge evEdge060910 = undirectedGraph.addEdge("EV0609", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060910, cal[5].weightGiver(9, 10));

			DefaultEdge evEdge060911 = undirectedGraph.addEdge("EV0609", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060911, cal[5].weightGiver(9, 11));

			DefaultEdge evEdge060912 = undirectedGraph.addEdge("EV0609", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060912, cal[5].weightGiver(9, 12));

 

			DefaultEdge evEdge061011 = undirectedGraph.addEdge("EV0610", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge061011, cal[5].weightGiver(10, 11));

			DefaultEdge evEdge061012 = undirectedGraph.addEdge("EV0610", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge061012, cal[5].weightGiver(10, 12));

 

			DefaultEdge evEdge061112 = undirectedGraph.addEdge("EV0611", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge061112, cal[5].weightGiver(11, 12));

 

			

			//7호기

			DefaultEdge evEdge07B3B2 = undirectedGraph.addEdge("EV07B3", "EV07B2");

			undirectedGraph.setEdgeWeight(evEdge07B3B2, cal[6].weightGiver(-3, -2));

			DefaultEdge evEdge07B3B1 = undirectedGraph.addEdge("EV07B3", "EV07B1");

			undirectedGraph.setEdgeWeight(evEdge07B3B1, cal[6].weightGiver(-3, -1));

			DefaultEdge evEdge07B301 = undirectedGraph.addEdge("EV07B3", "EV0701");

			undirectedGraph.setEdgeWeight(evEdge07B301, cal[6].weightGiver(-3, 1));

			DefaultEdge evEdge07B303 = undirectedGraph.addEdge("EV07B3", "EV0703");

			undirectedGraph.setEdgeWeight(evEdge07B303, cal[6].weightGiver(-3, 3));

			DefaultEdge evEdge07B306 = undirectedGraph.addEdge("EV07B3", "EV0706");

			undirectedGraph.setEdgeWeight(evEdge07B306, cal[6].weightGiver(-3, 6));

			DefaultEdge evEdge07B309 = undirectedGraph.addEdge("EV07B3", "EV0709");

			undirectedGraph.setEdgeWeight(evEdge07B309, cal[6].weightGiver(-3, 9));

			DefaultEdge evEdge07B312 = undirectedGraph.addEdge("EV07B3", "EV0712");

			undirectedGraph.setEdgeWeight(evEdge07B312, cal[6].weightGiver(-3, 12));

			

			DefaultEdge evEdge07B2B1 = undirectedGraph.addEdge("EV07B2", "EV07B1");

			undirectedGraph.setEdgeWeight(evEdge07B2B1, cal[6].weightGiver(-2, -1));

			DefaultEdge evEdge07B201 = undirectedGraph.addEdge("EV07B2", "EV0701");

			undirectedGraph.setEdgeWeight(evEdge07B201, cal[6].weightGiver(-2, 1));

			DefaultEdge evEdge07B203 = undirectedGraph.addEdge("EV07B2", "EV0703");

			undirectedGraph.setEdgeWeight(evEdge07B203, cal[6].weightGiver(-2, 3));

			DefaultEdge evEdge07B206 = undirectedGraph.addEdge("EV07B2", "EV0706");

			undirectedGraph.setEdgeWeight(evEdge07B206, cal[6].weightGiver(-2, 6));

			DefaultEdge evEdge07B209 = undirectedGraph.addEdge("EV07B2", "EV0709");

			undirectedGraph.setEdgeWeight(evEdge07B209, cal[6].weightGiver(-2, 9));

			DefaultEdge evEdge07B212 = undirectedGraph.addEdge("EV07B2", "EV0712");

			undirectedGraph.setEdgeWeight(evEdge07B212, cal[6].weightGiver(-2, 12));

			

			DefaultEdge evEdge07B101 = undirectedGraph.addEdge("EV07B1", "EV0701");

			undirectedGraph.setEdgeWeight(evEdge07B101, cal[6].weightGiver(-1, 1));

			DefaultEdge evEdge07B103 = undirectedGraph.addEdge("EV07B1", "EV0703");

			undirectedGraph.setEdgeWeight(evEdge07B103, cal[6].weightGiver(-1, 3));

			DefaultEdge evEdge07B106 = undirectedGraph.addEdge("EV07B1", "EV0706");

			undirectedGraph.setEdgeWeight(evEdge07B106, cal[6].weightGiver(-1, 6));

			DefaultEdge evEdge07B109 = undirectedGraph.addEdge("EV07B1", "EV0709");

			undirectedGraph.setEdgeWeight(evEdge07B109, cal[6].weightGiver(-1, 9));

			DefaultEdge evEdge07B112 = undirectedGraph.addEdge("EV07B1", "EV0712");

			undirectedGraph.setEdgeWeight(evEdge07B112, cal[6].weightGiver(-1, 12));

			

			DefaultEdge evEdge070103 = undirectedGraph.addEdge("EV0701", "EV0703");

			undirectedGraph.setEdgeWeight(evEdge070103, cal[6].weightGiver(1, 3));

			DefaultEdge evEdge070106 = undirectedGraph.addEdge("EV0701", "EV0706");

			undirectedGraph.setEdgeWeight(evEdge070106, cal[6].weightGiver(1, 6));

			DefaultEdge evEdge070109 = undirectedGraph.addEdge("EV0701", "EV0709");

			undirectedGraph.setEdgeWeight(evEdge070109, cal[6].weightGiver(1, 9));

			DefaultEdge evEdge070112 = undirectedGraph.addEdge("EV0701", "EV0712");

			undirectedGraph.setEdgeWeight(evEdge070112, cal[6].weightGiver(1, 12));

			

			DefaultEdge evEdge070306 = undirectedGraph.addEdge("EV0703", "EV0706");

			undirectedGraph.setEdgeWeight(evEdge070306, cal[6].weightGiver(3, 6));

			DefaultEdge evEdge070309 = undirectedGraph.addEdge("EV0703", "EV0709");

			undirectedGraph.setEdgeWeight(evEdge070309, cal[6].weightGiver(3, 9));

			DefaultEdge evEdge070312 = undirectedGraph.addEdge("EV0703", "EV0712");

			undirectedGraph.setEdgeWeight(evEdge070312, cal[6].weightGiver(3, 12));

		

			DefaultEdge evEdge070609 = undirectedGraph.addEdge("EV0706", "EV0709");

			undirectedGraph.setEdgeWeight(evEdge070609, cal[6].weightGiver(6, 9));

			DefaultEdge evEdge070612 = undirectedGraph.addEdge("EV0706", "EV0712");

			undirectedGraph.setEdgeWeight(evEdge070612, cal[6].weightGiver(6, 12));

			

			DefaultEdge evEdge070912 = undirectedGraph.addEdge("EV0709", "EV0712");

			undirectedGraph.setEdgeWeight(evEdge070912, cal[6].weightGiver(9, 12));

			

			//8호기

			DefaultEdge evEdge080105 = undirectedGraph.addEdge("EV0801", "EV0805");

			undirectedGraph.setEdgeWeight(evEdge080105, cal[7].weightGiver(1, 5));

			DefaultEdge evEdge080108 = undirectedGraph.addEdge("EV0801", "EV0808");

			undirectedGraph.setEdgeWeight(evEdge080108, cal[7].weightGiver(1, 8));

			DefaultEdge evEdge080111 = undirectedGraph.addEdge("EV0801", "EV0811");

			undirectedGraph.setEdgeWeight(evEdge080111, cal[7].weightGiver(1, 11));

			

			DefaultEdge evEdge080508 = undirectedGraph.addEdge("EV0805", "EV0808");

			undirectedGraph.setEdgeWeight(evEdge080508, cal[7].weightGiver(5, 8));

			DefaultEdge evEdge080511 = undirectedGraph.addEdge("EV0805", "EV0811");

			undirectedGraph.setEdgeWeight(evEdge080511, cal[7].weightGiver(5, 11));

			

			DefaultEdge evEdge080811 = undirectedGraph.addEdge("EV0808", "EV0811");

			undirectedGraph.setEdgeWeight(evEdge080811, cal[7].weightGiver(8, 11));

			

			//9호기

			DefaultEdge evEdge090104 = undirectedGraph.addEdge("EV0901", "EV0904");

			undirectedGraph.setEdgeWeight(evEdge090104, cal[8].weightGiver(1, 4));

			DefaultEdge evEdge090107 = undirectedGraph.addEdge("EV0901", "EV0907");

			undirectedGraph.setEdgeWeight(evEdge090107, cal[8].weightGiver(1, 7));

			DefaultEdge evEdge090110 = undirectedGraph.addEdge("EV0901", "EV0910");

			undirectedGraph.setEdgeWeight(evEdge090110, cal[8].weightGiver(1, 10));

			

			DefaultEdge evEdge090407 = undirectedGraph.addEdge("EV0904", "EV0907");

			undirectedGraph.setEdgeWeight(evEdge090407, cal[8].weightGiver(4, 7));

			DefaultEdge evEdge090410 = undirectedGraph.addEdge("EV0904", "EV0910");

			undirectedGraph.setEdgeWeight(evEdge090410, cal[8].weightGiver(4, 10));

			

			DefaultEdge evEdge090710 = undirectedGraph.addEdge("EV0907", "EV0910");

			undirectedGraph.setEdgeWeight(evEdge090710, cal[8].weightGiver(7, 10));

			

			

			//10호기

			DefaultEdge evEdge10B3B2 = undirectedGraph.addEdge("EV10B3", "EV10B2");

			undirectedGraph.setEdgeWeight(evEdge10B3B2, cal[9].weightGiver(-3, -2));

			DefaultEdge evEdge10B3B1 = undirectedGraph.addEdge("EV10B3", "EV10B1");

			undirectedGraph.setEdgeWeight(evEdge10B3B1, cal[9].weightGiver(-3, -1));

			DefaultEdge evEdge10B301 = undirectedGraph.addEdge("EV10B3", "EV1001");

			undirectedGraph.setEdgeWeight(evEdge10B301, cal[9].weightGiver(-3, 1));

			DefaultEdge evEdge10B302 = undirectedGraph.addEdge("EV10B3", "EV1002");

			undirectedGraph.setEdgeWeight(evEdge10B302, cal[9].weightGiver(-3, 2));

			DefaultEdge evEdge10B303 = undirectedGraph.addEdge("EV10B3", "EV1003");

			undirectedGraph.setEdgeWeight(evEdge10B303, cal[9].weightGiver(-3, 3));

			DefaultEdge evEdge10B304 = undirectedGraph.addEdge("EV10B3", "EV1004");

			undirectedGraph.setEdgeWeight(evEdge10B304, cal[9].weightGiver(-3, 4));

			DefaultEdge evEdge10B305 = undirectedGraph.addEdge("EV10B3", "EV1005");

			undirectedGraph.setEdgeWeight(evEdge10B305, cal[9].weightGiver(-3, 5));

			DefaultEdge evEdge10B306 = undirectedGraph.addEdge("EV10B3", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge10B306, cal[9].weightGiver(-3, 6));

			DefaultEdge evEdge10B307 = undirectedGraph.addEdge("EV10B3", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge10B307, cal[9].weightGiver(-3, 7));

			DefaultEdge evEdge10B308 = undirectedGraph.addEdge("EV10B3", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge10B308, cal[9].weightGiver(-3, 8));

			DefaultEdge evEdge10B309 = undirectedGraph.addEdge("EV10B3", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge10B309, cal[9].weightGiver(-3, 9));

			DefaultEdge evEdge10B310 = undirectedGraph.addEdge("EV10B3", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge10B310, cal[9].weightGiver(-3, 10));

			DefaultEdge evEdge10B311 = undirectedGraph.addEdge("EV10B3", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge10B311, cal[9].weightGiver(-3, 11));

			DefaultEdge evEdge10B312 = undirectedGraph.addEdge("EV10B3", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge10B312, cal[9].weightGiver(-3, 12));

			

			DefaultEdge evEdge10B2B1 = undirectedGraph.addEdge("EV10B2", "EV10B1");

			undirectedGraph.setEdgeWeight(evEdge10B2B1, cal[9].weightGiver(-2, -1));

			DefaultEdge evEdge10B201 = undirectedGraph.addEdge("EV10B2", "EV1001");

			undirectedGraph.setEdgeWeight(evEdge10B201, cal[9].weightGiver(-2, 1));

			DefaultEdge evEdge10B202 = undirectedGraph.addEdge("EV10B2", "EV1002");

			undirectedGraph.setEdgeWeight(evEdge10B202, cal[9].weightGiver(-2, 2));

			DefaultEdge evEdge10B203 = undirectedGraph.addEdge("EV10B2", "EV1003");

			undirectedGraph.setEdgeWeight(evEdge10B203, cal[9].weightGiver(-2, 3));

			DefaultEdge evEdge10B204 = undirectedGraph.addEdge("EV10B2", "EV1004");

			undirectedGraph.setEdgeWeight(evEdge10B204, cal[9].weightGiver(-2, 4));

			DefaultEdge evEdge10B205 = undirectedGraph.addEdge("EV10B2", "EV1005");

			undirectedGraph.setEdgeWeight(evEdge10B205, cal[9].weightGiver(-2, 5));

			DefaultEdge evEdge10B206 = undirectedGraph.addEdge("EV10B2", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge10B206, cal[9].weightGiver(-2, 6));

			DefaultEdge evEdge10B207 = undirectedGraph.addEdge("EV10B2", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge10B207, cal[9].weightGiver(-2, 7));

			DefaultEdge evEdge10B208 = undirectedGraph.addEdge("EV10B2", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge10B208, cal[9].weightGiver(-2, 8));

			DefaultEdge evEdge10B209 = undirectedGraph.addEdge("EV10B2", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge10B209, cal[9].weightGiver(-2, 9));

			DefaultEdge evEdge10B210 = undirectedGraph.addEdge("EV10B2", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge10B210, cal[9].weightGiver(-2, 10));

			DefaultEdge evEdge10B211 = undirectedGraph.addEdge("EV10B2", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge10B211, cal[9].weightGiver(-2, 11));

			DefaultEdge evEdge10B212 = undirectedGraph.addEdge("EV10B2", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge10B212, cal[9].weightGiver(-2, 12));

			

			DefaultEdge evEdge10B101 = undirectedGraph.addEdge("EV10B1", "EV1001");

			undirectedGraph.setEdgeWeight(evEdge10B101, cal[9].weightGiver(-1, 1));

			DefaultEdge evEdge10B102 = undirectedGraph.addEdge("EV10B1", "EV1002");

			undirectedGraph.setEdgeWeight(evEdge10B102, cal[9].weightGiver(-1, 2));

			DefaultEdge evEdge10B103 = undirectedGraph.addEdge("EV10B1", "EV1003");

			undirectedGraph.setEdgeWeight(evEdge10B103, cal[9].weightGiver(-1, 3));

			DefaultEdge evEdge10B104 = undirectedGraph.addEdge("EV10B1", "EV1004");

			undirectedGraph.setEdgeWeight(evEdge10B104, cal[9].weightGiver(-1, 4));

			DefaultEdge evEdge10B105 = undirectedGraph.addEdge("EV10B1", "EV1005");

			undirectedGraph.setEdgeWeight(evEdge10B105, cal[9].weightGiver(-1, 5));

			DefaultEdge evEdge10B106 = undirectedGraph.addEdge("EV10B1", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge10B106, cal[9].weightGiver(-1, 6));

			DefaultEdge evEdge10B107 = undirectedGraph.addEdge("EV10B1", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge10B107, cal[9].weightGiver(-1, 7));

			DefaultEdge evEdge10B108 = undirectedGraph.addEdge("EV10B1", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge10B108, cal[9].weightGiver(-1, 8));

			DefaultEdge evEdge10B109 = undirectedGraph.addEdge("EV10B1", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge10B109, cal[9].weightGiver(-1, 9));

			DefaultEdge evEdge10B110 = undirectedGraph.addEdge("EV10B1", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge10B110, cal[9].weightGiver(-1, 10));

			DefaultEdge evEdge10B111 = undirectedGraph.addEdge("EV10B1", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge10B111, cal[9].weightGiver(-1, 11));

			DefaultEdge evEdge10B112 = undirectedGraph.addEdge("EV10B1", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge10B112, cal[9].weightGiver(-1, 12));

			

			DefaultEdge evEdge100102 = undirectedGraph.addEdge("EV1001", "EV1002");

			undirectedGraph.setEdgeWeight(evEdge100102, cal[9].weightGiver(1, 2));

			DefaultEdge evEdge100103 = undirectedGraph.addEdge("EV1001", "EV1003");

			undirectedGraph.setEdgeWeight(evEdge100103, cal[9].weightGiver(1, 3));

			DefaultEdge evEdge100104 = undirectedGraph.addEdge("EV1001", "EV1004");

			undirectedGraph.setEdgeWeight(evEdge100104, cal[9].weightGiver(1, 4));

			DefaultEdge evEdge100105 = undirectedGraph.addEdge("EV1001", "EV1005");

			undirectedGraph.setEdgeWeight(evEdge100105, cal[9].weightGiver(1, 5));

			DefaultEdge evEdge100106 = undirectedGraph.addEdge("EV1001", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge100106, cal[9].weightGiver(1, 6));

			DefaultEdge evEdge100107 = undirectedGraph.addEdge("EV1001", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge100107, cal[9].weightGiver(1, 7));

			DefaultEdge evEdge100108 = undirectedGraph.addEdge("EV1001", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge100108, cal[9].weightGiver(1, 8));

			DefaultEdge evEdge100109 = undirectedGraph.addEdge("EV1001", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100109, cal[9].weightGiver(1, 9));

			DefaultEdge evEdge100110 = undirectedGraph.addEdge("EV1001", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100110, cal[9].weightGiver(1, 10));

			DefaultEdge evEdge100111 = undirectedGraph.addEdge("EV1001", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100111, cal[9].weightGiver(1, 11));

			DefaultEdge evEdge100112 = undirectedGraph.addEdge("EV1001", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100112, cal[9].weightGiver(1, 12));

			

			DefaultEdge evEdge100203 = undirectedGraph.addEdge("EV1002", "EV1003");

			undirectedGraph.setEdgeWeight(evEdge100203, cal[9].weightGiver(2, 3));

			DefaultEdge evEdge100204 = undirectedGraph.addEdge("EV1002", "EV1004");

			undirectedGraph.setEdgeWeight(evEdge100204, cal[9].weightGiver(2, 4));

			DefaultEdge evEdge100205 = undirectedGraph.addEdge("EV1002", "EV1005");

			undirectedGraph.setEdgeWeight(evEdge100205, cal[9].weightGiver(2, 5));

			DefaultEdge evEdge100206 = undirectedGraph.addEdge("EV1002", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge100206, cal[9].weightGiver(2, 6));

			DefaultEdge evEdge100207 = undirectedGraph.addEdge("EV1002", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge100207, cal[9].weightGiver(2, 7));

			DefaultEdge evEdge100208 = undirectedGraph.addEdge("EV1002", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge100208, cal[9].weightGiver(2, 8));

			DefaultEdge evEdge100209 = undirectedGraph.addEdge("EV1002", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100209, cal[9].weightGiver(2, 9));

			DefaultEdge evEdge100210 = undirectedGraph.addEdge("EV1002", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100210, cal[9].weightGiver(2, 10));

			DefaultEdge evEdge100211 = undirectedGraph.addEdge("EV1002", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100211, cal[9].weightGiver(2, 11));

			DefaultEdge evEdge100212 = undirectedGraph.addEdge("EV1002", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100212, cal[9].weightGiver(2, 12));

			

			DefaultEdge evEdge100304 = undirectedGraph.addEdge("EV1003", "EV1004");

			undirectedGraph.setEdgeWeight(evEdge100304, cal[9].weightGiver(3, 4));

			DefaultEdge evEdge100305 = undirectedGraph.addEdge("EV1003", "EV1005");

			undirectedGraph.setEdgeWeight(evEdge100305, cal[9].weightGiver(3, 5));

			DefaultEdge evEdge100306 = undirectedGraph.addEdge("EV1003", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge100306, cal[9].weightGiver(3, 6));

			DefaultEdge evEdge100307 = undirectedGraph.addEdge("EV1003", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge100307, cal[9].weightGiver(3, 7));

			DefaultEdge evEdge100308 = undirectedGraph.addEdge("EV1003", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge100308, cal[9].weightGiver(3, 8));

			DefaultEdge evEdge100309 = undirectedGraph.addEdge("EV1003", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100309, cal[9].weightGiver(3, 9));

			DefaultEdge evEdge100310 = undirectedGraph.addEdge("EV1003", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100310, cal[9].weightGiver(3, 10));

			DefaultEdge evEdge100311 = undirectedGraph.addEdge("EV1003", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100311, cal[9].weightGiver(3, 11));

			DefaultEdge evEdge100312 = undirectedGraph.addEdge("EV1003", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100312, cal[9].weightGiver(3, 12));

			

			DefaultEdge evEdge100405 = undirectedGraph.addEdge("EV1004", "EV1005");

			undirectedGraph.setEdgeWeight(evEdge100405, cal[9].weightGiver(4, 5));

			DefaultEdge evEdge100406 = undirectedGraph.addEdge("EV1004", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge100406, cal[9].weightGiver(4, 6));

			DefaultEdge evEdge100407 = undirectedGraph.addEdge("EV1004", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge100407, cal[9].weightGiver(4, 7));

			DefaultEdge evEdge100408 = undirectedGraph.addEdge("EV1004", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge100408, cal[9].weightGiver(4, 8));

			DefaultEdge evEdge100409 = undirectedGraph.addEdge("EV1004", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100409, cal[9].weightGiver(4, 9));

			DefaultEdge evEdge100410 = undirectedGraph.addEdge("EV1004", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100410, cal[9].weightGiver(4, 10));

			DefaultEdge evEdge100411 = undirectedGraph.addEdge("EV1004", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100411, cal[9].weightGiver(4, 11));

			DefaultEdge evEdge100412 = undirectedGraph.addEdge("EV1004", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100412, cal[9].weightGiver(4, 12));

		

			DefaultEdge evEdge100506 = undirectedGraph.addEdge("EV1005", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge100506, cal[9].weightGiver(5, 6));

			DefaultEdge evEdge100507 = undirectedGraph.addEdge("EV1005", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge100507, cal[9].weightGiver(5, 7));

			DefaultEdge evEdge100508 = undirectedGraph.addEdge("EV1005", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge100508, cal[9].weightGiver(5, 8));

			DefaultEdge evEdge100509 = undirectedGraph.addEdge("EV1005", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100509, cal[9].weightGiver(5, 9));

			DefaultEdge evEdge100510 = undirectedGraph.addEdge("EV1005", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100510, cal[9].weightGiver(5, 10));

			DefaultEdge evEdge100511 = undirectedGraph.addEdge("EV1005", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100511, cal[9].weightGiver(5, 11));

			DefaultEdge evEdge100512 = undirectedGraph.addEdge("EV1005", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100512, cal[9].weightGiver(5, 12));

			

			DefaultEdge evEdge100607 = undirectedGraph.addEdge("EV1006", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge100607, cal[9].weightGiver(6, 7));

			DefaultEdge evEdge100608 = undirectedGraph.addEdge("EV1006", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge100608, cal[9].weightGiver(6, 8));

			DefaultEdge evEdge100609 = undirectedGraph.addEdge("EV1006", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100609, cal[9].weightGiver(6, 9));

			DefaultEdge evEdge100610 = undirectedGraph.addEdge("EV1006", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100610, cal[9].weightGiver(6, 10));

			DefaultEdge evEdge100611 = undirectedGraph.addEdge("EV1006", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100611, cal[9].weightGiver(6, 11));

			DefaultEdge evEdge100612 = undirectedGraph.addEdge("EV1006", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100612, cal[9].weightGiver(6, 12));

			

			DefaultEdge evEdge100708 = undirectedGraph.addEdge("EV1007", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge100708, cal[9].weightGiver(7, 8));

			DefaultEdge evEdge100709 = undirectedGraph.addEdge("EV1007", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100709, cal[9].weightGiver(7, 9));

			DefaultEdge evEdge100710 = undirectedGraph.addEdge("EV1007", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100710, cal[9].weightGiver(7, 10));

			DefaultEdge evEdge100711 = undirectedGraph.addEdge("EV1007", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100711, cal[9].weightGiver(7, 11));

			DefaultEdge evEdge100712 = undirectedGraph.addEdge("EV1007", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100712, cal[9].weightGiver(7, 12));

			

			DefaultEdge evEdge100809 = undirectedGraph.addEdge("EV1008", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100809, cal[9].weightGiver(8, 9));

			DefaultEdge evEdge100810 = undirectedGraph.addEdge("EV1008", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100810, cal[9].weightGiver(8, 10));

			DefaultEdge evEdge100811 = undirectedGraph.addEdge("EV1008", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100811, cal[9].weightGiver(8, 11));

			DefaultEdge evEdge100812 = undirectedGraph.addEdge("EV1008", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100812, cal[9].weightGiver(8, 12));

			

			DefaultEdge evEdge100910 = undirectedGraph.addEdge("EV1009", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100910, cal[9].weightGiver(9, 10));

			DefaultEdge evEdge100911 = undirectedGraph.addEdge("EV1009", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100911, cal[9].weightGiver(9, 11));

			DefaultEdge evEdge100912 = undirectedGraph.addEdge("EV1009", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100912, cal[9].weightGiver(9, 12));

			

			DefaultEdge evEdge101011 = undirectedGraph.addEdge("EV1010", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge101011, cal[9].weightGiver(10, 11));

			DefaultEdge evEdge101012 = undirectedGraph.addEdge("EV1010", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge101012, cal[9].weightGiver(10, 12));

			

			DefaultEdge evEdge101112 = undirectedGraph.addEdge("EV1011", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge101112, cal[9].weightGiver(11, 12));

			

			//11호기

			DefaultEdge evEdge11B3B2 = undirectedGraph.addEdge("EV11B3", "EV11B2");

			undirectedGraph.setEdgeWeight(evEdge11B3B2, cal[10].weightGiver(-3, -2));

			DefaultEdge evEdge11B3B1 = undirectedGraph.addEdge("EV11B3", "EV11B1");

			undirectedGraph.setEdgeWeight(evEdge11B3B1, cal[10].weightGiver(-3, -1));			

			DefaultEdge evEdge11B301 = undirectedGraph.addEdge("EV11B3", "EV1101");

			undirectedGraph.setEdgeWeight(evEdge11B301, cal[10].weightGiver(-3, 1));

			DefaultEdge evEdge11B303 = undirectedGraph.addEdge("EV11B3", "EV1103");

			undirectedGraph.setEdgeWeight(evEdge11B303, cal[10].weightGiver(-3, 3));

			DefaultEdge evEdge11B305 = undirectedGraph.addEdge("EV11B3", "EV1105");

			undirectedGraph.setEdgeWeight(evEdge11B305, cal[10].weightGiver(-3, 5));

			DefaultEdge evEdge11B307 = undirectedGraph.addEdge("EV11B3", "EV1107");

			undirectedGraph.setEdgeWeight(evEdge11B307, cal[10].weightGiver(-3, 7));

			DefaultEdge evEdge11B309 = undirectedGraph.addEdge("EV11B3", "EV1109");

			undirectedGraph.setEdgeWeight(evEdge11B309, cal[10].weightGiver(-3, 9));

			

			DefaultEdge evEdge11B2B1 = undirectedGraph.addEdge("EV11B2", "EV11B1");

			undirectedGraph.setEdgeWeight(evEdge11B2B1, cal[10].weightGiver(-2, -1));

			DefaultEdge evEdge11B201 = undirectedGraph.addEdge("EV11B2", "EV1101");

			undirectedGraph.setEdgeWeight(evEdge11B201, cal[10].weightGiver(-2, 1));

			DefaultEdge evEdge11B203 = undirectedGraph.addEdge("EV11B2", "EV1103");

			undirectedGraph.setEdgeWeight(evEdge11B203, cal[10].weightGiver(-2, 3));

			DefaultEdge evEdge11B205 = undirectedGraph.addEdge("EV11B2", "EV1105");

			undirectedGraph.setEdgeWeight(evEdge11B205, cal[10].weightGiver(-2, 5));

			DefaultEdge evEdge11B207 = undirectedGraph.addEdge("EV11B2", "EV1107");

			undirectedGraph.setEdgeWeight(evEdge11B207, cal[10].weightGiver(-2, 7));

			DefaultEdge evEdge11B209 = undirectedGraph.addEdge("EV11B2", "EV1109");

			undirectedGraph.setEdgeWeight(evEdge11B209, cal[10].weightGiver(-2, 9));

			

			DefaultEdge evEdge11B101 = undirectedGraph.addEdge("EV11B1", "EV1101");

			undirectedGraph.setEdgeWeight(evEdge11B101, cal[10].weightGiver(-1, 1));

			DefaultEdge evEdge11B103 = undirectedGraph.addEdge("EV11B1", "EV1103");

			undirectedGraph.setEdgeWeight(evEdge11B103, cal[10].weightGiver(-1, 3));

			DefaultEdge evEdge11B105 = undirectedGraph.addEdge("EV11B1", "EV1105");

			undirectedGraph.setEdgeWeight(evEdge11B105, cal[10].weightGiver(-1, 5));

			DefaultEdge evEdge11B107 = undirectedGraph.addEdge("EV11B1", "EV1107");

			undirectedGraph.setEdgeWeight(evEdge11B107, cal[10].weightGiver(-1, 7));

			DefaultEdge evEdge11B109 = undirectedGraph.addEdge("EV11B1", "EV1109");

			undirectedGraph.setEdgeWeight(evEdge11B109, cal[10].weightGiver(-1, 9));

 

			DefaultEdge evEdge110103 = undirectedGraph.addEdge("EV1101", "EV1103");

			undirectedGraph.setEdgeWeight(evEdge110103, cal[10].weightGiver(1, 3));

			DefaultEdge evEdge110105 = undirectedGraph.addEdge("EV1101", "EV1105");

			undirectedGraph.setEdgeWeight(evEdge110105, cal[10].weightGiver(1, 5));

			DefaultEdge evEdge110107 = undirectedGraph.addEdge("EV1101", "EV1107");

			undirectedGraph.setEdgeWeight(evEdge110107, cal[10].weightGiver(1, 7));

			DefaultEdge evEdge110109 = undirectedGraph.addEdge("EV1101", "EV1109");

			undirectedGraph.setEdgeWeight(evEdge110109, cal[10].weightGiver(1, 9));

			

			DefaultEdge evEdge110305 = undirectedGraph.addEdge("EV1103", "EV1105");

			undirectedGraph.setEdgeWeight(evEdge110305, cal[10].weightGiver(3, 5));

			DefaultEdge evEdge110307 = undirectedGraph.addEdge("EV1103", "EV1107");

			undirectedGraph.setEdgeWeight(evEdge110307, cal[10].weightGiver(3, 7));

			DefaultEdge evEdge110309 = undirectedGraph.addEdge("EV1103", "EV1109");

			undirectedGraph.setEdgeWeight(evEdge110309, cal[10].weightGiver(3, 9));

			

			DefaultEdge evEdge110507 = undirectedGraph.addEdge("EV1105", "EV1107");

			undirectedGraph.setEdgeWeight(evEdge110507, cal[10].weightGiver(5, 7));

			DefaultEdge evEdge110509 = undirectedGraph.addEdge("EV1105", "EV1109");

			undirectedGraph.setEdgeWeight(evEdge110509, cal[10].weightGiver(5, 9));

			

			DefaultEdge evEdge110709 = undirectedGraph.addEdge("EV1107", "EV1109");

			undirectedGraph.setEdgeWeight(evEdge110709, cal[10].weightGiver(7, 9));

			

			//12호기

			DefaultEdge evEdge12B3B2 = undirectedGraph.addEdge("EV12B3", "EV12B2");

			undirectedGraph.setEdgeWeight(evEdge12B3B2, cal[11].weightGiver(-3, -2));

			DefaultEdge evEdge12B3B1 = undirectedGraph.addEdge("EV12B3", "EV12B1");

			undirectedGraph.setEdgeWeight(evEdge12B3B1, cal[11].weightGiver(-3, -1));			

			DefaultEdge evEdge12B301 = undirectedGraph.addEdge("EV12B3", "EV1201");

			undirectedGraph.setEdgeWeight(evEdge12B301, cal[11].weightGiver(-3, 1));

			DefaultEdge evEdge12B304 = undirectedGraph.addEdge("EV12B3", "EV1204");

			undirectedGraph.setEdgeWeight(evEdge12B304, cal[11].weightGiver(-3, 4));

			DefaultEdge evEdge12B306 = undirectedGraph.addEdge("EV12B3", "EV1206");

			undirectedGraph.setEdgeWeight(evEdge12B306, cal[11].weightGiver(-3, 6));

			DefaultEdge evEdge12B308 = undirectedGraph.addEdge("EV12B3", "EV1208");

			undirectedGraph.setEdgeWeight(evEdge12B308, cal[11].weightGiver(-3, 8));

			

			DefaultEdge evEdge12B2B1 = undirectedGraph.addEdge("EV12B2", "EV12B1");

			undirectedGraph.setEdgeWeight(evEdge12B2B1, cal[11].weightGiver(-2, -1));

			DefaultEdge evEdge12B201 = undirectedGraph.addEdge("EV12B2", "EV1201");

			undirectedGraph.setEdgeWeight(evEdge12B201, cal[11].weightGiver(-2, 1));

			DefaultEdge evEdge12B204 = undirectedGraph.addEdge("EV12B2", "EV1204");

			undirectedGraph.setEdgeWeight(evEdge12B204, cal[11].weightGiver(-2, 4));

			DefaultEdge evEdge12B206 = undirectedGraph.addEdge("EV12B2", "EV1206");

			undirectedGraph.setEdgeWeight(evEdge12B206, cal[11].weightGiver(-2, 6));

			DefaultEdge evEdge12B208 = undirectedGraph.addEdge("EV12B2", "EV1208");

			undirectedGraph.setEdgeWeight(evEdge12B208, cal[11].weightGiver(-2, 8));

			

			DefaultEdge evEdge12B101 = undirectedGraph.addEdge("EV12B1", "EV1201");

			undirectedGraph.setEdgeWeight(evEdge12B101, cal[11].weightGiver(-1, 1));

			DefaultEdge evEdge12B104 = undirectedGraph.addEdge("EV12B1", "EV1204");

			undirectedGraph.setEdgeWeight(evEdge12B104, cal[11].weightGiver(-1, 4));

			DefaultEdge evEdge12B106 = undirectedGraph.addEdge("EV12B1", "EV1206");

			undirectedGraph.setEdgeWeight(evEdge12B106, cal[11].weightGiver(-1, 6));

			DefaultEdge evEdge12B108 = undirectedGraph.addEdge("EV12B1", "EV1208");

			undirectedGraph.setEdgeWeight(evEdge12B108, cal[11].weightGiver(-1, 8));

 

			DefaultEdge evEdge120104 = undirectedGraph.addEdge("EV1201", "EV1204");

			undirectedGraph.setEdgeWeight(evEdge120104, cal[11].weightGiver(1, 4));

			DefaultEdge evEdge120106 = undirectedGraph.addEdge("EV1201", "EV1206");

			undirectedGraph.setEdgeWeight(evEdge120106, cal[11].weightGiver(1, 6));

			DefaultEdge evEdge120108 = undirectedGraph.addEdge("EV1201", "EV1208");

			undirectedGraph.setEdgeWeight(evEdge120108, cal[11].weightGiver(1, 8));

			

			DefaultEdge evEdge120406 = undirectedGraph.addEdge("EV1204", "EV1206");

			undirectedGraph.setEdgeWeight(evEdge120406, cal[11].weightGiver(4, 6));

			DefaultEdge evEdge120408 = undirectedGraph.addEdge("EV1204", "EV1208");

			undirectedGraph.setEdgeWeight(evEdge120408, cal[11].weightGiver(4, 8));

			

			DefaultEdge evEdge120608 = undirectedGraph.addEdge("EV1206", "EV1208");

			undirectedGraph.setEdgeWeight(evEdge120608, cal[11].weightGiver(6, 8));

		}

		

		else if(up_down < 0) {

 

 

			DefaultEdge evEdge010301 = undirectedGraph.addEdge("EV0101", "EV0103");

			undirectedGraph.setEdgeWeight(evEdge010301, cal[0].weightGiver(3, 1));

			DefaultEdge evEdge010501 = undirectedGraph.addEdge("EV0101", "EV0105");

			undirectedGraph.setEdgeWeight(evEdge010501, cal[0].weightGiver(5, 1));

			DefaultEdge evEdge010701 = undirectedGraph.addEdge("EV0101", "EV0107");

			undirectedGraph.setEdgeWeight(evEdge010701, cal[0].weightGiver(7, 1));

			DefaultEdge evEdge010901 = undirectedGraph.addEdge("EV0101", "EV0109");

			undirectedGraph.setEdgeWeight(evEdge010901, cal[0].weightGiver(9, 1));

			DefaultEdge evEdge010503 = undirectedGraph.addEdge("EV0103", "EV0105");

			undirectedGraph.setEdgeWeight(evEdge010503, cal[0].weightGiver(5, 3));

			DefaultEdge evEdge010703 = undirectedGraph.addEdge("EV0103", "EV0107");

			undirectedGraph.setEdgeWeight(evEdge010703, cal[0].weightGiver(7, 3));

			DefaultEdge evEdge010903 = undirectedGraph.addEdge("EV0103", "EV0109");

			undirectedGraph.setEdgeWeight(evEdge010903, cal[0].weightGiver(9, 3));

			DefaultEdge evEdge010705 = undirectedGraph.addEdge("EV0105", "EV0107");

			undirectedGraph.setEdgeWeight(evEdge010705, cal[0].weightGiver(7, 5));

			DefaultEdge evEdge010905 = undirectedGraph.addEdge("EV0105", "EV0109");

			undirectedGraph.setEdgeWeight(evEdge010905, cal[0].weightGiver(9, 5));

			DefaultEdge evEdge010907 = undirectedGraph.addEdge("EV0107", "EV0109");

			undirectedGraph.setEdgeWeight(evEdge010907, cal[0].weightGiver(9, 7));

 

			//2호기

 

			DefaultEdge evEdge020102 = undirectedGraph.addEdge("EV0201", "EV0202");

			undirectedGraph.setEdgeWeight(evEdge020102, cal[1].weightGiver(2, 1));

			DefaultEdge evEdge020104 = undirectedGraph.addEdge("EV0201", "EV0204");

			undirectedGraph.setEdgeWeight(evEdge020104, cal[1].weightGiver(4, 1));

			DefaultEdge evEdge020106 = undirectedGraph.addEdge("EV0201", "EV0206");

			undirectedGraph.setEdgeWeight(evEdge020106, cal[1].weightGiver(6, 1));

			DefaultEdge evEdge020108 = undirectedGraph.addEdge("EV0201", "EV0208");

			undirectedGraph.setEdgeWeight(evEdge020108, cal[1].weightGiver(8, 1));

			DefaultEdge evEdge020204 = undirectedGraph.addEdge("EV0202", "EV0204");

			undirectedGraph.setEdgeWeight(evEdge020204, cal[1].weightGiver(4, 2));

			DefaultEdge evEdge020206 = undirectedGraph.addEdge("EV0202", "EV0206");

			undirectedGraph.setEdgeWeight(evEdge020206, cal[1].weightGiver(6, 2));

			DefaultEdge evEdge020208 = undirectedGraph.addEdge("EV0202", "EV0208");

			undirectedGraph.setEdgeWeight(evEdge020208, cal[1].weightGiver(8, 2));

			DefaultEdge evEdge020406 = undirectedGraph.addEdge("EV0204", "EV0206");

			undirectedGraph.setEdgeWeight(evEdge020406, cal[1].weightGiver(6, 4));

			DefaultEdge evEdge020408 = undirectedGraph.addEdge("EV0204", "EV0208");

			undirectedGraph.setEdgeWeight(evEdge020408, cal[1].weightGiver(8, 4));

			DefaultEdge evEdge020608 = undirectedGraph.addEdge("EV0206", "EV0208");

			undirectedGraph.setEdgeWeight(evEdge020608, cal[1].weightGiver(8, 6));

			

 

			DefaultEdge evEdge03B6B5 = undirectedGraph.addEdge("EV03B6", "EV03B5");

			undirectedGraph.setEdgeWeight(evEdge03B6B5, cal[2].weightGiver(-5, -6));

			DefaultEdge evEdge03B6B4 = undirectedGraph.addEdge("EV03B6", "EV03B4");

			undirectedGraph.setEdgeWeight(evEdge03B6B4, cal[2].weightGiver(-4, -6));

			DefaultEdge evEdge03B6B3 = undirectedGraph.addEdge("EV03B6", "EV03B3");

			undirectedGraph.setEdgeWeight(evEdge03B6B3, cal[2].weightGiver(-3, -6));

			DefaultEdge evEdge03B601 = undirectedGraph.addEdge("EV03B6", "EV0301");

			undirectedGraph.setEdgeWeight(evEdge03B601, cal[2].weightGiver(1, -6));

			DefaultEdge evEdge03B603 = undirectedGraph.addEdge("EV03B6", "EV0303");

			undirectedGraph.setEdgeWeight(evEdge03B603, cal[2].weightGiver(3, -6));

			DefaultEdge evEdge03B605 = undirectedGraph.addEdge("EV03B6", "EV0305");

			undirectedGraph.setEdgeWeight(evEdge03B605, cal[2].weightGiver(5, -6));

			DefaultEdge evEdge03B607 = undirectedGraph.addEdge("EV03B6", "EV0307");

			undirectedGraph.setEdgeWeight(evEdge03B607, cal[2].weightGiver(7, -6));

			DefaultEdge evEdge03B609 = undirectedGraph.addEdge("EV03B6", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge03B609, cal[2].weightGiver(9, -6));

			DefaultEdge evEdge03B5B4 = undirectedGraph.addEdge("EV03B5", "EV03B4");

			undirectedGraph.setEdgeWeight(evEdge03B5B4, cal[2].weightGiver(-4, -5));

			DefaultEdge evEdge03B5B3 = undirectedGraph.addEdge("EV03B5", "EV03B3");

			undirectedGraph.setEdgeWeight(evEdge03B5B3, cal[2].weightGiver(-3, -5));

			DefaultEdge evEdge03B501 = undirectedGraph.addEdge("EV03B5", "EV0301");

			undirectedGraph.setEdgeWeight(evEdge03B501, cal[2].weightGiver(1, -5));

			DefaultEdge evEdge03B503 = undirectedGraph.addEdge("EV03B5", "EV0303");

			undirectedGraph.setEdgeWeight(evEdge03B503, cal[2].weightGiver(3, -5));

			DefaultEdge evEdge03B505 = undirectedGraph.addEdge("EV03B5", "EV0305");

			undirectedGraph.setEdgeWeight(evEdge03B505, cal[2].weightGiver(5, -5));

			DefaultEdge evEdge03B507 = undirectedGraph.addEdge("EV03B5", "EV0307");

			undirectedGraph.setEdgeWeight(evEdge03B507, cal[2].weightGiver(7, -5));

			DefaultEdge evEdge03B509 = undirectedGraph.addEdge("EV03B5", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge03B509, cal[2].weightGiver(9, -5));

			DefaultEdge evEdge03B4B3 = undirectedGraph.addEdge("EV03B4", "EV03B3");

			undirectedGraph.setEdgeWeight(evEdge03B4B3, cal[2].weightGiver(-3, -4));

			DefaultEdge evEdge03B401 = undirectedGraph.addEdge("EV03B4", "EV0301");

			undirectedGraph.setEdgeWeight(evEdge03B401, cal[2].weightGiver(1, -4));

			DefaultEdge evEdge03B403 = undirectedGraph.addEdge("EV03B4", "EV0303");

			undirectedGraph.setEdgeWeight(evEdge03B403, cal[2].weightGiver(3, -4));

			DefaultEdge evEdge03B405 = undirectedGraph.addEdge("EV03B4", "EV0305");

			undirectedGraph.setEdgeWeight(evEdge03B405, cal[2].weightGiver(5, -4));

			DefaultEdge evEdge03B407 = undirectedGraph.addEdge("EV03B4", "EV0307");

			undirectedGraph.setEdgeWeight(evEdge03B407, cal[2].weightGiver(7, -4));

			DefaultEdge evEdge03B409 = undirectedGraph.addEdge("EV03B4", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge03B409, cal[2].weightGiver(9, -4));

			DefaultEdge evEdge03B301 = undirectedGraph.addEdge("EV03B3", "EV0301");

			undirectedGraph.setEdgeWeight(evEdge03B301, cal[2].weightGiver(1, -3));

			DefaultEdge evEdge03B303 = undirectedGraph.addEdge("EV03B3", "EV0303");

			undirectedGraph.setEdgeWeight(evEdge03B303, cal[2].weightGiver(3, -3));

			DefaultEdge evEdge03B305 = undirectedGraph.addEdge("EV03B3", "EV0305");

			undirectedGraph.setEdgeWeight(evEdge03B305, cal[2].weightGiver(5, -3));

			DefaultEdge evEdge03B307 = undirectedGraph.addEdge("EV03B3", "EV0307");

			undirectedGraph.setEdgeWeight(evEdge03B307, cal[2].weightGiver(7, -3));

			DefaultEdge evEdge03B309 = undirectedGraph.addEdge("EV03B3", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge03B309, cal[2].weightGiver(9, -3));

			DefaultEdge evEdge030103 = undirectedGraph.addEdge("EV0301", "EV0303");

			undirectedGraph.setEdgeWeight(evEdge030103, cal[2].weightGiver(3, 1));

			DefaultEdge evEdge030105 = undirectedGraph.addEdge("EV0301", "EV0305");

			undirectedGraph.setEdgeWeight(evEdge030105, cal[2].weightGiver(5, 1));

			DefaultEdge evEdge030107 = undirectedGraph.addEdge("EV0301", "EV0307");

			undirectedGraph.setEdgeWeight(evEdge030107, cal[2].weightGiver(7, 1));

			DefaultEdge evEdge030109 = undirectedGraph.addEdge("EV0301", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge030109, cal[2].weightGiver(9, 1));

			DefaultEdge evEdge030305 = undirectedGraph.addEdge("EV0303", "EV0305");

			undirectedGraph.setEdgeWeight(evEdge030305, cal[2].weightGiver(5, 3));

			DefaultEdge evEdge030307 = undirectedGraph.addEdge("EV0303", "EV0307");

			undirectedGraph.setEdgeWeight(evEdge030307, cal[2].weightGiver(7, 3));

			DefaultEdge evEdge030309 = undirectedGraph.addEdge("EV0303", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge030309, cal[2].weightGiver(9, 3));

			DefaultEdge evEdge030507 = undirectedGraph.addEdge("EV0305", "EV0307");

			undirectedGraph.setEdgeWeight(evEdge030507, cal[2].weightGiver(7, 5));

			DefaultEdge evEdge030509 = undirectedGraph.addEdge("EV0305", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge030509, cal[2].weightGiver(9, 5));

			DefaultEdge evEdge030709 = undirectedGraph.addEdge("EV0307", "EV0309");

			undirectedGraph.setEdgeWeight(evEdge030709, cal[2].weightGiver(9, 7));

		

		

			DefaultEdge evEdge04B6B5 = undirectedGraph.addEdge("EV04B6", "EV04B5");

			undirectedGraph.setEdgeWeight(evEdge04B6B5, cal[3].weightGiver(-5, -6));

			DefaultEdge evEdge04B6B4 = undirectedGraph.addEdge("EV04B6", "EV04B4");

			undirectedGraph.setEdgeWeight(evEdge04B6B4, cal[3].weightGiver(-4, -6));

			DefaultEdge evEdge04B6B3 = undirectedGraph.addEdge("EV04B6", "EV04B3");

			undirectedGraph.setEdgeWeight(evEdge04B6B3, cal[3].weightGiver(-3, -6));

			DefaultEdge evEdge04B601 = undirectedGraph.addEdge("EV04B6", "EV0401");

			undirectedGraph.setEdgeWeight(evEdge04B601, cal[3].weightGiver(1, -6));

			DefaultEdge evEdge04B604 = undirectedGraph.addEdge("EV04B6", "EV0404");

			undirectedGraph.setEdgeWeight(evEdge04B604, cal[3].weightGiver(4, -6));

			DefaultEdge evEdge04B606 = undirectedGraph.addEdge("EV04B6", "EV0406");

			undirectedGraph.setEdgeWeight(evEdge04B606, cal[3].weightGiver(6, -6));

			DefaultEdge evEdge04B608 = undirectedGraph.addEdge("EV04B6", "EV0408");

			undirectedGraph.setEdgeWeight(evEdge04B608, cal[3].weightGiver(8, -6));

			DefaultEdge evEdge04B5B4 = undirectedGraph.addEdge("EV04B5", "EV04B4");

			undirectedGraph.setEdgeWeight(evEdge04B5B4, cal[3].weightGiver(-4, -5));

			DefaultEdge evEdge04B5B3 = undirectedGraph.addEdge("EV04B5", "EV04B3");

			undirectedGraph.setEdgeWeight(evEdge04B5B3, cal[3].weightGiver(-3, -5));

			DefaultEdge evEdge04B501 = undirectedGraph.addEdge("EV04B5", "EV0401");

			undirectedGraph.setEdgeWeight(evEdge04B501, cal[3].weightGiver(1, 5));

			DefaultEdge evEdge04B504 = undirectedGraph.addEdge("EV04B5", "EV0404");

			undirectedGraph.setEdgeWeight(evEdge04B504, cal[3].weightGiver(4, -5));

			DefaultEdge evEdge04B506 = undirectedGraph.addEdge("EV04B5", "EV0406");

			undirectedGraph.setEdgeWeight(evEdge04B506, cal[3].weightGiver(6, -5));

			DefaultEdge evEdge04B508 = undirectedGraph.addEdge("EV04B5", "EV0408");

			undirectedGraph.setEdgeWeight(evEdge04B508, cal[3].weightGiver(8, -5));

			DefaultEdge evEdge04B4B3 = undirectedGraph.addEdge("EV04B4", "EV04B3");

			undirectedGraph.setEdgeWeight(evEdge04B4B3, cal[3].weightGiver(-3, -4));

			DefaultEdge evEdge04B401 = undirectedGraph.addEdge("EV04B4", "EV0401");

			undirectedGraph.setEdgeWeight(evEdge04B401, cal[3].weightGiver(1, -4));

			DefaultEdge evEdge04B404 = undirectedGraph.addEdge("EV04B4", "EV0404");

			undirectedGraph.setEdgeWeight(evEdge04B404, cal[3].weightGiver(4, -4));

			DefaultEdge evEdge04B406 = undirectedGraph.addEdge("EV04B4", "EV0406");

			undirectedGraph.setEdgeWeight(evEdge04B406, cal[3].weightGiver(6, -4));

			DefaultEdge evEdge04B408 = undirectedGraph.addEdge("EV04B4", "EV0408");

			undirectedGraph.setEdgeWeight(evEdge04B408, cal[3].weightGiver(8, -4));

			DefaultEdge evEdge04B301 = undirectedGraph.addEdge("EV04B3", "EV0401");

			undirectedGraph.setEdgeWeight(evEdge04B301, cal[3].weightGiver(1, -3));

			DefaultEdge evEdge04B304 = undirectedGraph.addEdge("EV04B3", "EV0404");

			undirectedGraph.setEdgeWeight(evEdge04B304, cal[3].weightGiver(4, -3));

			DefaultEdge evEdge04B306 = undirectedGraph.addEdge("EV04B3", "EV0406");

			undirectedGraph.setEdgeWeight(evEdge04B306, cal[3].weightGiver(6, -3));

			DefaultEdge evEdge04B308 = undirectedGraph.addEdge("EV04B3", "EV0408");

			undirectedGraph.setEdgeWeight(evEdge04B308, cal[3].weightGiver(8, -3));

			DefaultEdge evEdge040104 = undirectedGraph.addEdge("EV0401", "EV0404");

			undirectedGraph.setEdgeWeight(evEdge040104, cal[3].weightGiver(4, 1));

			DefaultEdge evEdge040106 = undirectedGraph.addEdge("EV0401", "EV0406");

			undirectedGraph.setEdgeWeight(evEdge040106, cal[3].weightGiver(6, 1));

			DefaultEdge evEdge040108 = undirectedGraph.addEdge("EV0401", "EV0408");

			undirectedGraph.setEdgeWeight(evEdge040108, cal[3].weightGiver(8, 1));

			DefaultEdge evEdge040406 = undirectedGraph.addEdge("EV0404", "EV0406");

			undirectedGraph.setEdgeWeight(evEdge040406, cal[3].weightGiver(6, 4));

			DefaultEdge evEdge040408 = undirectedGraph.addEdge("EV0404", "EV0408");

			undirectedGraph.setEdgeWeight(evEdge040408, cal[3].weightGiver(8, 4));

			DefaultEdge evEdge040608 = undirectedGraph.addEdge("EV0406", "EV0408");

			undirectedGraph.setEdgeWeight(evEdge040608, cal[3].weightGiver(8, 6));

			

 

			DefaultEdge evEdge05B6B5 = undirectedGraph.addEdge("EV05B6", "EV05B5");

			undirectedGraph.setEdgeWeight(evEdge05B6B5, cal[4].weightGiver(-5, -6));

			DefaultEdge evEdge05B6B4 = undirectedGraph.addEdge("EV05B6", "EV05B4");

			undirectedGraph.setEdgeWeight(evEdge05B6B4, cal[4].weightGiver(-4, -6));

			DefaultEdge evEdge05B6B3 = undirectedGraph.addEdge("EV05B6", "EV05B3");

			undirectedGraph.setEdgeWeight(evEdge05B6B3, cal[4].weightGiver(-3, -6));

			DefaultEdge evEdge05B6B2 = undirectedGraph.addEdge("EV05B6", "EV05B2");

			undirectedGraph.setEdgeWeight(evEdge05B6B2, cal[4].weightGiver(-2, -6));

			DefaultEdge evEdge05B6B1 = undirectedGraph.addEdge("EV05B6", "EV05B1");

			undirectedGraph.setEdgeWeight(evEdge05B6B1, cal[4].weightGiver(-1, -6));

			DefaultEdge evEdge05B601 = undirectedGraph.addEdge("EV05B6", "EV0501");

			undirectedGraph.setEdgeWeight(evEdge05B601, cal[4].weightGiver(1, -6));

			DefaultEdge evEdge05B602 = undirectedGraph.addEdge("EV05B6", "EV0502");

			undirectedGraph.setEdgeWeight(evEdge05B602, cal[4].weightGiver(2, -6));

			DefaultEdge evEdge05B603 = undirectedGraph.addEdge("EV05B6", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge05B603, cal[4].weightGiver(3, -6));

			DefaultEdge evEdge05B604 = undirectedGraph.addEdge("EV05B6", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge05B604, cal[4].weightGiver(4, -6));

			DefaultEdge evEdge05B605 = undirectedGraph.addEdge("EV05B6", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge05B605, cal[4].weightGiver(5, -6));

			DefaultEdge evEdge05B606 = undirectedGraph.addEdge("EV05B6", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge05B606, cal[4].weightGiver(6, -6));

			DefaultEdge evEdge05B607 = undirectedGraph.addEdge("EV05B6", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge05B607, cal[4].weightGiver(7, -6));

			DefaultEdge evEdge05B608 = undirectedGraph.addEdge("EV05B6", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge05B608, cal[4].weightGiver(8, -6));

			DefaultEdge evEdge05B609 = undirectedGraph.addEdge("EV05B6", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge05B609, cal[4].weightGiver(9, -6));

			DefaultEdge evEdge05B5B4 = undirectedGraph.addEdge("EV05B5", "EV05B4");

			undirectedGraph.setEdgeWeight(evEdge05B5B4, cal[4].weightGiver(-4, -5));

			DefaultEdge evEdge05B5B3 = undirectedGraph.addEdge("EV05B5", "EV05B3");

			undirectedGraph.setEdgeWeight(evEdge05B5B3, cal[4].weightGiver(-3, -5));

			DefaultEdge evEdge05B5B2 = undirectedGraph.addEdge("EV05B5", "EV05B2");

			undirectedGraph.setEdgeWeight(evEdge05B5B2, cal[4].weightGiver(-2, -5));

			DefaultEdge evEdge05B5B1 = undirectedGraph.addEdge("EV05B5", "EV05B1");

			undirectedGraph.setEdgeWeight(evEdge05B5B1, cal[4].weightGiver(-1, -5));

			DefaultEdge evEdge05B501 = undirectedGraph.addEdge("EV05B5", "EV0501");

			undirectedGraph.setEdgeWeight(evEdge05B501, cal[4].weightGiver(1, -5));

			DefaultEdge evEdge05B502 = undirectedGraph.addEdge("EV05B5", "EV0502");

			undirectedGraph.setEdgeWeight(evEdge05B502, cal[4].weightGiver(2, -5));

			DefaultEdge evEdge05B503 = undirectedGraph.addEdge("EV05B5", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge05B503, cal[4].weightGiver(3, -5));

			DefaultEdge evEdge05B504 = undirectedGraph.addEdge("EV05B5", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge05B504, cal[4].weightGiver(4, -5));

			DefaultEdge evEdge05B505 = undirectedGraph.addEdge("EV05B5", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge05B505, cal[4].weightGiver(5, -5));

			DefaultEdge evEdge05B506 = undirectedGraph.addEdge("EV05B5", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge05B506, cal[4].weightGiver(6, -5));

			DefaultEdge evEdge05B507 = undirectedGraph.addEdge("EV05B5", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge05B507, cal[4].weightGiver(7, -5));

			DefaultEdge evEdge05B508 = undirectedGraph.addEdge("EV05B5", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge05B508, cal[4].weightGiver(8, -5));

			DefaultEdge evEdge05B509 = undirectedGraph.addEdge("EV05B5", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge05B509, cal[4].weightGiver(9, -5));

			DefaultEdge evEdge05B4B3 = undirectedGraph.addEdge("EV05B4", "EV05B3");

			undirectedGraph.setEdgeWeight(evEdge05B4B3, cal[4].weightGiver(-3, -4));

			DefaultEdge evEdge05B4B2 = undirectedGraph.addEdge("EV05B4", "EV05B2");

			undirectedGraph.setEdgeWeight(evEdge05B4B2, cal[4].weightGiver(-2, -4));

			DefaultEdge evEdge05B4B1 = undirectedGraph.addEdge("EV05B4", "EV05B1");

			undirectedGraph.setEdgeWeight(evEdge05B4B1, cal[4].weightGiver(-1, -4));

			DefaultEdge evEdge05B401 = undirectedGraph.addEdge("EV05B4", "EV0501");

			undirectedGraph.setEdgeWeight(evEdge05B401, cal[4].weightGiver(1, -4));

			DefaultEdge evEdge05B402 = undirectedGraph.addEdge("EV05B4", "EV40502");

			undirectedGraph.setEdgeWeight(evEdge05B402, cal[4].weightGiver(2, -4));

			DefaultEdge evEdge05B403 = undirectedGraph.addEdge("EV05B4", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge05B403, cal[4].weightGiver(3, -4));

			DefaultEdge evEdge05B404 = undirectedGraph.addEdge("EV05B4", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge05B404, cal[4].weightGiver(4, -4));

			DefaultEdge evEdge05B405 = undirectedGraph.addEdge("EV05B4", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge05B405, cal[4].weightGiver(5, -4));

			DefaultEdge evEdge05B406 = undirectedGraph.addEdge("EV05B4", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge05B406, cal[4].weightGiver(6, -4));

			DefaultEdge evEdge05B407 = undirectedGraph.addEdge("EV05B4", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge05B407, cal[4].weightGiver(7, -4));

			DefaultEdge evEdge05B408 = undirectedGraph.addEdge("EV05B4", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge05B408, cal[4].weightGiver(8, -4));

			DefaultEdge evEdge05B409 = undirectedGraph.addEdge("EV05B4", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge05B409, cal[4].weightGiver(9, -4));

			DefaultEdge evEdge05B3B2 = undirectedGraph.addEdge("EV05B3", "EV05B2");

			undirectedGraph.setEdgeWeight(evEdge05B3B2, cal[4].weightGiver(-2, -3));

			DefaultEdge evEdge05B3B1 = undirectedGraph.addEdge("EV05B3", "EV05B1");

			undirectedGraph.setEdgeWeight(evEdge05B3B1, cal[4].weightGiver(-1, -3));

			DefaultEdge evEdge05B301 = undirectedGraph.addEdge("EV05B3", "EV0501");

			undirectedGraph.setEdgeWeight(evEdge05B301, cal[4].weightGiver(1, -3));

			DefaultEdge evEdge05B302 = undirectedGraph.addEdge("EV05B3", "EV40502");

			undirectedGraph.setEdgeWeight(evEdge05B302, cal[4].weightGiver(2, -3));

			DefaultEdge evEdge05B303 = undirectedGraph.addEdge("EV05B3", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge05B303, cal[4].weightGiver(3, -3));

			DefaultEdge evEdge05B304 = undirectedGraph.addEdge("EV05B3", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge05B304, cal[4].weightGiver(4, -3));

			DefaultEdge evEdge05B305 = undirectedGraph.addEdge("EV05B3", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge05B305, cal[4].weightGiver(5, -3));

			DefaultEdge evEdge05B306 = undirectedGraph.addEdge("EV05B3", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge05B306, cal[4].weightGiver(6, -3));

			DefaultEdge evEdge05B307 = undirectedGraph.addEdge("EV05B3", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge05B307, cal[4].weightGiver(7, -3));

			DefaultEdge evEdge05B308 = undirectedGraph.addEdge("EV05B3", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge05B308, cal[4].weightGiver(8, -3));

			DefaultEdge evEdge05B309 = undirectedGraph.addEdge("EV05B3", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge05B309, cal[4].weightGiver(9, -3));

			DefaultEdge evEdge05B2B1 = undirectedGraph.addEdge("EV05B2", "EV05B1");

			undirectedGraph.setEdgeWeight(evEdge05B2B1, cal[4].weightGiver(-1, -2));

			DefaultEdge evEdge05B201 = undirectedGraph.addEdge("EV05B2", "EV0501");

			undirectedGraph.setEdgeWeight(evEdge05B201, cal[4].weightGiver(1, -2));

			DefaultEdge evEdge05B202 = undirectedGraph.addEdge("EV05B2", "EV40502");

			undirectedGraph.setEdgeWeight(evEdge05B202, cal[4].weightGiver(2, -2));

			DefaultEdge evEdge05B203 = undirectedGraph.addEdge("EV05B2", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge05B203, cal[4].weightGiver(3, -2));

			DefaultEdge evEdge05B204 = undirectedGraph.addEdge("EV05B2", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge05B204, cal[4].weightGiver(4, -2));

			DefaultEdge evEdge05B205 = undirectedGraph.addEdge("EV05B2", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge05B205, cal[4].weightGiver(5, -2));

			DefaultEdge evEdge05B206 = undirectedGraph.addEdge("EV05B2", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge05B206, cal[4].weightGiver(6, -2));

			DefaultEdge evEdge05B207 = undirectedGraph.addEdge("EV05B2", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge05B207, cal[4].weightGiver(7, -2));

			DefaultEdge evEdge05B208 = undirectedGraph.addEdge("EV05B2", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge05B208, cal[4].weightGiver(8, -2));

			DefaultEdge evEdge05B209 = undirectedGraph.addEdge("EV05B2", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge05B209, cal[4].weightGiver(9, -2));

			DefaultEdge evEdge05B101 = undirectedGraph.addEdge("EV05B1", "EV0501");

			undirectedGraph.setEdgeWeight(evEdge05B101, cal[4].weightGiver(1, -1));

			DefaultEdge evEdge05B102 = undirectedGraph.addEdge("EV05B1", "EV40502");

			undirectedGraph.setEdgeWeight(evEdge05B102, cal[4].weightGiver(2, -1));

			DefaultEdge evEdge05B103 = undirectedGraph.addEdge("EV05B1", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge05B103, cal[4].weightGiver(3, -1));

			DefaultEdge evEdge05B104 = undirectedGraph.addEdge("EV05B1", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge05B104, cal[4].weightGiver(4, -1));

			DefaultEdge evEdge05B105 = undirectedGraph.addEdge("EV05B1", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge05B105, cal[4].weightGiver(5, -1));

			DefaultEdge evEdge05B106 = undirectedGraph.addEdge("EV05B1", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge05B106, cal[4].weightGiver(6, -1));

			DefaultEdge evEdge05B107 = undirectedGraph.addEdge("EV05B1", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge05B107, cal[4].weightGiver(7, -1));

			DefaultEdge evEdge05B108 = undirectedGraph.addEdge("EV05B1", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge05B108, cal[4].weightGiver(8, -1));

			DefaultEdge evEdge05B109 = undirectedGraph.addEdge("EV05B1", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge05B109, cal[4].weightGiver(9, -1));

			DefaultEdge evEdge050102 = undirectedGraph.addEdge("EV0501", "EV40502");

			undirectedGraph.setEdgeWeight(evEdge050102, cal[4].weightGiver(2, 1));

			DefaultEdge evEdge050103 = undirectedGraph.addEdge("EV0501", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge050103, cal[4].weightGiver(3, 1));

			DefaultEdge evEdge050104 = undirectedGraph.addEdge("EV0501", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge050104, cal[4].weightGiver(4, 1));

			DefaultEdge evEdge050105 = undirectedGraph.addEdge("EV0501", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge050105, cal[4].weightGiver(5, 1));

			DefaultEdge evEdge050106 = undirectedGraph.addEdge("EV0501", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge050106, cal[4].weightGiver(6, 1));

			DefaultEdge evEdge050107 = undirectedGraph.addEdge("EV0501", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge050107, cal[4].weightGiver(7, 1));

			DefaultEdge evEdge050108 = undirectedGraph.addEdge("EV0501", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge050108, cal[4].weightGiver(8, 1));

			DefaultEdge evEdge050109 = undirectedGraph.addEdge("EV0501", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050109, cal[4].weightGiver(9, 1));

			DefaultEdge evEdge050203 = undirectedGraph.addEdge("EV0502", "EV0503");

			undirectedGraph.setEdgeWeight(evEdge050203, cal[4].weightGiver(3, 2));

			DefaultEdge evEdge050204 = undirectedGraph.addEdge("EV0502", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge050204, cal[4].weightGiver(4, 2));

			DefaultEdge evEdge050205 = undirectedGraph.addEdge("EV0502", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge050205, cal[4].weightGiver(5, 2));

			DefaultEdge evEdge050206 = undirectedGraph.addEdge("EV0502", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge050206, cal[4].weightGiver(6, 2));

			DefaultEdge evEdge050207 = undirectedGraph.addEdge("EV0502", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge050207, cal[4].weightGiver(7, 2));

			DefaultEdge evEdge050208 = undirectedGraph.addEdge("EV0502", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge050208, cal[4].weightGiver(8, 2));

			DefaultEdge evEdge050209 = undirectedGraph.addEdge("EV0502", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050209, cal[4].weightGiver(9, 2));

			DefaultEdge evEdge050304 = undirectedGraph.addEdge("EV0503", "EV0504");

			undirectedGraph.setEdgeWeight(evEdge050304, cal[4].weightGiver(4, 3));

			DefaultEdge evEdge050305 = undirectedGraph.addEdge("EV0503", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge050305, cal[4].weightGiver(5, 3));

			DefaultEdge evEdge050306 = undirectedGraph.addEdge("EV0503", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge050306, cal[4].weightGiver(6, 3));

			DefaultEdge evEdge050307 = undirectedGraph.addEdge("EV0503", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge050307, cal[4].weightGiver(7, 3));

			DefaultEdge evEdge050308 = undirectedGraph.addEdge("EV0503", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge050308, cal[4].weightGiver(8, 3));

			DefaultEdge evEdge050309 = undirectedGraph.addEdge("EV0503", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050309, cal[4].weightGiver(9, 3));

			DefaultEdge evEdge050405 = undirectedGraph.addEdge("EV0504", "EV0505");

			undirectedGraph.setEdgeWeight(evEdge050405, cal[4].weightGiver(5, 4));

			DefaultEdge evEdge050406 = undirectedGraph.addEdge("EV0504", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge050406, cal[4].weightGiver(6, 4));

			DefaultEdge evEdge050407 = undirectedGraph.addEdge("EV0504", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge050407, cal[4].weightGiver(7, 4));

			DefaultEdge evEdge050408 = undirectedGraph.addEdge("EV0504", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge050408, cal[4].weightGiver(8, 4));

			DefaultEdge evEdge050409 = undirectedGraph.addEdge("EV0504", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050409, cal[4].weightGiver(9, 4));

			DefaultEdge evEdge050506 = undirectedGraph.addEdge("EV0505", "EV0506");

			undirectedGraph.setEdgeWeight(evEdge050506, cal[4].weightGiver(6, 5));

			DefaultEdge evEdge050507 = undirectedGraph.addEdge("EV0505", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge050507, cal[4].weightGiver(7, 5));

			DefaultEdge evEdge050508 = undirectedGraph.addEdge("EV0505", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge050508, cal[4].weightGiver(8, 5));

			DefaultEdge evEdge050509 = undirectedGraph.addEdge("EV0505", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050509, cal[4].weightGiver(9, 5));

			DefaultEdge evEdge050607 = undirectedGraph.addEdge("EV0506", "EV0507");

			undirectedGraph.setEdgeWeight(evEdge050607, cal[4].weightGiver(7, 6));

			DefaultEdge evEdge050608 = undirectedGraph.addEdge("EV0506", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge050608, cal[4].weightGiver(8, 6));

			DefaultEdge evEdge050609 = undirectedGraph.addEdge("EV0506", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050609, cal[4].weightGiver(9, 6));

			DefaultEdge evEdge050708 = undirectedGraph.addEdge("EV0507", "EV0508");

			undirectedGraph.setEdgeWeight(evEdge050708, cal[4].weightGiver(8, 7));

			DefaultEdge evEdge050709 = undirectedGraph.addEdge("EV0507", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050709, cal[4].weightGiver(9, 7));

			DefaultEdge evEdge050809 = undirectedGraph.addEdge("EV0508", "EV0509");

			undirectedGraph.setEdgeWeight(evEdge050809, cal[4].weightGiver(9, 8));

			

			DefaultEdge evEdge06B3B2 = undirectedGraph.addEdge("EV06B3", "EV06B2");

			undirectedGraph.setEdgeWeight(evEdge06B3B2, cal[5].weightGiver(-2, -3));

			DefaultEdge evEdge06B3B1 = undirectedGraph.addEdge("EV06B3", "EV06B1");

			undirectedGraph.setEdgeWeight(evEdge06B3B1, cal[5].weightGiver(-1, -3));

			DefaultEdge evEdge06B301 = undirectedGraph.addEdge("EV06B3", "EV0601");

			undirectedGraph.setEdgeWeight(evEdge06B301, cal[5].weightGiver(1, -3));

			DefaultEdge evEdge06B302 = undirectedGraph.addEdge("EV06B3", "EV0602");

			undirectedGraph.setEdgeWeight(evEdge06B302, cal[5].weightGiver(2, -3));

			DefaultEdge evEdge06B303 = undirectedGraph.addEdge("EV06B3", "EV0603");

			undirectedGraph.setEdgeWeight(evEdge06B303, cal[5].weightGiver(3, -3));

			DefaultEdge evEdge06B304 = undirectedGraph.addEdge("EV06B3", "EV0604");

			undirectedGraph.setEdgeWeight(evEdge06B304, cal[5].weightGiver(4, -3));

			DefaultEdge evEdge06B305 = undirectedGraph.addEdge("EV06B3", "EV0605");

			undirectedGraph.setEdgeWeight(evEdge06B305, cal[5].weightGiver(5, -3));

			DefaultEdge evEdge06B306 = undirectedGraph.addEdge("EV06B3", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge06B306, cal[5].weightGiver(6, -3));

			DefaultEdge evEdge06B307 = undirectedGraph.addEdge("EV06B3", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge06B307, cal[5].weightGiver(7, -3));

			DefaultEdge evEdge06B308 = undirectedGraph.addEdge("EV06B3", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge06B308, cal[5].weightGiver(8, -3));

			DefaultEdge evEdge06B309 = undirectedGraph.addEdge("EV06B3", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge06B309, cal[5].weightGiver(9, -3));

			DefaultEdge evEdge06B310 = undirectedGraph.addEdge("EV06B3", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge06B310, cal[5].weightGiver(10, -3));

			DefaultEdge evEdge06B311 = undirectedGraph.addEdge("EV06B3", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge06B311, cal[5].weightGiver(11, -3));

			DefaultEdge evEdge06B312 = undirectedGraph.addEdge("EV06B3", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge06B312, cal[5].weightGiver(12, -3));

			

			DefaultEdge evEdge06B2B1 = undirectedGraph.addEdge("EV06B2", "EV06B1");

			undirectedGraph.setEdgeWeight(evEdge06B2B1, cal[5].weightGiver(-1, -2));

			DefaultEdge evEdge06B201 = undirectedGraph.addEdge("EV06B2", "EV0601");

			undirectedGraph.setEdgeWeight(evEdge06B201, cal[5].weightGiver(1, -2));

			DefaultEdge evEdge06B202 = undirectedGraph.addEdge("EV06B2", "EV0602");

			undirectedGraph.setEdgeWeight(evEdge06B202, cal[5].weightGiver(2, -2));

			DefaultEdge evEdge06B203 = undirectedGraph.addEdge("EV06B2", "EV0603");

			undirectedGraph.setEdgeWeight(evEdge06B203, cal[5].weightGiver(3, -2));

			DefaultEdge evEdge06B204 = undirectedGraph.addEdge("EV06B2", "EV0604");

			undirectedGraph.setEdgeWeight(evEdge06B204, cal[5].weightGiver(4, -2));

			DefaultEdge evEdge06B205 = undirectedGraph.addEdge("EV06B2", "EV0605");

			undirectedGraph.setEdgeWeight(evEdge06B205, cal[5].weightGiver(5, -2));

			DefaultEdge evEdge06B206 = undirectedGraph.addEdge("EV06B2", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge06B206, cal[5].weightGiver(6, -2));

			DefaultEdge evEdge06B207 = undirectedGraph.addEdge("EV06B2", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge06B207, cal[5].weightGiver(7, -2));

			DefaultEdge evEdge06B208 = undirectedGraph.addEdge("EV06B2", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge06B208, cal[5].weightGiver(8, -2));

			DefaultEdge evEdge06B209 = undirectedGraph.addEdge("EV06B2", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge06B209, cal[5].weightGiver(9, -2));

			DefaultEdge evEdge06B210 = undirectedGraph.addEdge("EV06B2", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge06B210, cal[5].weightGiver(10, -2));

			DefaultEdge evEdge06B211 = undirectedGraph.addEdge("EV06B2", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge06B211, cal[5].weightGiver(11, -2));

			DefaultEdge evEdge06B212 = undirectedGraph.addEdge("EV06B2", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge06B212, cal[5].weightGiver(12, -2));

 

			DefaultEdge evEdge06B101 = undirectedGraph.addEdge("EV06B1", "EV0601");

			undirectedGraph.setEdgeWeight(evEdge06B101, cal[5].weightGiver(1, -1));

			DefaultEdge evEdge06B102 = undirectedGraph.addEdge("EV06B1", "EV0602");

			undirectedGraph.setEdgeWeight(evEdge06B102, cal[5].weightGiver(2, -1));

			DefaultEdge evEdge06B103 = undirectedGraph.addEdge("EV06B1", "EV0603");

			undirectedGraph.setEdgeWeight(evEdge06B103, cal[5].weightGiver(3, -1));

			DefaultEdge evEdge06B104 = undirectedGraph.addEdge("EV06B1", "EV0604");

			undirectedGraph.setEdgeWeight(evEdge06B104, cal[5].weightGiver(4, -1));

			DefaultEdge evEdge06B105 = undirectedGraph.addEdge("EV06B1", "EV0605");

			undirectedGraph.setEdgeWeight(evEdge06B105, cal[5].weightGiver(5, -1));

			DefaultEdge evEdge06B106 = undirectedGraph.addEdge("EV06B1", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge06B106, cal[5].weightGiver(6, -1));

			DefaultEdge evEdge06B107 = undirectedGraph.addEdge("EV06B1", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge06B107, cal[5].weightGiver(7, -1));

			DefaultEdge evEdge06B108 = undirectedGraph.addEdge("EV06B1", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge06B108, cal[5].weightGiver(8, -1));

			DefaultEdge evEdge06B109 = undirectedGraph.addEdge("EV06B1", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge06B109, cal[5].weightGiver(9, -1));

			DefaultEdge evEdge06B110 = undirectedGraph.addEdge("EV06B1", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge06B110, cal[5].weightGiver(10, -1));

			DefaultEdge evEdge06B111 = undirectedGraph.addEdge("EV06B1", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge06B111, cal[5].weightGiver(11, -1));

			DefaultEdge evEdge06B112 = undirectedGraph.addEdge("EV06B1", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge06B112, cal[5].weightGiver(12, -1));

			

			DefaultEdge evEdge060102 = undirectedGraph.addEdge("EV0601", "EV0602");

			undirectedGraph.setEdgeWeight(evEdge060102, cal[5].weightGiver(2, 1));

			DefaultEdge evEdge060103 = undirectedGraph.addEdge("EV0601", "EV0603");

			undirectedGraph.setEdgeWeight(evEdge060103, cal[5].weightGiver(3, 1));

			DefaultEdge evEdge060104 = undirectedGraph.addEdge("EV0601", "EV0604");

			undirectedGraph.setEdgeWeight(evEdge060104, cal[5].weightGiver(4, 1));

			DefaultEdge evEdge060105 = undirectedGraph.addEdge("EV0601", "EV0605");

			undirectedGraph.setEdgeWeight(evEdge060105, cal[5].weightGiver(5, 1));

			DefaultEdge evEdge060106 = undirectedGraph.addEdge("EV0601", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge060106, cal[5].weightGiver(6, 1));

			DefaultEdge evEdge060107 = undirectedGraph.addEdge("EV0601", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge060107, cal[5].weightGiver(7, 1));

			DefaultEdge evEdge060108 = undirectedGraph.addEdge("EV0601", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge060108, cal[5].weightGiver(8, 1));

			DefaultEdge evEdge060109 = undirectedGraph.addEdge("EV0601", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060109, cal[5].weightGiver(9, 1));

			DefaultEdge evEdge060110 = undirectedGraph.addEdge("EV0601", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060110, cal[5].weightGiver(10, 1));

			DefaultEdge evEdge060111 = undirectedGraph.addEdge("EV0601", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060111, cal[5].weightGiver(11, 1));

			DefaultEdge evEdge060112 = undirectedGraph.addEdge("EV0601", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060112, cal[5].weightGiver(12, 1));

 

			DefaultEdge evEdge060203 = undirectedGraph.addEdge("EV0602", "EV0603");

			undirectedGraph.setEdgeWeight(evEdge060203, cal[5].weightGiver(3, 2));

			DefaultEdge evEdge060204 = undirectedGraph.addEdge("EV0602", "EV0604");

			undirectedGraph.setEdgeWeight(evEdge060204, cal[5].weightGiver(4, 2));

			DefaultEdge evEdge060205 = undirectedGraph.addEdge("EV0602", "EV0605");

			undirectedGraph.setEdgeWeight(evEdge060205, cal[5].weightGiver(5, 2));

			DefaultEdge evEdge060206 = undirectedGraph.addEdge("EV0602", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge060206, cal[5].weightGiver(6, 2));

			DefaultEdge evEdge060207 = undirectedGraph.addEdge("EV0602", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge060207, cal[5].weightGiver(7, 2));

			DefaultEdge evEdge060208 = undirectedGraph.addEdge("EV0602", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge060208, cal[5].weightGiver(8, 2));

			DefaultEdge evEdge060209 = undirectedGraph.addEdge("EV0602", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060209, cal[5].weightGiver(9, 2));

			DefaultEdge evEdge060210 = undirectedGraph.addEdge("EV0602", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060210, cal[5].weightGiver(10, 2));

			DefaultEdge evEdge060211 = undirectedGraph.addEdge("EV0602", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060211, cal[5].weightGiver(11, 2));

			DefaultEdge evEdge060212 = undirectedGraph.addEdge("EV0602", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060212, cal[5].weightGiver(12, 2));

 

			DefaultEdge evEdge060304 = undirectedGraph.addEdge("EV0603", "EV0604");

			undirectedGraph.setEdgeWeight(evEdge060304, cal[5].weightGiver(4, 3));

			DefaultEdge evEdge060305 = undirectedGraph.addEdge("EV0603", "EV0605");

			undirectedGraph.setEdgeWeight(evEdge060305, cal[5].weightGiver(5, 3));

			DefaultEdge evEdge060306 = undirectedGraph.addEdge("EV0603", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge060306, cal[5].weightGiver(6, 3));

			DefaultEdge evEdge060307 = undirectedGraph.addEdge("EV0603", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge060307, cal[5].weightGiver(7, 3));

			DefaultEdge evEdge060308 = undirectedGraph.addEdge("EV0603", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge060308, cal[5].weightGiver(8, 3));

			DefaultEdge evEdge060309 = undirectedGraph.addEdge("EV0603", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060309, cal[5].weightGiver(9, 3));

			DefaultEdge evEdge060310 = undirectedGraph.addEdge("EV0603", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060310, cal[5].weightGiver(10, 3));

			DefaultEdge evEdge060311 = undirectedGraph.addEdge("EV0603", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060311, cal[5].weightGiver(11, 3));

			DefaultEdge evEdge060312 = undirectedGraph.addEdge("EV0603", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060312, cal[5].weightGiver(12, 3));

 

			DefaultEdge evEdge060405 = undirectedGraph.addEdge("EV0604", "EV0605");

			undirectedGraph.setEdgeWeight(evEdge060405, cal[5].weightGiver(5, 4));

			DefaultEdge evEdge060406 = undirectedGraph.addEdge("EV0604", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge060406, cal[5].weightGiver(6, 4));

			DefaultEdge evEdge060407 = undirectedGraph.addEdge("EV0604", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge060407, cal[5].weightGiver(7, 4));

			DefaultEdge evEdge060408 = undirectedGraph.addEdge("EV0604", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge060408, cal[5].weightGiver(8, 4));

			DefaultEdge evEdge060409 = undirectedGraph.addEdge("EV0604", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060409, cal[5].weightGiver(9, 4));

			DefaultEdge evEdge060410 = undirectedGraph.addEdge("EV0604", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060410, cal[5].weightGiver(10, 4));

			DefaultEdge evEdge060411 = undirectedGraph.addEdge("EV0604", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060411, cal[5].weightGiver(11, 4));

			DefaultEdge evEdge060412 = undirectedGraph.addEdge("EV0604", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060412, cal[5].weightGiver(12, 4));

 

			DefaultEdge evEdge060506 = undirectedGraph.addEdge("EV0605", "EV0606");

			undirectedGraph.setEdgeWeight(evEdge060506, cal[5].weightGiver(6, 5));

			DefaultEdge evEdge060507 = undirectedGraph.addEdge("EV0605", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge060507, cal[5].weightGiver(7, 5));

			DefaultEdge evEdge060508 = undirectedGraph.addEdge("EV0605", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge060508, cal[5].weightGiver(8, 5));

			DefaultEdge evEdge060509 = undirectedGraph.addEdge("EV0605", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060509, cal[5].weightGiver(9, 5));

			DefaultEdge evEdge060510 = undirectedGraph.addEdge("EV0605", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060510, cal[5].weightGiver(10, 5));

			DefaultEdge evEdge060511 = undirectedGraph.addEdge("EV0605", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060511, cal[5].weightGiver(11, 5));

			DefaultEdge evEdge060512 = undirectedGraph.addEdge("EV0605", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060512, cal[5].weightGiver(12, 5));

			

			DefaultEdge evEdge060607 = undirectedGraph.addEdge("EV0606", "EV0607");

			undirectedGraph.setEdgeWeight(evEdge060607, cal[5].weightGiver(7, 6));

			DefaultEdge evEdge060608 = undirectedGraph.addEdge("EV0606", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge060608, cal[5].weightGiver(8, 6));

			DefaultEdge evEdge060609 = undirectedGraph.addEdge("EV0606", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060609, cal[5].weightGiver(9, 6));

			DefaultEdge evEdge060610 = undirectedGraph.addEdge("EV0606", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060610, cal[5].weightGiver(10, 6));

			DefaultEdge evEdge060611 = undirectedGraph.addEdge("EV0606", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060611, cal[5].weightGiver(11, 6));

			DefaultEdge evEdge060612 = undirectedGraph.addEdge("EV0606", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060612, cal[5].weightGiver(12, 6));

 

			DefaultEdge evEdge060708 = undirectedGraph.addEdge("EV0607", "EV0608");

			undirectedGraph.setEdgeWeight(evEdge060708, cal[5].weightGiver(8, 7));

			DefaultEdge evEdge060709 = undirectedGraph.addEdge("EV0607", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060709, cal[5].weightGiver(9, 7));

			DefaultEdge evEdge060710 = undirectedGraph.addEdge("EV0607", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060710, cal[5].weightGiver(10, 7));

			DefaultEdge evEdge060711 = undirectedGraph.addEdge("EV0607", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060711, cal[5].weightGiver(11, 7));

			DefaultEdge evEdge060712 = undirectedGraph.addEdge("EV0607", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060712, cal[5].weightGiver(12, 7));

 

			DefaultEdge evEdge060809 = undirectedGraph.addEdge("EV0608", "EV0609");

			undirectedGraph.setEdgeWeight(evEdge060809, cal[5].weightGiver(9, 8));

			DefaultEdge evEdge060810 = undirectedGraph.addEdge("EV0608", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060810, cal[5].weightGiver(10, 8));

			DefaultEdge evEdge060811 = undirectedGraph.addEdge("EV0608", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060811, cal[5].weightGiver(11, 8));

			DefaultEdge evEdge060812 = undirectedGraph.addEdge("EV0608", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060812, cal[5].weightGiver(12, 8));

			

			DefaultEdge evEdge060910 = undirectedGraph.addEdge("EV0609", "EV0610");

			undirectedGraph.setEdgeWeight(evEdge060910, cal[5].weightGiver(10, 9));

			DefaultEdge evEdge060911 = undirectedGraph.addEdge("EV0609", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge060911, cal[5].weightGiver(11, 9));

			DefaultEdge evEdge060912 = undirectedGraph.addEdge("EV0609", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge060912, cal[5].weightGiver(12, 9));

 

			DefaultEdge evEdge061011 = undirectedGraph.addEdge("EV0610", "EV0611");

			undirectedGraph.setEdgeWeight(evEdge061011, cal[5].weightGiver(11, 10));

			DefaultEdge evEdge061012 = undirectedGraph.addEdge("EV0610", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge061012, cal[5].weightGiver(12, 10));

 

			DefaultEdge evEdge061112 = undirectedGraph.addEdge("EV0611", "EV0612");

			undirectedGraph.setEdgeWeight(evEdge061112, cal[5].weightGiver(12, 11));

 

			//7호기

			DefaultEdge evEdge07B3B2 = undirectedGraph.addEdge("EV07B3", "EV07B2");

			undirectedGraph.setEdgeWeight(evEdge07B3B2, cal[6].weightGiver(-2, -3));

			DefaultEdge evEdge07B3B1 = undirectedGraph.addEdge("EV07B3", "EV07B1");

			undirectedGraph.setEdgeWeight(evEdge07B3B1, cal[6].weightGiver(-1, -3));

			DefaultEdge evEdge07B301 = undirectedGraph.addEdge("EV07B3", "EV0701");

			undirectedGraph.setEdgeWeight(evEdge07B301, cal[6].weightGiver(1, -3));

			DefaultEdge evEdge07B303 = undirectedGraph.addEdge("EV07B3", "EV0703");

			undirectedGraph.setEdgeWeight(evEdge07B303, cal[6].weightGiver(3, -3));

			DefaultEdge evEdge07B306 = undirectedGraph.addEdge("EV07B3", "EV0706");

			undirectedGraph.setEdgeWeight(evEdge07B306, cal[6].weightGiver(6, -3));

			DefaultEdge evEdge07B309 = undirectedGraph.addEdge("EV07B3", "EV0709");

			undirectedGraph.setEdgeWeight(evEdge07B309, cal[6].weightGiver(9, -3));

			DefaultEdge evEdge07B312 = undirectedGraph.addEdge("EV07B3", "EV0712");

			undirectedGraph.setEdgeWeight(evEdge07B312, cal[6].weightGiver(12, -3));

			

			DefaultEdge evEdge07B2B1 = undirectedGraph.addEdge("EV07B2", "EV07B1");

			undirectedGraph.setEdgeWeight(evEdge07B2B1, cal[6].weightGiver(-1, -2));

			DefaultEdge evEdge07B201 = undirectedGraph.addEdge("EV07B2", "EV0701");

			undirectedGraph.setEdgeWeight(evEdge07B201, cal[6].weightGiver(1, -2));

			DefaultEdge evEdge07B203 = undirectedGraph.addEdge("EV07B2", "EV0703");

			undirectedGraph.setEdgeWeight(evEdge07B203, cal[6].weightGiver(3, -2));

			DefaultEdge evEdge07B206 = undirectedGraph.addEdge("EV07B2", "EV0706");

			undirectedGraph.setEdgeWeight(evEdge07B206, cal[6].weightGiver(6, -2));

			DefaultEdge evEdge07B209 = undirectedGraph.addEdge("EV07B2", "EV0709");

			undirectedGraph.setEdgeWeight(evEdge07B209, cal[6].weightGiver(9, -2));

			DefaultEdge evEdge07B212 = undirectedGraph.addEdge("EV07B2", "EV0712");

			undirectedGraph.setEdgeWeight(evEdge07B212, cal[6].weightGiver(12, -2));

			

			DefaultEdge evEdge07B101 = undirectedGraph.addEdge("EV07B1", "EV0701");

			undirectedGraph.setEdgeWeight(evEdge07B101, cal[6].weightGiver(1, -1));

			DefaultEdge evEdge07B103 = undirectedGraph.addEdge("EV07B1", "EV0703");

			undirectedGraph.setEdgeWeight(evEdge07B103, cal[6].weightGiver(3, -1));

			DefaultEdge evEdge07B106 = undirectedGraph.addEdge("EV07B1", "EV0706");

			undirectedGraph.setEdgeWeight(evEdge07B106, cal[6].weightGiver(6, -1));

			DefaultEdge evEdge07B109 = undirectedGraph.addEdge("EV07B1", "EV0709");

			undirectedGraph.setEdgeWeight(evEdge07B109, cal[6].weightGiver(9, -1));

			DefaultEdge evEdge07B112 = undirectedGraph.addEdge("EV07B1", "EV0712");

			undirectedGraph.setEdgeWeight(evEdge07B112, cal[6].weightGiver(12, -1));

			

			DefaultEdge evEdge070103 = undirectedGraph.addEdge("EV0701", "EV0703");

			undirectedGraph.setEdgeWeight(evEdge070103, cal[6].weightGiver(3, 1));

			DefaultEdge evEdge070106 = undirectedGraph.addEdge("EV0701", "EV0706");

			undirectedGraph.setEdgeWeight(evEdge070106, cal[6].weightGiver(6, 1));

			DefaultEdge evEdge070109 = undirectedGraph.addEdge("EV0701", "EV0709");

			undirectedGraph.setEdgeWeight(evEdge070109, cal[6].weightGiver(9, 1));

			DefaultEdge evEdge070112 = undirectedGraph.addEdge("EV0701", "EV0712");

			undirectedGraph.setEdgeWeight(evEdge070112, cal[6].weightGiver(12, 1));

			

			DefaultEdge evEdge070306 = undirectedGraph.addEdge("EV0703", "EV0706");

			undirectedGraph.setEdgeWeight(evEdge070306, cal[6].weightGiver(6, 3));

			DefaultEdge evEdge070309 = undirectedGraph.addEdge("EV0703", "EV0709");

			undirectedGraph.setEdgeWeight(evEdge070309, cal[6].weightGiver(9, 3));

			DefaultEdge evEdge070312 = undirectedGraph.addEdge("EV0703", "EV0712");

			undirectedGraph.setEdgeWeight(evEdge070312, cal[6].weightGiver(12, 3));

		

			DefaultEdge evEdge070609 = undirectedGraph.addEdge("EV0706", "EV0709");

			undirectedGraph.setEdgeWeight(evEdge070609, cal[6].weightGiver(9, 6));

			DefaultEdge evEdge070612 = undirectedGraph.addEdge("EV0706", "EV0712");

			undirectedGraph.setEdgeWeight(evEdge070612, cal[6].weightGiver(12, 6));

			

			DefaultEdge evEdge070912 = undirectedGraph.addEdge("EV0709", "EV0712");

			undirectedGraph.setEdgeWeight(evEdge070912, cal[6].weightGiver(12, 9));

			

			//8호기

			DefaultEdge evEdge080105 = undirectedGraph.addEdge("EV0801", "EV0805");

			undirectedGraph.setEdgeWeight(evEdge080105, cal[7].weightGiver(5, 1));

			DefaultEdge evEdge080108 = undirectedGraph.addEdge("EV0801", "EV0808");

			undirectedGraph.setEdgeWeight(evEdge080108, cal[7].weightGiver(8, 1));

			DefaultEdge evEdge080111 = undirectedGraph.addEdge("EV0801", "EV0811");

			undirectedGraph.setEdgeWeight(evEdge080111, cal[7].weightGiver(11, 1));

			

			DefaultEdge evEdge080508 = undirectedGraph.addEdge("EV0805", "EV0808");

			undirectedGraph.setEdgeWeight(evEdge080508, cal[7].weightGiver(8, 5));

			DefaultEdge evEdge080511 = undirectedGraph.addEdge("EV0805", "EV0811");

			undirectedGraph.setEdgeWeight(evEdge080511, cal[7].weightGiver(11, 5));

			

			DefaultEdge evEdge080811 = undirectedGraph.addEdge("EV0808", "EV0811");

			undirectedGraph.setEdgeWeight(evEdge080811, cal[7].weightGiver(11, 8));

			

			//9호기

			DefaultEdge evEdge090104 = undirectedGraph.addEdge("EV0901", "EV0904");

			undirectedGraph.setEdgeWeight(evEdge090104, cal[8].weightGiver(4, 1));

			DefaultEdge evEdge090107 = undirectedGraph.addEdge("EV0901", "EV0907");

			undirectedGraph.setEdgeWeight(evEdge090107, cal[8].weightGiver(7, 1));

			DefaultEdge evEdge090110 = undirectedGraph.addEdge("EV0901", "EV0910");

			undirectedGraph.setEdgeWeight(evEdge090110, cal[8].weightGiver(10, 1));

			

			DefaultEdge evEdge090407 = undirectedGraph.addEdge("EV0904", "EV0907");

			undirectedGraph.setEdgeWeight(evEdge090407, cal[8].weightGiver(7, 4));

			DefaultEdge evEdge090410 = undirectedGraph.addEdge("EV0904", "EV0910");

			undirectedGraph.setEdgeWeight(evEdge090410, cal[8].weightGiver(10, 4));

			

			DefaultEdge evEdge090710 = undirectedGraph.addEdge("EV0907", "EV0910");

			undirectedGraph.setEdgeWeight(evEdge090710, cal[8].weightGiver(10, 7));

			

			//10호기

			DefaultEdge evEdge10B3B2 = undirectedGraph.addEdge("EV10B3", "EV10B2");

			undirectedGraph.setEdgeWeight(evEdge10B3B2, cal[9].weightGiver(-2, -3));

			DefaultEdge evEdge10B3B1 = undirectedGraph.addEdge("EV10B3", "EV10B1");

			undirectedGraph.setEdgeWeight(evEdge10B3B1, cal[9].weightGiver(-1, -3));

			DefaultEdge evEdge10B301 = undirectedGraph.addEdge("EV10B3", "EV1001");

			undirectedGraph.setEdgeWeight(evEdge10B301, cal[9].weightGiver(1, -3));

			DefaultEdge evEdge10B302 = undirectedGraph.addEdge("EV10B3", "EV1002");

			undirectedGraph.setEdgeWeight(evEdge10B302, cal[9].weightGiver(2, -3));

			DefaultEdge evEdge10B303 = undirectedGraph.addEdge("EV10B3", "EV1003");

			undirectedGraph.setEdgeWeight(evEdge10B303, cal[9].weightGiver(3, -3));

			DefaultEdge evEdge10B304 = undirectedGraph.addEdge("EV10B3", "EV1004");

			undirectedGraph.setEdgeWeight(evEdge10B304, cal[9].weightGiver(4, -3));

			DefaultEdge evEdge10B305 = undirectedGraph.addEdge("EV10B3", "EV1005");

			undirectedGraph.setEdgeWeight(evEdge10B305, cal[9].weightGiver(5, -3));

			DefaultEdge evEdge10B306 = undirectedGraph.addEdge("EV10B3", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge10B306, cal[9].weightGiver(6, -3));

			DefaultEdge evEdge10B307 = undirectedGraph.addEdge("EV10B3", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge10B307, cal[9].weightGiver(7, -3));

			DefaultEdge evEdge10B308 = undirectedGraph.addEdge("EV10B3", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge10B308, cal[9].weightGiver(8, -3));

			DefaultEdge evEdge10B309 = undirectedGraph.addEdge("EV10B3", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge10B309, cal[9].weightGiver(9, -3));

			DefaultEdge evEdge10B310 = undirectedGraph.addEdge("EV10B3", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge10B310, cal[9].weightGiver(10, -3));

			DefaultEdge evEdge10B311 = undirectedGraph.addEdge("EV10B3", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge10B311, cal[9].weightGiver(11, -3));

			DefaultEdge evEdge10B312 = undirectedGraph.addEdge("EV10B3", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge10B312, cal[9].weightGiver(12, -3));

			

			DefaultEdge evEdge10B2B1 = undirectedGraph.addEdge("EV10B2", "EV10B1");

			undirectedGraph.setEdgeWeight(evEdge10B2B1, cal[9].weightGiver(-1, -2));

			DefaultEdge evEdge10B201 = undirectedGraph.addEdge("EV10B2", "EV1001");

			undirectedGraph.setEdgeWeight(evEdge10B201, cal[9].weightGiver(1, -2));

			DefaultEdge evEdge10B202 = undirectedGraph.addEdge("EV10B2", "EV1002");

			undirectedGraph.setEdgeWeight(evEdge10B202, cal[9].weightGiver(2, -2));

			DefaultEdge evEdge10B203 = undirectedGraph.addEdge("EV10B2", "EV1003");

			undirectedGraph.setEdgeWeight(evEdge10B203, cal[9].weightGiver(3, -2));

			DefaultEdge evEdge10B204 = undirectedGraph.addEdge("EV10B2", "EV1004");

			undirectedGraph.setEdgeWeight(evEdge10B204, cal[9].weightGiver(4, -2));

			DefaultEdge evEdge10B205 = undirectedGraph.addEdge("EV10B2", "EV1005");

			undirectedGraph.setEdgeWeight(evEdge10B205, cal[9].weightGiver(5, -2));

			DefaultEdge evEdge10B206 = undirectedGraph.addEdge("EV10B2", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge10B206, cal[9].weightGiver(6, -2));

			DefaultEdge evEdge10B207 = undirectedGraph.addEdge("EV10B2", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge10B207, cal[9].weightGiver(7, -2));

			DefaultEdge evEdge10B208 = undirectedGraph.addEdge("EV10B2", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge10B208, cal[9].weightGiver(8, -2));

			DefaultEdge evEdge10B209 = undirectedGraph.addEdge("EV10B2", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge10B209, cal[9].weightGiver(9, -2));

			DefaultEdge evEdge10B210 = undirectedGraph.addEdge("EV10B2", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge10B210, cal[9].weightGiver(10, -2));

			DefaultEdge evEdge10B211 = undirectedGraph.addEdge("EV10B2", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge10B211, cal[9].weightGiver(11, -2));

			DefaultEdge evEdge10B212 = undirectedGraph.addEdge("EV10B2", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge10B212, cal[9].weightGiver(12, -2));

			

			DefaultEdge evEdge10B101 = undirectedGraph.addEdge("EV10B1", "EV1001");

			undirectedGraph.setEdgeWeight(evEdge10B101, cal[9].weightGiver(1, -1));

			DefaultEdge evEdge10B102 = undirectedGraph.addEdge("EV10B1", "EV1002");

			undirectedGraph.setEdgeWeight(evEdge10B102, cal[9].weightGiver(2, -1));

			DefaultEdge evEdge10B103 = undirectedGraph.addEdge("EV10B1", "EV1003");

			undirectedGraph.setEdgeWeight(evEdge10B103, cal[9].weightGiver(3, -1));

			DefaultEdge evEdge10B104 = undirectedGraph.addEdge("EV10B1", "EV1004");

			undirectedGraph.setEdgeWeight(evEdge10B104, cal[9].weightGiver(4, -1));

			DefaultEdge evEdge10B105 = undirectedGraph.addEdge("EV10B1", "EV1005");

			undirectedGraph.setEdgeWeight(evEdge10B105, cal[9].weightGiver(5, -1));

			DefaultEdge evEdge10B106 = undirectedGraph.addEdge("EV10B1", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge10B106, cal[9].weightGiver(6, -1));

			DefaultEdge evEdge10B107 = undirectedGraph.addEdge("EV10B1", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge10B107, cal[9].weightGiver(7, -1));

			DefaultEdge evEdge10B108 = undirectedGraph.addEdge("EV10B1", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge10B108, cal[9].weightGiver(8, -1));

			DefaultEdge evEdge10B109 = undirectedGraph.addEdge("EV10B1", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge10B109, cal[9].weightGiver(9, -1));

			DefaultEdge evEdge10B110 = undirectedGraph.addEdge("EV10B1", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge10B110, cal[9].weightGiver(10, -1));

			DefaultEdge evEdge10B111 = undirectedGraph.addEdge("EV10B1", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge10B111, cal[9].weightGiver(11, -1));

			DefaultEdge evEdge10B112 = undirectedGraph.addEdge("EV10B1", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge10B112, cal[9].weightGiver(12, -1));

			

			DefaultEdge evEdge100102 = undirectedGraph.addEdge("EV1001", "EV1002");

			undirectedGraph.setEdgeWeight(evEdge100102, cal[9].weightGiver(2, 1));

			DefaultEdge evEdge100103 = undirectedGraph.addEdge("EV1001", "EV1003");

			undirectedGraph.setEdgeWeight(evEdge100103, cal[9].weightGiver(3, 1));

			DefaultEdge evEdge100104 = undirectedGraph.addEdge("EV1001", "EV1004");

			undirectedGraph.setEdgeWeight(evEdge100104, cal[9].weightGiver(4, 1));

			DefaultEdge evEdge100105 = undirectedGraph.addEdge("EV1001", "EV1005");

			undirectedGraph.setEdgeWeight(evEdge100105, cal[9].weightGiver(5, 1));

			DefaultEdge evEdge100106 = undirectedGraph.addEdge("EV1001", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge100106, cal[9].weightGiver(6, 1));

			DefaultEdge evEdge100107 = undirectedGraph.addEdge("EV1001", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge100107, cal[9].weightGiver(7, 1));

			DefaultEdge evEdge100108 = undirectedGraph.addEdge("EV1001", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge100108, cal[9].weightGiver(8, 1));

			DefaultEdge evEdge100109 = undirectedGraph.addEdge("EV1001", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100109, cal[9].weightGiver(9, 1));

			DefaultEdge evEdge100110 = undirectedGraph.addEdge("EV1001", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100110, cal[9].weightGiver(10, 1));

			DefaultEdge evEdge100111 = undirectedGraph.addEdge("EV1001", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100111, cal[9].weightGiver(11, 1));

			DefaultEdge evEdge100112 = undirectedGraph.addEdge("EV1001", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100112, cal[9].weightGiver(12, 1));

			

			DefaultEdge evEdge100203 = undirectedGraph.addEdge("EV1002", "EV1003");

			undirectedGraph.setEdgeWeight(evEdge100203, cal[9].weightGiver(3, 2));

			DefaultEdge evEdge100204 = undirectedGraph.addEdge("EV1002", "EV1004");

			undirectedGraph.setEdgeWeight(evEdge100204, cal[9].weightGiver(4, 2));

			DefaultEdge evEdge100205 = undirectedGraph.addEdge("EV1002", "EV1005");

			undirectedGraph.setEdgeWeight(evEdge100205, cal[9].weightGiver(5, 2));

			DefaultEdge evEdge100206 = undirectedGraph.addEdge("EV1002", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge100206, cal[9].weightGiver(6, 2));

			DefaultEdge evEdge100207 = undirectedGraph.addEdge("EV1002", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge100207, cal[9].weightGiver(7, 2));

			DefaultEdge evEdge100208 = undirectedGraph.addEdge("EV1002", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge100208, cal[9].weightGiver(8, 2));

			DefaultEdge evEdge100209 = undirectedGraph.addEdge("EV1002", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100209, cal[9].weightGiver(9, 2));

			DefaultEdge evEdge100210 = undirectedGraph.addEdge("EV1002", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100210, cal[9].weightGiver(10, 2));

			DefaultEdge evEdge100211 = undirectedGraph.addEdge("EV1002", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100211, cal[9].weightGiver(11, 2));

			DefaultEdge evEdge100212 = undirectedGraph.addEdge("EV1002", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100212, cal[9].weightGiver(12, 2));

			

			DefaultEdge evEdge100304 = undirectedGraph.addEdge("EV1003", "EV1004");

			undirectedGraph.setEdgeWeight(evEdge100304, cal[9].weightGiver(4, 3));

			DefaultEdge evEdge100305 = undirectedGraph.addEdge("EV1003", "EV1005");

			undirectedGraph.setEdgeWeight(evEdge100305, cal[9].weightGiver(5, 3));

			DefaultEdge evEdge100306 = undirectedGraph.addEdge("EV1003", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge100306, cal[9].weightGiver(6, 3));

			DefaultEdge evEdge100307 = undirectedGraph.addEdge("EV1003", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge100307, cal[9].weightGiver(7, 3));

			DefaultEdge evEdge100308 = undirectedGraph.addEdge("EV1003", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge100308, cal[9].weightGiver(8, 3));

			DefaultEdge evEdge100309 = undirectedGraph.addEdge("EV1003", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100309, cal[9].weightGiver(9, 3));

			DefaultEdge evEdge100310 = undirectedGraph.addEdge("EV1003", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100310, cal[9].weightGiver(10, 3));

			DefaultEdge evEdge100311 = undirectedGraph.addEdge("EV1003", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100311, cal[9].weightGiver(11, 3));

			DefaultEdge evEdge100312 = undirectedGraph.addEdge("EV1003", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100312, cal[9].weightGiver(12, 3));

			

			DefaultEdge evEdge100405 = undirectedGraph.addEdge("EV1004", "EV1005");

			undirectedGraph.setEdgeWeight(evEdge100405, cal[9].weightGiver(5, 4));

			DefaultEdge evEdge100406 = undirectedGraph.addEdge("EV1004", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge100406, cal[9].weightGiver(6, 4));

			DefaultEdge evEdge100407 = undirectedGraph.addEdge("EV1004", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge100407, cal[9].weightGiver(7, 4));

			DefaultEdge evEdge100408 = undirectedGraph.addEdge("EV1004", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge100408, cal[9].weightGiver(8, 4));

			DefaultEdge evEdge100409 = undirectedGraph.addEdge("EV1004", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100409, cal[9].weightGiver(9, 4));

			DefaultEdge evEdge100410 = undirectedGraph.addEdge("EV1004", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100410, cal[9].weightGiver(10, 4));

			DefaultEdge evEdge100411 = undirectedGraph.addEdge("EV1004", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100411, cal[9].weightGiver(11, 4));

			DefaultEdge evEdge100412 = undirectedGraph.addEdge("EV1004", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100412, cal[9].weightGiver(12, 4));

		

			DefaultEdge evEdge100506 = undirectedGraph.addEdge("EV1005", "EV1006");

			undirectedGraph.setEdgeWeight(evEdge100506, cal[9].weightGiver(6, 5));

			DefaultEdge evEdge100507 = undirectedGraph.addEdge("EV1005", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge100507, cal[9].weightGiver(7, 5));

			DefaultEdge evEdge100508 = undirectedGraph.addEdge("EV1005", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge100508, cal[9].weightGiver(8, 5));

			DefaultEdge evEdge100509 = undirectedGraph.addEdge("EV1005", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100509, cal[9].weightGiver(9, 5));

			DefaultEdge evEdge100510 = undirectedGraph.addEdge("EV1005", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100510, cal[9].weightGiver(10, 5));

			DefaultEdge evEdge100511 = undirectedGraph.addEdge("EV1005", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100511, cal[9].weightGiver(11, 5));

			DefaultEdge evEdge100512 = undirectedGraph.addEdge("EV1005", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100512, cal[9].weightGiver(12, 5));

			

			DefaultEdge evEdge100607 = undirectedGraph.addEdge("EV1006", "EV1007");

			undirectedGraph.setEdgeWeight(evEdge100607, cal[9].weightGiver(7, 6));

			DefaultEdge evEdge100608 = undirectedGraph.addEdge("EV1006", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge100608, cal[9].weightGiver(8, 6));

			DefaultEdge evEdge100609 = undirectedGraph.addEdge("EV1006", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100609, cal[9].weightGiver(9, 6));

			DefaultEdge evEdge100610 = undirectedGraph.addEdge("EV1006", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100610, cal[9].weightGiver(10, 6));

			DefaultEdge evEdge100611 = undirectedGraph.addEdge("EV1006", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100611, cal[9].weightGiver(11, 6));

			DefaultEdge evEdge100612 = undirectedGraph.addEdge("EV1006", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100612, cal[9].weightGiver(12, 6));

			

			DefaultEdge evEdge100708 = undirectedGraph.addEdge("EV1007", "EV1008");

			undirectedGraph.setEdgeWeight(evEdge100708, cal[9].weightGiver(8, 7));

			DefaultEdge evEdge100709 = undirectedGraph.addEdge("EV1007", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100709, cal[9].weightGiver(9, 7));

			DefaultEdge evEdge100710 = undirectedGraph.addEdge("EV1007", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100710, cal[9].weightGiver(10, 7));

			DefaultEdge evEdge100711 = undirectedGraph.addEdge("EV1007", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100711, cal[9].weightGiver(11, 7));

			DefaultEdge evEdge100712 = undirectedGraph.addEdge("EV1007", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100712, cal[9].weightGiver(12, 7));

			

			DefaultEdge evEdge100809 = undirectedGraph.addEdge("EV1008", "EV1009");

			undirectedGraph.setEdgeWeight(evEdge100809, cal[9].weightGiver(9, 8));

			DefaultEdge evEdge100810 = undirectedGraph.addEdge("EV1008", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100810, cal[9].weightGiver(10, 8));

			DefaultEdge evEdge100811 = undirectedGraph.addEdge("EV1008", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100811, cal[9].weightGiver(11, 8));

			DefaultEdge evEdge100812 = undirectedGraph.addEdge("EV1008", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100812, cal[9].weightGiver(12, 8));

			

			DefaultEdge evEdge100910 = undirectedGraph.addEdge("EV1009", "EV1010");

			undirectedGraph.setEdgeWeight(evEdge100910, cal[9].weightGiver(10, 9));

			DefaultEdge evEdge100911 = undirectedGraph.addEdge("EV1009", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge100911, cal[9].weightGiver(11, 9));

			DefaultEdge evEdge100912 = undirectedGraph.addEdge("EV1009", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge100912, cal[9].weightGiver(12, 9));

			

			DefaultEdge evEdge101011 = undirectedGraph.addEdge("EV1010", "EV1011");

			undirectedGraph.setEdgeWeight(evEdge101011, cal[9].weightGiver(11, 10));

			DefaultEdge evEdge101012 = undirectedGraph.addEdge("EV1010", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge101012, cal[9].weightGiver(12, 10));

			

			DefaultEdge evEdge101112 = undirectedGraph.addEdge("EV1011", "EV1012");

			undirectedGraph.setEdgeWeight(evEdge101112, cal[9].weightGiver(12, 11));

			

			//11호기

			DefaultEdge evEdge11B3B2 = undirectedGraph.addEdge("EV11B3", "EV11B2");

			undirectedGraph.setEdgeWeight(evEdge11B3B2, cal[10].weightGiver(-2, -3));

			DefaultEdge evEdge11B3B1 = undirectedGraph.addEdge("EV11B3", "EV11B1");

			undirectedGraph.setEdgeWeight(evEdge11B3B1, cal[10].weightGiver(-1, -3));			

			DefaultEdge evEdge11B301 = undirectedGraph.addEdge("EV11B3", "EV1101");

			undirectedGraph.setEdgeWeight(evEdge11B301, cal[10].weightGiver(1, -3));

			DefaultEdge evEdge11B303 = undirectedGraph.addEdge("EV11B3", "EV1103");

			undirectedGraph.setEdgeWeight(evEdge11B303, cal[10].weightGiver(3, -3));

			DefaultEdge evEdge11B305 = undirectedGraph.addEdge("EV11B3", "EV1105");

			undirectedGraph.setEdgeWeight(evEdge11B305, cal[10].weightGiver(5, -3));

			DefaultEdge evEdge11B307 = undirectedGraph.addEdge("EV11B3", "EV1107");

			undirectedGraph.setEdgeWeight(evEdge11B307, cal[10].weightGiver(7, -3));

			DefaultEdge evEdge11B309 = undirectedGraph.addEdge("EV11B3", "EV1109");

			undirectedGraph.setEdgeWeight(evEdge11B309, cal[10].weightGiver(9, -3));

			

			DefaultEdge evEdge11B2B1 = undirectedGraph.addEdge("EV11B2", "EV11B1");

			undirectedGraph.setEdgeWeight(evEdge11B2B1, cal[10].weightGiver(-1, -2));

			DefaultEdge evEdge11B201 = undirectedGraph.addEdge("EV11B2", "EV1101");

			undirectedGraph.setEdgeWeight(evEdge11B201, cal[10].weightGiver(1, -2));

			DefaultEdge evEdge11B203 = undirectedGraph.addEdge("EV11B2", "EV1103");

			undirectedGraph.setEdgeWeight(evEdge11B203, cal[10].weightGiver(3, -2));

			DefaultEdge evEdge11B205 = undirectedGraph.addEdge("EV11B2", "EV1105");

			undirectedGraph.setEdgeWeight(evEdge11B205, cal[10].weightGiver(5, -2));

			DefaultEdge evEdge11B207 = undirectedGraph.addEdge("EV11B2", "EV1107");

			undirectedGraph.setEdgeWeight(evEdge11B207, cal[10].weightGiver(7, -2));

			DefaultEdge evEdge11B209 = undirectedGraph.addEdge("EV11B2", "EV1109");

			undirectedGraph.setEdgeWeight(evEdge11B209, cal[10].weightGiver(9, -2));

			

			DefaultEdge evEdge11B101 = undirectedGraph.addEdge("EV11B1", "EV1101");

			undirectedGraph.setEdgeWeight(evEdge11B101, cal[10].weightGiver(1, -1));

			DefaultEdge evEdge11B103 = undirectedGraph.addEdge("EV11B1", "EV1103");

			undirectedGraph.setEdgeWeight(evEdge11B103, cal[10].weightGiver(3, -1));

			DefaultEdge evEdge11B105 = undirectedGraph.addEdge("EV11B1", "EV1105");

			undirectedGraph.setEdgeWeight(evEdge11B105, cal[10].weightGiver(5, -1));

			DefaultEdge evEdge11B107 = undirectedGraph.addEdge("EV11B1", "EV1107");

			undirectedGraph.setEdgeWeight(evEdge11B107, cal[10].weightGiver(7, -1));

			DefaultEdge evEdge11B109 = undirectedGraph.addEdge("EV11B1", "EV1109");

			undirectedGraph.setEdgeWeight(evEdge11B109, cal[10].weightGiver(9, -1));

 

			DefaultEdge evEdge110103 = undirectedGraph.addEdge("EV1101", "EV1103");

			undirectedGraph.setEdgeWeight(evEdge110103, cal[10].weightGiver(3, 1));

			DefaultEdge evEdge110105 = undirectedGraph.addEdge("EV1101", "EV1105");

			undirectedGraph.setEdgeWeight(evEdge110105, cal[10].weightGiver(5, 1));

			DefaultEdge evEdge110107 = undirectedGraph.addEdge("EV1101", "EV1107");

			undirectedGraph.setEdgeWeight(evEdge110107, cal[10].weightGiver(7, 1));

			DefaultEdge evEdge110109 = undirectedGraph.addEdge("EV1101", "EV1109");

			undirectedGraph.setEdgeWeight(evEdge110109, cal[10].weightGiver(9, 1));

			

			DefaultEdge evEdge110305 = undirectedGraph.addEdge("EV1103", "EV1105");

			undirectedGraph.setEdgeWeight(evEdge110305, cal[10].weightGiver(5, 3));

			DefaultEdge evEdge110307 = undirectedGraph.addEdge("EV1103", "EV1107");

			undirectedGraph.setEdgeWeight(evEdge110307, cal[10].weightGiver(7, 3));

			DefaultEdge evEdge110309 = undirectedGraph.addEdge("EV1103", "EV1109");

			undirectedGraph.setEdgeWeight(evEdge110309, cal[10].weightGiver(9, 3));

			

			DefaultEdge evEdge110507 = undirectedGraph.addEdge("EV1105", "EV1107");

			undirectedGraph.setEdgeWeight(evEdge110507, cal[10].weightGiver(7, 5));

			DefaultEdge evEdge110509 = undirectedGraph.addEdge("EV1105", "EV1109");

			undirectedGraph.setEdgeWeight(evEdge110509, cal[10].weightGiver(9, 5));

			

			DefaultEdge evEdge110709 = undirectedGraph.addEdge("EV1107", "EV1109");

			undirectedGraph.setEdgeWeight(evEdge110709, cal[10].weightGiver(9, 7));

			

			//12호기

			DefaultEdge evEdge12B3B2 = undirectedGraph.addEdge("EV12B3", "EV12B2");

			undirectedGraph.setEdgeWeight(evEdge12B3B2, cal[11].weightGiver(-2, -3));

			DefaultEdge evEdge12B3B1 = undirectedGraph.addEdge("EV12B3", "EV12B1");

			undirectedGraph.setEdgeWeight(evEdge12B3B1, cal[11].weightGiver(-1, -3));			

			DefaultEdge evEdge12B301 = undirectedGraph.addEdge("EV12B3", "EV1201");

			undirectedGraph.setEdgeWeight(evEdge12B301, cal[11].weightGiver(1, -3));

			DefaultEdge evEdge12B304 = undirectedGraph.addEdge("EV12B3", "EV1204");

			undirectedGraph.setEdgeWeight(evEdge12B304, cal[11].weightGiver(4, -3));

			DefaultEdge evEdge12B306 = undirectedGraph.addEdge("EV12B3", "EV1206");

			undirectedGraph.setEdgeWeight(evEdge12B306, cal[11].weightGiver(6, -3));

			DefaultEdge evEdge12B308 = undirectedGraph.addEdge("EV12B3", "EV1208");

			undirectedGraph.setEdgeWeight(evEdge12B308, cal[11].weightGiver(8, -3));

			

			DefaultEdge evEdge12B2B1 = undirectedGraph.addEdge("EV12B2", "EV12B1");

			undirectedGraph.setEdgeWeight(evEdge12B2B1, cal[11].weightGiver(-1, -2));

			DefaultEdge evEdge12B201 = undirectedGraph.addEdge("EV12B2", "EV1201");

			undirectedGraph.setEdgeWeight(evEdge12B201, cal[11].weightGiver(1, -2));

			DefaultEdge evEdge12B204 = undirectedGraph.addEdge("EV12B2", "EV1204");

			undirectedGraph.setEdgeWeight(evEdge12B204, cal[11].weightGiver(4, -2));

			DefaultEdge evEdge12B206 = undirectedGraph.addEdge("EV12B2", "EV1206");

			undirectedGraph.setEdgeWeight(evEdge12B206, cal[11].weightGiver(6, -2));

			DefaultEdge evEdge12B208 = undirectedGraph.addEdge("EV12B2", "EV1208");

			undirectedGraph.setEdgeWeight(evEdge12B208, cal[11].weightGiver(8, -2));

			

			DefaultEdge evEdge12B101 = undirectedGraph.addEdge("EV12B1", "EV1201");

			undirectedGraph.setEdgeWeight(evEdge12B101, cal[11].weightGiver(1, -1));

			DefaultEdge evEdge12B104 = undirectedGraph.addEdge("EV12B1", "EV1204");

			undirectedGraph.setEdgeWeight(evEdge12B104, cal[11].weightGiver(4, -1));

			DefaultEdge evEdge12B106 = undirectedGraph.addEdge("EV12B1", "EV1206");

			undirectedGraph.setEdgeWeight(evEdge12B106, cal[11].weightGiver(6, -1));

			DefaultEdge evEdge12B108 = undirectedGraph.addEdge("EV12B1", "EV1208");

			undirectedGraph.setEdgeWeight(evEdge12B108, cal[11].weightGiver(8, -1));

 

			DefaultEdge evEdge120104 = undirectedGraph.addEdge("EV1201", "EV1204");

			undirectedGraph.setEdgeWeight(evEdge120104, cal[11].weightGiver(4, 1));

			DefaultEdge evEdge120106 = undirectedGraph.addEdge("EV1201", "EV1206");

			undirectedGraph.setEdgeWeight(evEdge120106, cal[11].weightGiver(6, 1));

			DefaultEdge evEdge120108 = undirectedGraph.addEdge("EV1201", "EV1208");

			undirectedGraph.setEdgeWeight(evEdge120108, cal[11].weightGiver(8, 1));

			

			DefaultEdge evEdge120406 = undirectedGraph.addEdge("EV1204", "EV1206");

			undirectedGraph.setEdgeWeight(evEdge120406, cal[11].weightGiver(6, 4));

			DefaultEdge evEdge120408 = undirectedGraph.addEdge("EV1204", "EV1208");
			undirectedGraph.setEdgeWeight(evEdge120408, cal[11].weightGiver(8, 4));

			

			DefaultEdge evEdge120608 = undirectedGraph.addEdge("EV1206", "EV1208");
			undirectedGraph.setEdgeWeight(evEdge120608, cal[11].weightGiver(8, 6));

		}
	}
	
	
	public void stSetter(String busy) {
		int stairWeight;
		if(busy == "계단 이용 불가") {
			stairWeight = -1;
		}
		else if (busy == "여유로움" ) {
			stairWeight = 150;
		}
		else if (busy == "조금 바쁨") {
			stairWeight = 80;
		}
		else {
			stairWeight = 30;
		} //바쁨 정도에 따른 계단 이용
		
			//ST01
			DefaultEdge stEdge01B6B5 = undirectedGraph.addEdge("ST01B6", "ST01B5");
			undirectedGraph.setEdgeWeight(stEdge01B6B5, stairWeight);
			DefaultEdge stEdge01B5B4 = undirectedGraph.addEdge("ST01B5", "ST01B4");
			undirectedGraph.setEdgeWeight(stEdge01B5B4, stairWeight);
			
			//ST02
			DefaultEdge stEdge02B6B5 = undirectedGraph.addEdge("ST02B6", "ST02B5");
			undirectedGraph.setEdgeWeight(stEdge02B6B5, stairWeight);
			DefaultEdge stEdge02B5B4 = undirectedGraph.addEdge("ST02B5", "ST02B4");
			undirectedGraph.setEdgeWeight(stEdge02B5B4, stairWeight);
			
			//ST03			
			DefaultEdge stEdge03B5B4 = undirectedGraph.addEdge("ST03B5", "ST03B4");
			undirectedGraph.setEdgeWeight(stEdge03B5B4, stairWeight);
			DefaultEdge stEdge03B4B3 = undirectedGraph.addEdge("ST03B4", "ST03B3");
			undirectedGraph.setEdgeWeight(stEdge03B4B3, stairWeight);
			DefaultEdge stEdge03B3B2 = undirectedGraph.addEdge("ST03B3", "ST03B2");
			undirectedGraph.setEdgeWeight(stEdge03B3B2, stairWeight);
			DefaultEdge stEdge03B2B1 = undirectedGraph.addEdge("ST03B2", "ST03B1");
			undirectedGraph.setEdgeWeight(stEdge03B2B1, stairWeight);
			DefaultEdge stEdge03B101 = undirectedGraph.addEdge("ST03B1", "ST0301");
			undirectedGraph.setEdgeWeight(stEdge03B101, stairWeight);
			DefaultEdge stEdge030102 = undirectedGraph.addEdge("ST0301", "ST0302");
			undirectedGraph.setEdgeWeight(stEdge030102, stairWeight);
			DefaultEdge stEdge030203 = undirectedGraph.addEdge("ST0302", "ST0303");
			undirectedGraph.setEdgeWeight(stEdge030203, stairWeight);
			DefaultEdge stEdge030304 = undirectedGraph.addEdge("ST0303", "ST0304");
			undirectedGraph.setEdgeWeight(stEdge030304, stairWeight);
			DefaultEdge stEdge030405 = undirectedGraph.addEdge("ST0304", "ST0305");
			undirectedGraph.setEdgeWeight(stEdge030405, stairWeight);
			DefaultEdge stEdge030506 = undirectedGraph.addEdge("ST0305", "ST0306");
			undirectedGraph.setEdgeWeight(stEdge030506, stairWeight);
			DefaultEdge stEdge030607 = undirectedGraph.addEdge("ST0306", "ST0307");
			undirectedGraph.setEdgeWeight(stEdge030607, stairWeight);
			DefaultEdge stEdge030708 = undirectedGraph.addEdge("ST0307", "ST0308");
			undirectedGraph.setEdgeWeight(stEdge030708, stairWeight);
			DefaultEdge stEdge030809 = undirectedGraph.addEdge("ST0308", "ST0309");
			undirectedGraph.setEdgeWeight(stEdge030809, stairWeight);
			DefaultEdge stEdge030910 = undirectedGraph.addEdge("ST0309", "ST0310");
			undirectedGraph.setEdgeWeight(stEdge030910, stairWeight);
			
			//ST04
			DefaultEdge stEdge04B4B3 = undirectedGraph.addEdge("ST04B4", "ST04B3");
			undirectedGraph.setEdgeWeight(stEdge03B4B3, stairWeight);
			DefaultEdge stEdge04B3B2 = undirectedGraph.addEdge("ST04B3", "ST04B2");
			undirectedGraph.setEdgeWeight(stEdge04B3B2, stairWeight);
			DefaultEdge stEdge04B2B1 = undirectedGraph.addEdge("ST04B2", "ST04B1");
			undirectedGraph.setEdgeWeight(stEdge04B2B1, stairWeight);
			DefaultEdge stEdge04B101 = undirectedGraph.addEdge("ST04B1", "ST0401");
			undirectedGraph.setEdgeWeight(stEdge04B101, stairWeight);
			
			//ST05
			DefaultEdge stEdge05B3B2 = undirectedGraph.addEdge("ST05B3", "ST05B2");
			undirectedGraph.setEdgeWeight(stEdge05B3B2, stairWeight);
			DefaultEdge stEdge05B2B1 = undirectedGraph.addEdge("ST05B2", "ST05B1");
			undirectedGraph.setEdgeWeight(stEdge05B2B1, stairWeight);
			DefaultEdge stEdge05B101 = undirectedGraph.addEdge("ST05B1", "ST0501");
			undirectedGraph.setEdgeWeight(stEdge05B101, stairWeight);
			DefaultEdge stEdge050102 = undirectedGraph.addEdge("ST0501", "ST0502");
			undirectedGraph.setEdgeWeight(stEdge050102, stairWeight);
			DefaultEdge stEdge050203 = undirectedGraph.addEdge("ST0502", "ST0503");
			undirectedGraph.setEdgeWeight(stEdge050203, stairWeight);
			DefaultEdge stEdge050304 = undirectedGraph.addEdge("ST0503", "ST0504");
			undirectedGraph.setEdgeWeight(stEdge050304, stairWeight);
			DefaultEdge stEdge050405 = undirectedGraph.addEdge("ST0504", "ST0505");
			undirectedGraph.setEdgeWeight(stEdge050405, stairWeight);
			DefaultEdge stEdge050506 = undirectedGraph.addEdge("ST0505", "ST0506");
			undirectedGraph.setEdgeWeight(stEdge050506, stairWeight);
			DefaultEdge stEdge050607 = undirectedGraph.addEdge("ST0506", "ST0507");
			undirectedGraph.setEdgeWeight(stEdge050607, stairWeight);
			DefaultEdge stEdge050708 = undirectedGraph.addEdge("ST0507", "ST0508");
			undirectedGraph.setEdgeWeight(stEdge050708, stairWeight);
			DefaultEdge stEdge050809 = undirectedGraph.addEdge("ST0508", "ST0509");
			undirectedGraph.setEdgeWeight(stEdge050809, stairWeight);
			
			//ST06
			DefaultEdge stEdge06B3B2 = undirectedGraph.addEdge("ST06B3", "ST06B2");
			undirectedGraph.setEdgeWeight(stEdge06B3B2, stairWeight);
			DefaultEdge stEdge06B2B1 = undirectedGraph.addEdge("ST06B2", "ST06B1");
			undirectedGraph.setEdgeWeight(stEdge06B2B1, stairWeight);
			DefaultEdge stEdge06B101 = undirectedGraph.addEdge("ST06B1", "ST0601");
			undirectedGraph.setEdgeWeight(stEdge06B101, stairWeight);
			DefaultEdge stEdge060102 = undirectedGraph.addEdge("ST0601", "ST0602");
			undirectedGraph.setEdgeWeight(stEdge060102, stairWeight);
			DefaultEdge stEdge060203 = undirectedGraph.addEdge("ST0602", "ST0603");
			undirectedGraph.setEdgeWeight(stEdge060203, stairWeight);
			DefaultEdge stEdge060304 = undirectedGraph.addEdge("ST0603", "ST0604");
			undirectedGraph.setEdgeWeight(stEdge060304, stairWeight);
			DefaultEdge stEdge060405 = undirectedGraph.addEdge("ST0604", "ST0605");
			undirectedGraph.setEdgeWeight(stEdge060405, stairWeight);
			DefaultEdge stEdge060506 = undirectedGraph.addEdge("ST0605", "ST0606");
			undirectedGraph.setEdgeWeight(stEdge060506, stairWeight);
			DefaultEdge stEdge060607 = undirectedGraph.addEdge("ST0606", "ST0607");
			undirectedGraph.setEdgeWeight(stEdge060607, stairWeight);
			DefaultEdge stEdge060708 = undirectedGraph.addEdge("ST0607", "ST0608");
			undirectedGraph.setEdgeWeight(stEdge060708, stairWeight);
			DefaultEdge stEdge060809 = undirectedGraph.addEdge("ST0608", "ST0609");
			undirectedGraph.setEdgeWeight(stEdge060809, stairWeight);
			DefaultEdge stEdge060910 = undirectedGraph.addEdge("ST0609", "ST0610");
			undirectedGraph.setEdgeWeight(stEdge060910, stairWeight);
			DefaultEdge stEdge061011 = undirectedGraph.addEdge("ST0610", "ST0611");
			undirectedGraph.setEdgeWeight(stEdge061011, stairWeight);
			DefaultEdge stEdge061112 = undirectedGraph.addEdge("ST0611", "ST0612");
			undirectedGraph.setEdgeWeight(stEdge061112, stairWeight);
			
			//ST07
			DefaultEdge stEdge07B3B2 = undirectedGraph.addEdge("ST07B3", "ST07B2");
			undirectedGraph.setEdgeWeight(stEdge07B3B2, stairWeight);
			DefaultEdge stEdge07B2B1 = undirectedGraph.addEdge("ST07B2", "ST07B1");
			undirectedGraph.setEdgeWeight(stEdge07B2B1, stairWeight);
			
			//ST08
			DefaultEdge stEdge08B2B1 = undirectedGraph.addEdge("ST08B2", "ST08B1");
			undirectedGraph.setEdgeWeight(stEdge08B2B1, stairWeight);
			DefaultEdge stEdge080102 = undirectedGraph.addEdge("ST0801", "ST0802");
			undirectedGraph.setEdgeWeight(stEdge080102, stairWeight);
			DefaultEdge stEdge080203 = undirectedGraph.addEdge("ST0802", "ST0803");
			undirectedGraph.setEdgeWeight(stEdge080203, stairWeight);
			DefaultEdge stEdge080304 = undirectedGraph.addEdge("ST0803", "ST0804");
			undirectedGraph.setEdgeWeight(stEdge080304, stairWeight);
			DefaultEdge stEdge080405 = undirectedGraph.addEdge("ST0804", "ST0805");
			undirectedGraph.setEdgeWeight(stEdge080405, stairWeight);
			DefaultEdge stEdge080506 = undirectedGraph.addEdge("ST0805", "ST0806");
			undirectedGraph.setEdgeWeight(stEdge080506, stairWeight);
			DefaultEdge stEdge080607 = undirectedGraph.addEdge("ST0806", "ST0807");
			undirectedGraph.setEdgeWeight(stEdge080607, stairWeight);
			DefaultEdge stEdge080708 = undirectedGraph.addEdge("ST0807", "ST0808");
			undirectedGraph.setEdgeWeight(stEdge080708, stairWeight);
			DefaultEdge stEdge080809 = undirectedGraph.addEdge("ST0808", "ST0809");
			undirectedGraph.setEdgeWeight(stEdge080809, stairWeight);
			
			//ST09
			DefaultEdge stEdge090102 = undirectedGraph.addEdge("ST0901", "ST0902");
			undirectedGraph.setEdgeWeight(stEdge090102, stairWeight);
			DefaultEdge stEdge090203 = undirectedGraph.addEdge("ST0902", "ST0903");
			undirectedGraph.setEdgeWeight(stEdge090203, stairWeight);
			DefaultEdge stEdge090304 = undirectedGraph.addEdge("ST0903", "ST0904");
			undirectedGraph.setEdgeWeight(stEdge090304, stairWeight);
			DefaultEdge stEdge090405 = undirectedGraph.addEdge("ST0904", "ST0905");
			undirectedGraph.setEdgeWeight(stEdge090405, stairWeight);
			DefaultEdge stEdge090506 = undirectedGraph.addEdge("ST0905", "ST0906");
			undirectedGraph.setEdgeWeight(stEdge090506, stairWeight);
			DefaultEdge stEdge090607 = undirectedGraph.addEdge("ST0906", "ST0907");
			undirectedGraph.setEdgeWeight(stEdge090607, stairWeight);
			DefaultEdge stEdge090708 = undirectedGraph.addEdge("ST0907", "ST0908");
			undirectedGraph.setEdgeWeight(stEdge090708, stairWeight);
			DefaultEdge stEdge090809 = undirectedGraph.addEdge("ST0908", "ST0909");
			undirectedGraph.setEdgeWeight(stEdge090809, stairWeight);
			DefaultEdge stEdge090910 = undirectedGraph.addEdge("ST0909", "ST0910");
			undirectedGraph.setEdgeWeight(stEdge090910, stairWeight);
			
			//ST10
			DefaultEdge stEdge100102 = undirectedGraph.addEdge("ST1001", "ST1002");
			undirectedGraph.setEdgeWeight(stEdge100102, stairWeight);
			DefaultEdge stEdge100203 = undirectedGraph.addEdge("ST1002", "ST1003");
			undirectedGraph.setEdgeWeight(stEdge100203, stairWeight);
			DefaultEdge stEdge100304 = undirectedGraph.addEdge("ST1003", "ST1004");
			undirectedGraph.setEdgeWeight(stEdge100304, stairWeight);
			DefaultEdge stEdge100405 = undirectedGraph.addEdge("ST1004", "ST1005");
			undirectedGraph.setEdgeWeight(stEdge100405, stairWeight);
			DefaultEdge stEdge100506 = undirectedGraph.addEdge("ST1005", "ST1006");
			undirectedGraph.setEdgeWeight(stEdge100506, stairWeight);
			DefaultEdge stEdge100607 = undirectedGraph.addEdge("ST1006", "ST1007");
			undirectedGraph.setEdgeWeight(stEdge100607, stairWeight);
			DefaultEdge stEdge100708 = undirectedGraph.addEdge("ST1007", "ST1008");
			undirectedGraph.setEdgeWeight(stEdge100708, stairWeight);
			DefaultEdge stEdge100809 = undirectedGraph.addEdge("ST1008", "ST1009");
			undirectedGraph.setEdgeWeight(stEdge100809, stairWeight);
			DefaultEdge stEdge100910 = undirectedGraph.addEdge("ST1009", "ST1010");
			undirectedGraph.setEdgeWeight(stEdge100910, stairWeight);
			
			//ST11
			DefaultEdge stEdge110102 = undirectedGraph.addEdge("ST1101", "ST1102");
			undirectedGraph.setEdgeWeight(stEdge110102, stairWeight);
			DefaultEdge stEdge110203 = undirectedGraph.addEdge("ST1102", "ST1103");
			undirectedGraph.setEdgeWeight(stEdge110203, stairWeight);
			DefaultEdge stEdge110304 = undirectedGraph.addEdge("ST1103", "ST1104");
			undirectedGraph.setEdgeWeight(stEdge110304, stairWeight);
			DefaultEdge stEdge110405 = undirectedGraph.addEdge("ST1104", "ST1105");
			undirectedGraph.setEdgeWeight(stEdge110405, stairWeight);
			DefaultEdge stEdge110506 = undirectedGraph.addEdge("ST1105", "ST1106");
			undirectedGraph.setEdgeWeight(stEdge110506, stairWeight);
			DefaultEdge stEdge110607 = undirectedGraph.addEdge("ST1106", "ST1107");
			undirectedGraph.setEdgeWeight(stEdge110607, stairWeight);
			DefaultEdge stEdge110708 = undirectedGraph.addEdge("ST1107", "ST1108");
			undirectedGraph.setEdgeWeight(stEdge110708, stairWeight);
			DefaultEdge stEdge110809 = undirectedGraph.addEdge("ST1108", "ST1109");
			undirectedGraph.setEdgeWeight(stEdge110809, stairWeight);
			DefaultEdge stEdge110910 = undirectedGraph.addEdge("ST1109", "ST1110");
			undirectedGraph.setEdgeWeight(stEdge110910, stairWeight);
			DefaultEdge stEdge111011 = undirectedGraph.addEdge("ST1110", "ST1111");
			undirectedGraph.setEdgeWeight(stEdge111011, stairWeight);
			DefaultEdge stEdge111112 = undirectedGraph.addEdge("ST1111", "ST1112");
			undirectedGraph.setEdgeWeight(stEdge111112, stairWeight);
			
			//ST12
			DefaultEdge stEdge120102 = undirectedGraph.addEdge("ST1201", "ST1202");
			undirectedGraph.setEdgeWeight(stEdge120102, stairWeight);
			DefaultEdge stEdge120203 = undirectedGraph.addEdge("ST1202", "ST1203");
			undirectedGraph.setEdgeWeight(stEdge120203, stairWeight);
			DefaultEdge stEdge120304 = undirectedGraph.addEdge("ST1203", "ST1204");
			undirectedGraph.setEdgeWeight(stEdge120304, stairWeight);
			DefaultEdge stEdge120405 = undirectedGraph.addEdge("ST1204", "ST1205");
			undirectedGraph.setEdgeWeight(stEdge120405, stairWeight);
			DefaultEdge stEdge120506 = undirectedGraph.addEdge("ST1205", "ST1206");
			undirectedGraph.setEdgeWeight(stEdge120506, stairWeight);
			DefaultEdge stEdge120607 = undirectedGraph.addEdge("ST1206", "ST1207");
			undirectedGraph.setEdgeWeight(stEdge120607, stairWeight);
			DefaultEdge stEdge120708 = undirectedGraph.addEdge("ST1207", "ST1208");
			undirectedGraph.setEdgeWeight(stEdge120708, stairWeight);
			DefaultEdge stEdge120809 = undirectedGraph.addEdge("ST1208", "ST1209");
			undirectedGraph.setEdgeWeight(stEdge120809, stairWeight);
			DefaultEdge stEdge120910 = undirectedGraph.addEdge("ST1209", "ST1210");
			undirectedGraph.setEdgeWeight(stEdge120910, stairWeight);
			DefaultEdge stEdge121011 = undirectedGraph.addEdge("ST1210", "ST1211");
			undirectedGraph.setEdgeWeight(stEdge121011, stairWeight);
			DefaultEdge stEdge121112 = undirectedGraph.addEdge("ST1211", "ST1212");
			undirectedGraph.setEdgeWeight(stEdge121112, stairWeight);

			
	}
}