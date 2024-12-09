public class Main{
    public static void  main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearch(nums, 5));

    }
    public int linearSearch(int[] array, int value){
        int index = -1;
        for(int i = 0; i < array.length ; i++){
            if(array[i]==value){
                index = i;
            }
        }
        return index;
    }
    public static int binarySearch(int[] array, int target){


        for ( int i = 0; i < array.length ; i++){
            int low = 0;
            int high = array.length - 1;
            int middle = low + (high - low )/ 2;
            for( int j = 0; j<array.length ; j++){
                if(middle > target ){
                    high = middle - 1;

                }
                else if(middle < target){
                    low = middle + 1;
                }
                else return i;
            }
        }
        return -1;

    }
}