public class ReverseInteger {
    public static void main(String[] args){
        int number =  1534236469;
        // System.out.println(reverse(number));
        System.out.println(betterReverse(number));

    }
    public static int reverse(int x){
        int val = 0; 
        int reversed = 0;
        while(x > 0) {
            val =  x % 10;
            x /= 10;
            reversed = reversed * 10 + val;
        }
        return reversed;
    }
    // this code is working for all values of `x` such that x is greater then 0
    // let us write a new method that will also work the negative
    // integers.
    public static int betterReverse(int x){
        int reversed = 0;
        int val = 0;
        if(x == 0) return 0;
        if( x < 0){
            x *= -1;
            while( x > 0){
            val = x % 10;
            x /= 10;
            reversed = reversed * 10 + val;
            }
            reversed = reversed * -1;
        }
        while( x > 0){
            val = x % 10;
            x /= 10;
            reversed = reversed * 10 + val;
        }


        return reversed;
    }
}
