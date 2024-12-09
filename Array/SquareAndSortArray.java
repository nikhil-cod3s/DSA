
//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

public class SquareAndSortArray {
    public static void main(String[] args) {
        int[] nums = {-2, 13, 6, 10};
        squareArray(nums);
        for ( int i = 0; i <nums.length ; i++){
        System.out.println(nums[i]);
        }
    }
    public static void bubbleSort(int[] array){
        int n = array.length;
        boolean swapped;

        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Inner loop for each pass
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
        }

    }   
    public static int[] squareArray(int[] array){
        for(int i = 0; i < array.length ; i++){
            array[i] = (int) Math.pow(array[i], 2);
        }
        bubbleSort(array);
        return array;
    }
}
