package LinkedListPractice;

import java.util.HashSet;

public class Questions {
    void deleteDups(LinkedList ll) {
        HashSet<Integer> hs = new HashSet<Integer>();
        Node current = ll.head;
        Node prev = null;
        while (current != null) {
            int curval = current.value;
            if (hs.contains(curval)) {
                if (prev != null) {
                    prev.next = current.next;
                }
                ll.size--;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;

        }
    }

    Node nthToLast(LinkedList ll, int n) {
        Node p1 = ll.head;
        Node p2 = ll.head;
        for (int i = 0; i < n; i++) {
            if (p2 == null)
                return null;
            p2 = p2.next;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    LinkedList LinkedListPartition(LinkedList ll, int x) {
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (currentNode.value < x) {
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;
    }

    // LinkedList sumList(LinkedList llA, LinkedList llB){
    // LinkedList sumll = new LinkedList();
    // Node currentNodeA = llA.head;
    // Node currentNodeB = llB.head;
    // int sumA = 0;
    // int sumB = 0;
    // for (int i = 1; i<llA.size;i++){
    // sumA += currentNodeA.value*(10^i);
    // }
    // for (int i = 1; i<llB.size;i++){
    // sumB += currentNodeB.value*(10^i);
    // }
    // int sumAB = sumA + sumB;
    // int reversedAB = Integer.parseInt(new
    // StringBuilder(String.valueOf(sumAB)).reverse().toString());
    // for(int i = String.valueOf(Math.abs(reversedAB)).length(); i>1;i-- ){

    // }
    // return sumll;
    // }
}
