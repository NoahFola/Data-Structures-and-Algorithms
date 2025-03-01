package TwoDimensionArray;

class Main {

    public static void main(String[] args) {
        TwoDimensionalArray tda = new TwoDimensionalArray(2, 2);
        tda.insert(0, 0, 23);
        tda.insert(0, 1, 103);
        tda.insert(1, 0, 28);
        tda.insert(1, 1, 3);

        tda.accessCell(0, 1);
        tda.arrayTraversal();
        tda.searchInArray(23);
        tda.deleteAnElement(0, 0);

    }

}
