package com.cau.dsprj.dsprj;

public class NodeData {
    private String nodeIdx;
    private String nodeName;
    private int nodeType;
    private String nodeGroup;
    private int nodeX;
    private int nodeY;
    public NodeData(String idx, int type) {
        nodeIdx = new String(idx);
        nodeName = new String(idx);
        nodeType = type;
        nodeGroup = "";
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
    public String getGroup() {
        return nodeGroup;
    }
    public void setGroup(String nodeGroup) {
        this.nodeGroup = nodeGroup;
    }
    public void setPosX(int posX) { this.nodeX = posX; }
    public void setPosY(int posY) { this.nodeY = posY; }
    public String getPosition() {
        String ret = String.valueOf(nodeX) + "_" + String.valueOf(nodeY);
        return ret;
    }
}
