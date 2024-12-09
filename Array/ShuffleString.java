public class ShuffleString{
    public static void main(String[] args) {
        String str = " codeleet";
        int[] indeces = {4,5,6,7,0,2,1,3};
        System.out.println(shuffle(str,indeces));

    }

    private static String shuffle(String str, int[] indeces) {
        str = str.trim();//remove unwanted spaces from the string
        char result[] = new char[str.length()];//our finally String, but intially an array
        for(int i = 0 ; i < str.length(); i++){//traverse through the string
            result[indeces[i]] = str.charAt(i);//add the elements in the new array from string, usingg the charAt method
            //the line of code has a logic that in the result array at index of 'i' we will add or insert the element using the indecess
                    }
        
        return new String(result);//return a new string derives from the result array
    }
}