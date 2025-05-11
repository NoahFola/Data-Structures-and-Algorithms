package StacksLinkedists;

public class Stack {
    DoublyLinkedList linkedList;

    public Stack() {
        linkedList = new DoublyLinkedList();
    }

    public void push(int value) {
        linkedList.insertDLL(value, 0);
        System.out.println("Inserted successfully");
    }

    public boolean isEmpty() {
        if (linkedList.head == null) {
            return true;
        }
        return false;
    }

    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("Empty stack");
        } else {
            result = linkedList.head.value;
            linkedList.deleteNode(0);
        }
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty stack");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }

    public void deleteStack() {
        linkedList.head = null;
        System.out.println("Stack deleted successfully");
    }
}
