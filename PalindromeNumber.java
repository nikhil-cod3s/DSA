public class PalindromeNumber {
    //what are palindrome numbers? those numbers which are read the same from left to right and right to left, like 121, 12321, 1234321 etc.
    public static void main(String[] args) {
        int number = 11;
        boolean result = palindromeCheck(number);
        if(result) System.out.println("Given number " + number + " is a palindrome number!!");
        else System.out.println("Given number " + number + "is not a palindrome"); 
    }
//function to check if a number is palindrome
    public static boolean palindromeCheck(int x){
        int newNum = 0; //new number to hold the passed integer in reverse order
        int oldNum = x;//we will compare our passed value with the new value by storing it in a variable
        while(x > 0){
            int digit = x % 10;//making a var digit will help us to hold the values we get from the passed value
            //the modulus operator here will give us the last digit from the passed value
            newNum = digit + newNum * 10;
            //the newNum will be given the digits by adding them to newNum 8 10
            //eg, if newNum was 4, we wanna add 5 after that, doing simply 4 + 5  will give 9 where we want 45, therefore we multiply 4 by 10
            x /= 10;
        }
        return oldNum == newNum;
    }

}
