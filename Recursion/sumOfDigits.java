

public class sumOfDigits {
    public static void main(String[] args) {
        int number = 1234;
        System.out.println(sumOfDgts(number));
    }
    public static int sumOfDgts(int n){
        if(n < 1){
            return 0;
        }
        int temp = n % 10;
        int result = sumOfDgts(n / 10) + temp;
        return result; 
    }
}
