package Queues;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Queue created successfully");
    }

    public boolean isFull() {
        if (topOfQueue == arr.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (beginningOfQueue == -1 || beginningOfQueue == arr.length) {
            return true;
        }
        return false;
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Value inserted successfully");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Value inserted successfully");
        }
    }
}
