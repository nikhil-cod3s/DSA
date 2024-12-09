// A school is trying to take an annual photo of all the students.
//  The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

// You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

// Return the number of indices where heights[i] != expected[i].


public class HeightChecker {
    public static void main(String[] args){
        int[] expected = { 1, 2, 3, 4, 5};
        int[] heights = { 5, 1, 2, 3, 4};
        int result = heightChecker(heights, expected);
        System.out.println(result + " does not match");
    }
    public static int heightChecker(int[] array, int[] expected){
        int  i = 0;
        int count = 0;
        
        while(i < array.length){
            if(array[i] != expected[i]){
               count++; 
            }
            i++; 
        }

        return count;
    }

}
