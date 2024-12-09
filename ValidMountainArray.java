

public class ValidMountainArray {
    public static void main(String[] args){
        int[] nums = { 1, 2, 3, 4, 2, 6, 1 };
        boolean result = validMountainInArray( nums );
        if(result == false){
            System.out.println("not valid");
        }
        else{
            System.out.println("valid");
        }
    }
    public static boolean validMountainInArray(int[] arr){
        int n = arr.length;
        int i = 0;
        
        // Walk up to find the peak
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }
        
        // Peak can't be the first or the last element
        if (i == 0 || i == n - 1) {
            return false;
        }
        
        // Walk down to check the descending part
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }
        
        // If we've reached the end, it's a valid mountain array
        return i == n - 1;
    }
}
