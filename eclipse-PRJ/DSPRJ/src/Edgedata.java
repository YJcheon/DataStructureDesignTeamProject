import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// All About Nodes
// Control Flow of All nodes

public class Edgedata {
	private String srcIdx;
	private String destIdx;
	private int weight = 0;
	public Edgedata(String srcIdx, String destIdx) {
		this.srcIdx = srcIdx;
		this.destIdx = destIdx;
		weight = 0;
	}
	public Edgedata(String srcIdx, String destIdx, int weight) {
		this.srcIdx = srcIdx;
		this.destIdx = destIdx;
		this.weight = weight;
	}
}