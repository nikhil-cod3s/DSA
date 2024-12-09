public class RemoveDuplictatesFromArraySorted {
    public static void main(String[] args){
        int[] numbers = {1, 1, 2};
        
        // for(int i = 0; i < numbers.length; i++){
        //     System.out.println(numbers[i]);
        // }
        System.out.println(removeDuplicate(numbers));
        
    }

    private static int removeDuplicate(int[] array){
        int[] result = new int[array.length];
        for(int  i = 0; i < array.length ; i++){
            for(int j = 0; j < result.length; j++){
                if(array[i] != array[j]){
                    result[j] = array[i];
                }
            }
        }


        int k = 0;
        for(int i = 0; i < result.length; i++){
            k++;
        }

        return k;
    }
}
