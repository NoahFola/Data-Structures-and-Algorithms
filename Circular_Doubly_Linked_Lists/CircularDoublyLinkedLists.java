package Circular_Doubly_Linked_Lists;

public class CircularDoublyLinkedLists {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public DoublyNode createCDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }

    public void insertCDLL(int nodeValue, int location) {
        if (head == null) {
            System.out.println("List does not exist");
            return;
        }
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            head = newNode;
            tail.next = newNode;
            return;
        }
        if (location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
            return;
        } else {
            DoublyNode tempNode = new DoublyNode();
            tempNode = head;
            int i = 0;
            while (i < location) {
                tempNode = tempNode.next;
                i++;

            }
            newNode.next = tempNode.next;
            newNode.prev = tempNode;
            tempNode.next.prev = newNode;
            tempNode.next = newNode;
        }
        size++;
    }

    public void traverseCDLL() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("DLL does not exist");
        }
        System.out.println();
    }

    public void reverseTraverseCDLL() {
        if (head != null) {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("DLL does not exist");
        }
        System.out.println();
    }

    public boolean searchCDLL(int nodeValue) {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {

                if (tempNode.value == nodeValue) {
                    System.out.print("Node found at location" + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    public void deleteNodeCDLL(int location) {
        if (head == null) {
            System.out.println("Dll does not exist");
            return;
        }

        if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                head = tail = null;
                size--;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
        } else if (location >= 0) {
            if (size == 1) {
                head = null;
                tail = null;
                head = tail = null;
                size--;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        } else {
            DoublyNode tempNode = new DoublyNode();
            tempNode = head;
            int i = 0;
            while (i < location) {
                tempNode = tempNode.next;
                i++;

            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;

        }
    }

    public void deleteCDLL() {
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("CDLL delete operation successful");
    }
}
