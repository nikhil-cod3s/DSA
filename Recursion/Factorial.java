public class Factorial {
    public static void main(String[] args){
        int x = facto(5);
        System.out.println(x);
    }
    public static int facto(int n){
        if (n < 2 ){
            return 1;
        }
        // int x = facto(n) * facto(n - 1); 
        return n * facto(n - 1);
    }
}
