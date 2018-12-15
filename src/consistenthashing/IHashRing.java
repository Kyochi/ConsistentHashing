package consistenthashing;

public interface IHashRing {
    Node getAffectedNode(Key key);
    void addNode(Node nodeToAdd);
    void removeNode(Node nodeToRemove);
}
