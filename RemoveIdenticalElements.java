public class RemoveIdenticalElements {
    public static int[] removeIdenticalElements(int[] array){
        int newLength = array.length;
        int[] sortedArray = new int[newLength];
        for(int i = 0; i<array.length ; i++){
            for(int j = 1 ; j<array.length - 1 ; j++){
                if(array[j] != array[j+1]){
                    array[j+1] = array[j];
                }
            }
        }
        
        for(int i = 0; i<array.length; i++){
            while(array[i]==0){

            }
        } 
        return sortedArray;

    }
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3, 4, 4, 5, 6, 7, 7,8};
        removeIdenticalElements(nums);
        
        for(int i = 0;i<nums.length ;i++){
            System.out.println(nums[i]);
        }
    }


}