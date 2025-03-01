package SingleDimensionArray;

class Main {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);

        sda.insert(0, 10);
        sda.insert(1, 20);
        sda.insert(2, 52);

        // Accessing Elements

        // int firstElement = sda.arr[0];
        // System.out.println(firstElement);
        // int thirdElement = sda.arr[2];
        // System.out.println(thirdElement);

        // Array Traversal
        // sda.arrayTraversal();

        // Array search
        // sda.searchInArray(10);

        // Delete
        sda.deleteAnElement(1);

    }
}
