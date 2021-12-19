public class comparator {

    public static boolean comparison( char[] one , char[] two , int max){

        for(int i = 0 ;  i < max ; i++){
            if( one[i] != two[i]){
                return false;
            }

        }
        return true;

    }


}
