// this program or code will double the occurance of zero and move the elements ahead of zero towards the end of the array
//example: input : [1, 0, 3, 4, 6, 0] output: [1, 0, 0, 3, 4, 6]

public class DuplicateZeros {
    public static void main(String[] args){
        int[] nums = { 1, 0, 3, 4, 6, 0};
        duplicateZeros(nums);
        for(int i = 0 ; i < nums.length ; i++){
            System.out.println(nums[i]);
        }
    }
    public static void duplicateZeros(int[] arr) { 
        int n = arr.length;
        int zeros = 0;

        // Count the number of zeros to be duplicated
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        // Start from the last element and work backwards
        for (int i = n - 1; i >= 0; i--) {
            // Calculate the new position considering duplicated zeros
            int newPosition = i + zeros;

            // If the new position is within bounds, move the element
            if (newPosition < n) {
                arr[newPosition] = arr[i];
            }

            // If the current element is zero, we need to place another zero
            if (arr[i] == 0) {
                zeros--; // One zero has been placed

                // Place another zero in the next position, if it's within bounds
                if (newPosition - 1 < n) {
                    arr[newPosition - 1] = 0;
                }
            }
        
        }
    }

    //a second function that will duplicate zeros for nw just for practise
    

}