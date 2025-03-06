public class bestScore {
    public int[] firstSecond(int[] array) {
        int[] newArray = new int[2];
        newArray[0] = Integer.MIN_VALUE;
        newArray[1] = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > newArray[0]) {
                newArray[1] = newArray[0];
                newArray[0] = array[i];
            } else {
                if (array[i] > newArray[1]) {
                    newArray[1] = array[i];
                }
            }
        }
        return newArray;
    }
}
