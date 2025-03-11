package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(9, 0);
        sLL.insertInLinkedList(23, 2);
        sLL.insertInLinkedList(24, 3);
        sLL.traverseSinglyLinkedList();
        sLL.searchNode(5);
        sLL.deleteNode(2);
        sLL.traverseSinglyLinkedList();
    }

}
