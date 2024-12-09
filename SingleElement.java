public class SingleElement {
    public static void main(String[] args){
        int[] numbers = {1,1,2,3,3,4,4};
        int num = singleElement(numbers);
        System.out.print(num);

    }
    public static int singleElement(int[] array){
        int result = 0;
        for (int num : array) {
            result ^= num;
        }
        return result;
    } 

}

