public class RemoveA{
    public static void main(String[] args){
        removeAs1("" ,"bcacad");
    }
    public static void removeAs1(String strProc, String strUnProc){
        if(strUnProc.isEmpty()){
            System.out.println(strProc);
            return;
        }
        char ch = strUnProc.charAt(0);
        if(ch == 'a'){
            removeAs1(strProc,strUnProc.substring(1));
        }else{
            removeAs1(strProc + ch, strUnProc.substring(1));

        }
    }

}