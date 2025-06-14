package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNode root;

    BinarySearchTree() {
        root = null;
    }

    private void insertLogic(int a, BinaryNode b) {
        if (a < b.value) {
            if (b.left == null) {
                BinaryNode newNode = new BinaryNode();
                newNode.value = a;
                b.left = newNode;
            } else {
                insertLogic(a, b.left);
            }
        } else {
            if (b.right == null) {
                BinaryNode newNode = new BinaryNode();
                newNode.value = a;
                b.right = newNode;
            } else {
                insertLogic(a, b.right);
            }
        }
    }

    void insert(int value) {
        BinaryNode node = new BinaryNode();
        node.value = value;
        if (this.root == null) {
            this.root = node;
        } else {
            this.insertLogic(value, root);
        }
    }

    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }

        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // inorder
    void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.println(node.value + " ");
        inOrder(node.right);
    }

    // postorder
    void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");
    }

    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.value);
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    Boolean searchLogic(BinaryNode node, int value) {

        if (node == null) {
            return false;
        }

        if (node.value == value) {
            return true;
        }

        if (node.value < value) {
            return searchLogic(node.right, value);
        } else {
            return searchLogic(node.left, value);
        }
    }

    void search(int value) {
        if (searchLogic(root, value)) {
            System.out.println("Value found in binary search tree");
        } else {
            System.out.println("Value NOT found in binary search tree");
        }
    }

    BinaryNode[] deleteLogic(BinaryNode node, BinaryNode searchNode) {

        if (node == null) {
            BinaryNode nullNode = null;
            return new BinaryNode[] { nullNode, nullNode };
        }

        if (node.left == searchNode) {
            return new BinaryNode[] { node, node.left };
        }
        if (node.right == searchNode) {
            return new BinaryNode[] { node, node.right };
        }

        if (node.value < searchNode.value) {
            return deleteLogic(node.right, searchNode);
        } else {
            return deleteLogic(node.left, searchNode);
        }
    }

    BinaryNode z(BinaryNode node, BinaryNode largestNode) {
        if (node == null) {
            return largestNode;
        }
        if (largestNode == null) {
            largestNode = node;
        }
        if (largestNode.value < node.value) {
            largestNode = node;
        }
        largestNode = z(node.left, largestNode);
        largestNode = z(node.right, largestNode);

        return largestNode;
    }

    BinaryNode y(BinaryNode node, BinaryNode smallestNode) {
        if (node == null) {
            return smallestNode;
        }
        if (smallestNode == null) {
            smallestNode = node;
        }
        if (smallestNode.value > node.value) {
            smallestNode = node;
        }
        smallestNode = y(node.left, smallestNode);
        smallestNode = y(node.right, smallestNode);

        return smallestNode;
    }

    void deleteNode(BinaryNode node) {

        if (node == this.root) {
            if (this.root.right == null && this.root.left == null) {
                this.deleteBST();
                return;
            } else if (!(this.root.right == null) && this.root.left == null) {
                BinaryNode smallestRightNode = null;
                smallestRightNode = y(this.root.right, smallestRightNode);
                root.value = smallestRightNode.value;
                deleteNode(smallestRightNode);
                return;
            } else if ((this.root.left != null)) {
                BinaryNode largestLeftNode = null;
                largestLeftNode = z(this.root.left, largestLeftNode);
                this.root.value = largestLeftNode.value;
                deleteNode(largestLeftNode);
                return;
            }
        }

        BinaryNode[] r = deleteLogic(this.root, node);
        if (r[0] == null || r[1] == null) {
            System.out.println("Node doesn't exist in binary tree");
            return;
        }
        if (r[0] == null) {
            System.out.println("Node don't exist in binary tree");
            return;
        }
        BinaryNode parentNode = r[0];
        BinaryNode deathTollNode = r[1];

        if (deathTollNode.right == null && deathTollNode.left == null) {
            if (parentNode.left == deathTollNode) {
                parentNode.left = null;
            } else {
                parentNode.right = null;
            }
        } else if (!(deathTollNode.right == null) && deathTollNode.left == null) {
            if (parentNode.left == deathTollNode) {
                parentNode.left = deathTollNode.right;
            } else {
                parentNode.right = deathTollNode.right;
            }
        } else if (!(deathTollNode.left == null) && deathTollNode.right == null) {
            if (parentNode.left == deathTollNode) {
                parentNode.left = deathTollNode.left;
            } else {
                parentNode.right = deathTollNode.left;
            }
        } else if (!(deathTollNode.left == null) && !(deathTollNode.right == null)) {
            BinaryNode largestLeftNode = null;
            largestLeftNode = z(deathTollNode.left, largestLeftNode);
            deathTollNode.value = largestLeftNode.value;
            deleteNode(largestLeftNode);
        }

    }

    void deleteBST() {
        this.root = null;
        return;
    }

}