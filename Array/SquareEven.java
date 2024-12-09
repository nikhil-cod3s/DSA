
public class SquareEven {
    public static void main(String[] args){
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int len = nums1.length;
        int[] nums2 = {5, 4, 3, 2, 1};
        int len2 = nums2.length;
        // we will use two different methods to showcase or implement the same thing on the array 'nums'!!
        
        int[] resultArray1 = squareEvenFirst(nums1, len);
        for(int i = 0; i < len ; i++){
            System.out.print(resultArray1[i] + "  ");
        }
        int[] resultArray2 = squareEvenSecond(nums2 , len2);
        System.out.println("\n");
        for(int i = 0; i < len2 ; i++){
            System.out.print(resultArray2[i] + "  ");
        }

    }
//lets deinfe the first method!! - it returns a new array!!
    public static int[] squareEvenFirst(int[] array, int length){
        if(length == 0){
            return null;
        }
        int[] resultArray = new int[length];
        for(int i = 0; i < length ; i++){
            if(i % 2 == 0){
                resultArray[i] = array[i] * array[i] ;
            }
            else{
                resultArray[i] = array[i];
            }

        }
        return resultArray;
    }
//lets define another method  but this one will change our parameter array without creating a new array!!
    public static int[] squareEvenSecond(int[] array, int length){
        if(length == 0){
            return array;
        }
        for(int i = 0 ; i < length ; i++){
            if(i % 2 == 0){
                array[i] *= array[i];
            }
        }
        return array;
    }
//The second type of method is called an In-place Method!! They are used to reduce space and time complexity of an Algorithm

}
