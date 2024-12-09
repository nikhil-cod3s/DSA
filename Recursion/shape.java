public class shape {
    public static void main(String[] args){
        shaper(5);
    }
    public static void shaper(int n){
        String result = "";
        if(n == 1){
            return;
        }
        result += "*";
        System.out.println(result);
        shaper(n - 1);
        System.out.println(result);
    
    }
}

