
//Given a binary array nums, return the maximum number of consecutive 1's in the array.

public class ReturnMaxOnes {
    public static void main(String[] args) {
        int[] num = {1 ,1, 1, 0, 1};
        System.out.println(retrunMaxOnes(num));
    }
    public static int retrunMaxOnes(int[] array){
        int maxVal = 0;
        int currentVal = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == 1){
                currentVal++;
                maxVal = Math.max(currentVal, maxVal);
            }
            else if( array[i] != 1){
                currentVal = 0;
            }
        }
        return maxVal;
    }
}