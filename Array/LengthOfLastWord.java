public class LengthOfLastWord {
    public static void main(String[] args){
        String str = "luffy is still joyboy"; // example string from leetcode
        int len = countLength(str);
        System.out.println("the length of the last word in the string " + str + " is " + len);
    }

    private static int lenOfLastWord(String str) {
        int number = 0; //length of the last word in numbers we say it ig?
        if(str.charAt(str.length() - 1) == ' '){
            str = str.trim();//this step will ensure that the string does'nt have any unwanted spaces at the start or end!!
        }
        
        for(int i = str.length() - 1; i >= 0; i--){
            char c = str.charAt(i);
            //this 'c' will traverse through the string in reverse order
            if(c != ' '){
                number++;//we will increment the length variable 'number' by one 
            }
            else if(c == ' '){
                break;//if char 'c' reaches a blank space the loop breaks!
            }
        }
        return number;    //we return the final value of length in numbers
    }
    public static int countLength(String s){
        int len = 0;
        for(int i = s.length() - 1; i < 0; i--){
            char ch = s.charAt(i);
            if(ch != ' '){
                len++;
            }
            else if( ch == ' '){
                break;
            }
            
        }
        return len;
    }
}
