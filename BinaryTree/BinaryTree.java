package BinaryTree;

import java.util.ArrayList;

public class BinaryTree {
    ArrayList<BinaryNode> arr;
    int lastUsedIndex;

    public BinaryTree() {
        this.arr = new ArrayList<BinaryNode>();
        this.lastUsedIndex = 0;
        System.out.println("Blank tree has been created");
    }

    void insert(String a) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = a;
        arr.add(newNode);
        this.lastUsedIndex++;
    }

    void preOrder(int index) {
        if (index >= arr.size())
            return;

        System.out.println(arr.get(index).value + " ");
        preOrder(2 * index + 1); // left
        preOrder(2 * index + 2); // right
    }

    void inOrder(int index) {
        if (index >= arr.size())
            return;

        inOrder(2 * index + 1); // left
        System.out.println(arr.get(index).value + " ");
        inOrder(2 * index + 2); // right
    }

    void postOrder(int index) {
        if (index >= arr.size())
            return;

        postOrder(2 * index + 1); // left
        postOrder(2 * index + 2); // right
        System.out.println(arr.get(index).value + " ");
    }

    void levelOrder() {
        arr.forEach(a -> {
            System.out.println(a + " ");
        });
    }

    void search(String b) {
        for (BinaryNode node : arr) {
            if (node.value.equals(b)) {
                System.out.println("Value found in tree");
                return;
            }
        }
        System.out.println("Value not found in tree");
    }

    void deleteDeepestNode() {
        this.arr.remove(this.arr.size() - 1);
    }

    void deleteBT() {
        this.arr = new ArrayList<BinaryNode>();
        System.out.println("Binary tree deleted successfully");
    }
}