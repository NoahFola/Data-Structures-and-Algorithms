public class missingNumber {
    public int findMissingNumberInArray(int[] array, int n) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (((n * (n + 1)) / 2) - sum);
    }
}
