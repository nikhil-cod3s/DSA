//Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

public class ReturnGreatestToTheRight {
    public static void main(String[] args) {
        int[] nums = {17, 18, 3, 5, 6, 1};
        int length = nums.length;
        int[] result = retrunGreatest(nums, length);
        for(int i = 0; i < result.length ; i++){
            System.out.println(result[i]);
        }
    }
    public static int[] retrunGreatest(int[] array, int length){
        int max = -1;
    
        for (int i = length - 1; i >= 0; i--) {
            int current = array[i];
            array[i] = max;
            if (current > max) {
                max = current;
            }
        }
        
        return array;
    }
}
