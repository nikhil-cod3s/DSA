public class PlusOne {
    public static void main(String[] args){
        int[] numbers = {9};
        plusOneToDigit(numbers);

    }
    public static int[] plusOneToDigit(int[] array){
        int len = array.length;
        int concetinatedElem = 0;
        for(int i = 0; i < len ; i++){
            int digit = array[i];
            concetinatedElem = concetinatedElem * 10 + digit;
        }
        concetinatedElem++;
        String concNum = Integer.toString(concetinatedElem);
        int[] resultArray = new int[concNum.length()];
        for(int i = 0 ; i < concNum.length() ; i++){
            resultArray[i] = Character.getNumericValue(concNum.charAt(i));
        }

        return resultArray;
    }
}
