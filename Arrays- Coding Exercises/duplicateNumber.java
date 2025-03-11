public class duplicateNumber {
    public int[] removeDuplicates(int[] array){
        int length = array.length;
        int[] newArray = new int[length];
        newArray[0] = array[0];
        for(int i = 0; i < length; i++){
            if(newArray[0] == array[i]){
                newArray[0] = array[i]; 
            }
        }
        return array;
    }
}
