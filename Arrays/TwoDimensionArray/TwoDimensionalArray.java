package TwoDimensionArray;

public class TwoDimensionalArray {
    int[][] twoDimensionalArr = null;

    public TwoDimensionalArray(int row, int col) {
        this.twoDimensionalArr = new int[row][col];
        for (int r = 0; r < twoDimensionalArr.length; r++) {
            for (int c = 0; c < twoDimensionalArr[0].length; c++) {
                twoDimensionalArr[r][c] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int col, int value) {
        try {
            if (twoDimensionalArr[row][col] == Integer.MIN_VALUE) {
                twoDimensionalArr[row][col] = value;
                System.out.println("Value added successfully");
            } else {
                System.out.println("Cell occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid index");
        }
    }

    public void accessCell(int row, int col) {
        try {
            if (twoDimensionalArr[row][col] == Integer.MIN_VALUE) {
                System.out.println("Cell empty");
            } else {
                System.out.println("cell value is " + twoDimensionalArr[row][col]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

    public void arrayTraversal() {
        for (int r = 0; r < twoDimensionalArr.length; r++) {
            for (int c = 0; c < twoDimensionalArr[0].length; c++) {
                System.out.print(twoDimensionalArr[r][c] + " ");
            }
        }
        System.out.println();
    }

    public void searchInArray(int value) {
        for (int r = 0; r < twoDimensionalArr.length; r++) {
            for (int c = 0; c < twoDimensionalArr[0].length; c++) {
                if (twoDimensionalArr[r][c] == value) {
                    System.out.println("value is located in at row:" + r + " and column:" + c);
                    return;
                }
            }
        }
        System.out.println("value not found in array");
    }

    public void deleteAnElement(int row, int col) {
        try {
            twoDimensionalArr[row][col] = Integer.MIN_VALUE;
            System.out.println("Cell cleared successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }
}