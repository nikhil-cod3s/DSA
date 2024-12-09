public class CheckForDoubles {
    public static void main(String[] args){
        int[] nums = { 8, 0, 5, 3, 1};
        System.out.println(checkForDoubles(nums));;
    }
    public static boolean checkForDoubles(int[] array){
        for(int i = 0; i < array.length ; i++){
            for(int j = array.length - 1; j >= 0 ; j--){
                if(i != j && array[i] == array[j] * 2 ){
                    System.out.println(array[i] + " is double of " + array[j]);
                    return true ;
                }
            }
        }
        System.out.println("No values were found!!");
        return false;
    }
    
}
