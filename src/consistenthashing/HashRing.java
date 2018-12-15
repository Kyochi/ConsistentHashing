package consistenthashing;

import java.util.ArrayList;
import java.util.List;

public class HashRing implements IHashRing{
    private static int NODES_NB = 5;
    private static int MAX_ANGLE = 360;

    private List node_angles = new ArrayList<>();
    private List nodes_weights = new ArrayList<>();
    private int[] ring = new int[MAX_ANGLE];

    public Node getAffectedNode(Key key) {
        return null;
    }

    public void addNode(Node nodeToAdd) {

    }

    public void removeNode(Node nodeToRemove) {

    }

}
