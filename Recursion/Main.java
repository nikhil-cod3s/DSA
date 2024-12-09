public class Main {
    public static void main(String[] args) {
        int[] num = {1, 3, 2, 5, 4, 7, 9};
        Sorting(num);
        for(int i = 0; i < num.length;i++ ){
            System.out.println(num[i]);
        }  
    }
    public static void Sorting(int[] array){
        int temp = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                if ( array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
