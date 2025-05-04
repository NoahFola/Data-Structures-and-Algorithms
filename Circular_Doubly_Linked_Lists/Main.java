package Circular_Doubly_Linked_Lists;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedLists cdll = new CircularDoublyLinkedLists();
        cdll.createCDLL(9);
        System.out.println(cdll.head.value);
    }
}
