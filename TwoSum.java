// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

import java.util.Scanner;

public class TwoSum{
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 3, 5 , 8, 7,6 ,1 };
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the targeted element: ");
        int target = scanner.nextInt();
        twoSum(numbers, target);
        scanner.close();

    }
    public static int twoSum(int[] array, int target)
    {
        int[] resultArray = new int[100];
        for(int i = 0; i<array.length ; i++){
            for(int j=0 ; j< array.length; i++){
                if(array[i]+array[j]==target){
                    System.out.println("[" + i + " , " + j +" ]");
                    return 1;
                }
                
            }
        }
        System.out.println("NOT FOUND!");
        return -1;
    }

    // public static int[] twoSum(int[] array, int target)
    // {
    //     int[] resultArray = new int[100];
    //     for(int i = 0; i<array.length ; i++){
    //         for(int j=0 ; j< array.length; i++){
    //             if(array[i]+array[j]==target){
    //                resultArray[0] = i;
    //                resultArray[1] = j;
    //             }
    //             return resultArray;
                
    //         }
    //     }
    //     System.out.println("NOT FOUND!");
    //     return resultArray;
    // }
}