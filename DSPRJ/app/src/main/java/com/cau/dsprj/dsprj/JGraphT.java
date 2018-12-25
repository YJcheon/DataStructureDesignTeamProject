package com.cau.dsprj.dsprj;


import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultUndirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class JGraphT{
    private static JNode node;
    private static ArrayList<DefaultWeightedEdge> edges;
    private Context context;
    DijkstraShortestPath dijkstraShortestPath;
    private static DefaultUndirectedWeightedGraph<String, DefaultEdge> undirectedGraph;

    public JGraphT(Context context) {
        this.context = context;
        node = new JNode(context);
        edges = new ArrayList<>();
        undirectedGraph = new DefaultUndirectedWeightedGraph<>(DefaultEdge.class);

        //Set All nodes to Graph
        int count = 0;
        for(Iterator iter = node.getNodesKey().iterator(); iter.hasNext();) {
            String keyName = (String)iter.next();
            undirectedGraph.addVertex(keyName);
            count++;
        }

        //EDGE CREATION
        BufferedReader br;
        String line;
        try {
            //READ FILE AND MAKE CONNECTION
            br = new BufferedReader(new InputStreamReader(context.getAssets().open("Data_structure_tp_Edge.csv")));
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
                    }
                }
            }
            br.close();
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
        try{
            br = new BufferedReader(new InputStreamReader(context.getAssets().open("node1.txt")));
            line = "";
            while((line = br.readLine()) != null){
                String[] array = line.split(" ");
                int posX = Integer.valueOf(array[0]);
                int posY = Integer.valueOf(array[1]);
                for(int i = 2; i < array.length; i++) {
                    String nodeKey = array[i];
                    if (nodeKey.length() < 4) {
                        nodeKey = "0" + nodeKey;
                    }
                    if (node.isNodeKeyExist(nodeKey)){
                        node.setNodePosition(nodeKey, posX, posY);
                    }
                }
            }
            br.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList<String> getShortestPath(String source, String dest, int userNum, String busy){
        ArrayList<String> paths;
        ArrayList<String> ret = new ArrayList<>();
        Input input = new Input(0, source, dest, userNum, busy);

        // Set elevator node's basic data
        HashMap<String, ArrayList<String>> elevMap = node.getElevNodes();
        for(String elevKey: elevMap.keySet()) {
            ElevatorNode elevNode = node.getElevNodeByName(elevKey);
            int i = typeChanger(elevNode.getIdx());
            if ( i < 0 ) i = i + 6;
            else i = i + 5;
            elevNode.setter(input.sensorPeople[i], input.sensorDir[i], input.sensorNow[i], input.userNum);

        }
        //Previous in the verticalSetter.java
        int up_down = input.dFloor - input.sFloor;
        DefaultEdge tmpEdge;
        for(String elevKey: elevMap.keySet()) {
            ArrayList<String> elevList = elevMap.get(elevKey);
            for(int i = 0; i < elevList.size(); i++) {
                String src = elevList.get(i);
                for (int j = i + 1; j < elevList.size(); j++) {
                    String dst = elevList.get(j);
                    int sf = typeChanger(src);
                    int df = typeChanger(dst);
                    tmpEdge = undirectedGraph.getEdge(src, dst);
                    if (up_down > 0) {
                        undirectedGraph.setEdgeWeight(tmpEdge, node.getElevNodeByName(elevKey).weightGiver(sf, df));
                    }
                    else {
                        undirectedGraph.setEdgeWeight(tmpEdge, node.getElevNodeByName(elevKey).weightGiver(df, sf));
                    }
                }
            }
        }
        //SET EDGE WEIGHT IN STAIRS
        int stairWeight = input.busy;
        HashMap<String, ArrayList<String>> stairMap = node.getStairNodes();
        for(String stairKey: stairMap.keySet()) {
            ArrayList<String> stairList = stairMap.get(stairKey);
            for(int i = 0; i < stairList.size(); i++) {
                int weight = stairWeight + 30 * i;
                for (int j = i + 1; j < stairList.size(); j++) {
                    tmpEdge = undirectedGraph.getEdge(stairList.get(i), stairList.get(j));
                    undirectedGraph.setEdgeWeight(tmpEdge, weight);
                    weight += 30;
                }
            }
        }

        dijkstraShortestPath = new DijkstraShortestPath(undirectedGraph);
        paths = (ArrayList<String>) dijkstraShortestPath.getPath(source, dest).getVertexList();

        for (String path: paths) {
            String retValue = "";
            retValue = path + "_" + node.getNodeName(path) + "_" + node.getNodePosition(path);
            ret.add(retValue);
        }
        return ret;
    }

    public ArrayList<String> getAllNodesKeyName() {
        return node.getNodesKeyName();
    }

    private int typeChanger(String idx) {
        int ret = 0;
        int len = idx.length();
        if (idx.charAt(len - 2) == 'B') {
            ret = ret - Integer.valueOf(idx.charAt(len - 1)) + 48;
        }
        else {
            ret = Integer.valueOf(idx.substring(len - 2, len));
        }
        return ret;
    }

}
