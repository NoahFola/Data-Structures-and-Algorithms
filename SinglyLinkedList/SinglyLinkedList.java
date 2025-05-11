package SinglyLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;

        return head;
    }

    // Insert Method SinglyLinkedList
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    };

    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            Node tempNode = head;
            int i = 0;
            while (i < size) {
                System.out.print(tempNode.value);
                System.out.print("-->");
                tempNode = tempNode.next;
                i++;
            }
        }
    }

    public boolean searchNode(int nodeValue) {
        if (head == null) {
            System.out.println("sLL does not exist");
            return false;
        }
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.value == nodeValue) {
                System.out.println("Node found at index " + i);
                return true;
            }
            tempNode = tempNode.next;
            i++;
        }

        System.out.println("Node not found");
        return false;
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("List does not exist");
            return;
        }
        if (location == 1) {
            head = head.next;
            size--;
            return;
        }
        Node tempNode = head;
        for (int i = 1; i <= size; i++) {
            if (i == location - 1) {
                tempNode.next = tempNode.next.next;
                size--;
                return;
            }
            tempNode = tempNode.next;
            if (location == size && i == location - 1) {
                tempNode.next = null;
                tail = tempNode;
                tail.next = tempNode;
                size--;
                return;
            }

            i++;
        }

    }

}
