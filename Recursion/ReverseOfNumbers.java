public class ReverseOfNumbers {
    public static void main(String[] args){
        System.out.println(reverse(123));
    }
    public static int reverse(int n){
        if(n < 1){
            return 0;
        } 
        int m = n%10;
        return m + reverse(n/10);
    }
}
