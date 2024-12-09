
//Given an array nums of integers, return how many of them contain an even number of digits.

public class findNumbersWithEvenNumbers {
    public static void main(String[] args){
        int[] nums = { 1, 12, 123, 1234, 12435, 123456};
        System.out.println(findEvenNum(nums)); // this will generate 3 as output
        
    }

    public static int findNum(int[] array) {
        int count = 0;
        // we will iterate through all the elements one by one
        for(int i = 0; i < array.length; i++){
            if(hasEvenDigits(array[i])){
                //this method `hasEvenDigits` will check if the element has even no. of digits or not
                count++;
            }
        }
        return count;
    }
    //the `hasEvenDigits` methods will check if the element has even number of digits or not
    public static boolean hasEvenDigits(int num){
        int digit = 0;
        while(num != 0){//while the loop is true, we will divide the element by ten and count the number of times the loops was run
            num /= 10;
            digit++;
        }
        // the return type is boolean that's why we are using a boolean exp to return the value either true or false
        return digit % 2 == 0;
    } 

    // we will create two f(x) for practises
    public static int findEvenNum(int[] array){
        int number = 0; //our final number or answer initially zero
        for(int i = 0; i < array.length; i++){//we will iterate through the array 
            if(hasEvnDigit(array[i])){
                //if the hasEvenDigit method returns true, we will increase the number value
                number++;
            }
        }
        return number; // finally the total number of even digits will be returned
    }
    public static boolean hasEvnDigit(int num){
        int result = 0; // this result will count the number of digits in a number
        while(num != 0){
            result++;//incrase the value until it reaches 0
            num /= 10;
        }
        return result % 2 == 0;//return a boolean by checking the remainder of result wrt 2
    }
}


