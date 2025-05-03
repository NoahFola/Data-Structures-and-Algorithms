package Circular_Linked_lists;

public class circularLinkedLists {
    public Node head;
    public Node tail;
    public int size;

    public Node createCircularLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        return head;
    }
}
