package dsa.doublelinkedlistconcept;

public class Node {

    int value;
    Node next = null, prev = null;

    public Node(int value){
        this.value = value;
    }

    public Node(int value, Node prev){
        this.value = value;
        this.prev = prev;
    }
}

