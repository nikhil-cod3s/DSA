public class fibonacci {
    public static void main(String[] args){
        int n = 10;
        int fibo_number = fibo(n);
        System.out.println(fibo_number);
    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo( n - 1) + fibo( n - 2);
    }
}
