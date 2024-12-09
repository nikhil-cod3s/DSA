//creating a method that moves all the even integer to the start and then follow by odd integers!!!


public class SortBYParity {
    public static void main(String[] args){
        int[]  nums = {1, 2, 3, 4};
        int length = nums.length;
        sortByParity(nums);
        for(int i = 0; i < length ; i++){
            System.out.println(nums[i]);
        }
    }

    public static int[] sortByParity(int[] array){
        int len = array.length;
        int temp = 0;
        int lastOdd = 0;
        for(int i = 0; i < len ; i++ ){
            if((float)array[i] % 2 == 0.0){
                temp = array[i];
                array[i] = array[lastOdd]; 
                array[lastOdd] = temp;
                temp++;
                lastOdd ++; 
            }
        }
        return array; 
        
    }
    
}
