package com.cau.dsprj.dsprj;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class JNode {
    private static Context context;
    private static HashMap<String, NodeData> node;
    private static HashMap<String, ElevatorNode> elevator;
    private static HashMap<String, ElevatorNode> stairs;
    public JNode(Context context) {
        this.context = context;
        node = new HashMap<String, NodeData>();
        elevator = new HashMap<String, ElevatorNode>();
        stairs = new HashMap<String, ElevatorNode>();
        createNode();
    }
    private static void createNode() {
        BufferedReader br;
        String line;
        try {
            //READ AND CREATE BASIC NODES
            br = new BufferedReader(new InputStreamReader(context.getAssets().open("Data_structure_tp_nodes_sc.csv")));
            line = br.readLine(); // Header Passing
            while ((line = br.readLine()) != null) {
                String[] token = line.split(",");
                String newId = token[0];
                if (newId.length() < 4) {
                    newId = "0" + newId;
                }
                node.put(newId, new NodeData(newId, token[1], Integer.parseInt(token[2])));
            }
            br.close();

            //READ AND CREATE ELEVATOR NODES
            br = new BufferedReader(new InputStreamReader(context.getAssets().open("Data_structure_tp_nodes_el.csv")));
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] token = line.split(",");
                ElevatorNode newElev = new ElevatorNode(token[0], token[1]);
                for ( int i = 3; i < token.length; i++) {
                    String newFloor = token[i];
                    if (i == 3) newFloor = newFloor.substring(1);
                    if (i == token.length - 1) newFloor = newFloor.substring(0, newFloor.length() - 1);
                    newElev.addNewFloor(newFloor);
                }
                ArrayList<String> nodeIdx = newElev.getFloorIdx();
                for (String newIdx : nodeIdx) {
                    node.put(newIdx, new NodeData(newIdx, token[1], Integer.parseInt(token[2])));
                }
                elevator.put(token[0], newElev);
            }
            br.close();

            //READ AND CREATE STAIR NODES
            br = new BufferedReader(new InputStreamReader(context.getAssets().open("Data_structure_tp_nodes_st.csv")));
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] token = line.split(",");
                ElevatorNode newStair = new ElevatorNode(token[0], token[1]);
                for ( int i = 3; i < token.length - 1; i++) {
                    String newFloor = token[i];
                    if (i == 3) newFloor = newFloor.substring(1);
                    if (i == token.length - 2) newFloor = newFloor.substring(0, newFloor.length() - 1);
                    newStair.addNewFloor(newFloor);
                }
                ArrayList<String> nodeIdx = newStair.getFloorIdx();
                for (String newIdx : nodeIdx) {
                    node.put(newIdx, new NodeData(newIdx, token[1], Integer.parseInt(token[2])));
                }
                stairs.put(token[0], newStair);
            }
            br.close();

            //GROUPING BASIC NODES
            br = new BufferedReader(new InputStreamReader(context.getAssets().open("Data_structure_tp_Group.csv")));
            line = br.readLine();
            while((line = br.readLine()) != null) {
                String[] token = line.split(",");
                if (token.length == 0) continue; //Skip the empty line
                for (int i = 2; i < token.length; i++) {
                    if(token[i].length() == 0) break; //End when meet empty space
                    String newNode = token[i];
                    if(newNode.length() < 4) {
                        newNode = "0" + newNode;
                    }
                    node.get(newNode).setGroup(token[0]);
                }
            }
            br.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void setNodePosition(String nodeKey, int posx, int posy) {
        node.get(nodeKey).setPosX(posx);
        node.get(nodeKey).setPosY(posy);
    }
    public String getNodePosition(String nodeKey) {
        return node.get(nodeKey).getPosition();
    }
    // Return All Nodes Set
    public Set getNodesKey(){
        return node.keySet();
    }

    // Return node keys + node name
    public ArrayList<String> getNodesKeyName() {
        ArrayList<String> ret = new ArrayList<>();
        for (Iterator iter = getNodesKey().iterator(); iter.hasNext();) {
            String nodeIdx = (String)iter.next();
            ret.add(nodeIdx);
            ret.add(getNodeName(nodeIdx));
        }
        return ret;
    }

    // Return Specific Elevator Node
    public ElevatorNode getElevNodeByName(String nodeIdx) {
        return elevator.get(nodeIdx);
    }
    // Return Specific Elevator Node
    public ElevatorNode getStairNodeByName(String nodeIdx) {
        return stairs.get(nodeIdx);
    }

    // Return Elevator Nodes
    public HashMap<String, ArrayList<String>> getElevNodes() {
        HashMap<String, ArrayList<String>> ret = new HashMap<>();
        for (String elevKey : elevator.keySet()) {
            ArrayList<String> elevList = elevator.get(elevKey).getFloorIdx();
            ret.put(elevKey, elevList);
        }
        return ret;
    }
    // Return Stair Nodes
    public HashMap<String, ArrayList<String>> getStairNodes() {
        HashMap<String, ArrayList<String>> ret = new HashMap<>();
        for (String stairKey : stairs.keySet()) {
            ArrayList<String> stairList = stairs.get(stairKey).getFloorIdx();
            ret.put(stairKey, stairList);
        }
        return ret;
    }

    // Search By Floor
    public ArrayList<String> getNodesByFloor(String floorName) {
        ArrayList<String> ret = new ArrayList<>();
        for(String nodeKey : node.keySet()) {
            NodeData tmp = node.get(nodeKey);
            if (floorName.equals(tmp.getIdx().substring(0,2))) {
                ret.add(tmp.getIdx());
            }
        }
        return ret;
    }

    // Return Specific Group Nodes
    public ArrayList<String> getNodesByGroup(String groupName) {
        ArrayList<String> ret = new ArrayList<>();
        for(String nodeKey : node.keySet()) {
            NodeData tmp = node.get(nodeKey);
            if (groupName.equals(tmp.getGroup())) {
                ret.add(tmp.getIdx());
            }
        }
        return ret;
    }

    // Check whether this node exist or not
    public boolean isThisNodeExist(String nodeIdx) {
        if (node.get(nodeIdx) != null) return true;
        return false;
    }

    // Return Specific Node's Name
    public String getNodeName(String nodeIdx) {
        if (!isThisNodeExist(nodeIdx)) return null;
        return node.get(nodeIdx).getName();
    }

    // Return Specific Node's Type
    public int getNodeType(String nodeIdx) {
        if (!isThisNodeExist(nodeIdx)) return -1;
        return node.get(nodeIdx).getType();
    }

}
