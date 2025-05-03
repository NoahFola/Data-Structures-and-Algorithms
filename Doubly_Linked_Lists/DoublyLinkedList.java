package Doubly_Linked_Lists;

public class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public DoublyNode createDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;

    }

    public void insertDLL(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createDLL(nodeValue);
            return;
        }
        if (location == 1) {
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next.prev = newNode;
            tempNode.next = newNode;

        }
        size++;
    }

    public void traverseDLL() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.println(tempNode.value);
                System.out.println("->");
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("DLL dont exist");
        }
        System.out.println('\n');
    }

    public void reverseTraverseDLL() {
        if (head != null) {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.println(tempNode.value);
                System.out.println("->");
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("DLL dont exist");
        }
        System.out.println('\n');
    }

    public boolean searchDLL(int value) {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == value) {
                    System.out.println("The value was located at " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("DLL dont exist");
        }
        System.out.println('\n');
        return false;
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("Dll isn't");
            return;
        }
        if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                return;
            } else {
                head = head.next;
                head.prev = null;
            }

        } else if (location >= size) {
            if (size == 1) {
                head = null;
                tail = null;
                return;
            } else {
                tail = tail.prev;
                tail.next = null;
            }

        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location) {
                tempNode = tempNode.next;
                index++;
            }
            tempNode.prev.next = tempNode.next;
            tempNode.next.prev = tempNode.prev;

        }
        size--;
    }

    public void deleteDLL() {
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;

        System.out.println("Dll deleted successfully");
    }
}
