public class TwoSumTar {
    public static void main(String[] args) {
        int[] number = {3, 3};
        int target = 6;
        int[] result = twoSum(number, target);
        if(result.length == 0){
            System.out.println("Target Not Found!!");
        }else{
            for(int i = 0; i < result.length; i++){
                System.out.println(result[i]);
            }
        }

    }
    //this function will return an integer array that will be consisting two elements
    //we would pass an integer array and a target integer as parameters
    //the result array will have the indeces of elements from array such that they add up to be the target
    public static int[] twoSum(int[] num, int target){
        int len= num.length; //length of the array
        for(int i = 0; i < len; i++){ //by using the brute force approach, we will use a nested loop for checkig the elements
            for(int j = 0 ; j < len; j++){
                if(num[i] + num[j] == target && i != j){
                    return new int[] {i , j} ;
                }//the logic is simple, we will check one by one if two numbers add upto be the target
                //if we find those numbers, we will return the indeces of those
                //else, we will return an empty integer array
                //the time and space complexity of this are: 
                //time complexity: O(n^2)
                //space complexity: O(1)
            }
        }
        return  new int[] {};
    }
    public static int[] sumTwo(int[] num, int target){
        int len = num.length;
        for(int i = 0; i < len; i++){
            for(int j = 1; j != i; j++){
                if(num[i] + num[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

}

