

public class Nto1 {
    public static void main(String[] args) {
        oneToN(5);
    }
    static void oneToN(int n){
        if(n == 0){
            // oneToN(m, n);
            return;
        }
        oneToN(n - 1);
        System.out.println(n);
    }

}
