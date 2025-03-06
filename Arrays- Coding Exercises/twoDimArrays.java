public class twoDimArrays {
    public int sumDiagonalElements(int[][] twoDimArray) {
        int sum = 0;
        if (!(twoDimArray.length == twoDimArray[0].length)) {
            return sum;
        }
        for (int i = 0; i < twoDimArray.length; i++) {
            sum = sum + twoDimArray[i][i];
        }
        return sum;
    }
}