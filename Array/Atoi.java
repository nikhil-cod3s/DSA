
public class Atoi {
    public static void main(String[] args) {
        String num = "42";
        System.out.println(myAtoi(num));
    }
    public static int myAtoi(String s){
        int num = 0;
        s = s.trim();
        for(int i = 0; i < s.length(); i++){
            int digit = s.charAt(i);
            num = num * 10 + digit;
            
        }
        return num;
    }

}

