public class PalindromeOrNot {
    public static void main(String[] args){
        System.out.println(checkPalindrome(121));
    }
    static int comp = 0;
   
    public static boolean checkPalindrome(int num){
        int temp = num;
        if(num == 0 && temp != comp){
            return false;
        }
        comp += num % 10;
       
        checkPalindrome(num / 10);
        System.out.println(num);
        return num == comp;
    }

}
