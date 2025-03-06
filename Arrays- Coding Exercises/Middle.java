
public class Middle {
    public int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0];
        }
        int length = array.length;
        int[] newArray = new int[length - 2];
        for (int i = 1; i < length - 1; i++) {
            newArray[i - 1] = array[i];
        }
        return newArray;
    }
}
