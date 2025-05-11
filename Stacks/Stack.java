package Stacks;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
    }

    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            System.out.println("Stack is full");
            return true;
        } else {
            return false;
        }
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("The array is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("value added successfully");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack empty");
            return -1;
        } else {
            int topStackValue = arr[topOfStack];
            topOfStack--;
            return topStackValue;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty stack");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    public void deleteStack() {
        arr = null;
        System.out.println("The stack has been deleted successfully");
    }

}
