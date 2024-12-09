
public class HappyNumber {
    public static void main(String[] args){
        int number = 19;
     boolean result = isHappy(number);
     System.out.println(result);
    }

 
    private static boolean isHappy(int number) {
        if(number == 1){
            return true;
        }
        
        // int tens =  (number / 10) % 10;
        // int ones = number % 10;
        // int squaredOnes = (int)Math.sqrt(ones);
        // int squaredTens = (int)Math.sqrt(tens);
       
        // if(number != 1){
        //     number = squaredOnes + squaredTens;
        //     isHappy(number);
        // }
        while(number > 0){
            int digit = number % 10 ;
            int sum = 0;
            sum = sum + (digit * digit);
            number /= 10;
            isHappy(sum);
        }
        return false;
    }
}
