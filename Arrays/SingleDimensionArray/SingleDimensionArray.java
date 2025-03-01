package SingleDimensionArray;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;

        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Value inserted successfully");
            } else {
                System.out.println("Array cell occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("invalid index");
        }

    }

    public void arrayTraversal() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(' ');
    }

    public void searchInArray(int valueToSearchFor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearchFor) {
                System.out.println("Value exists at index of " + i);
                return;
            }
        }
        System.out.println("Value not found");
    }

    public void deleteAnElement(int indexOfValueToDelete) {
        try {
            arr[indexOfValueToDelete] = Integer.MIN_VALUE;
            System.out.println("Value deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Invalid index(Out of bounds)");
        }
    }

}