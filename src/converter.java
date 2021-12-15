public class converter {

    public static double convert(int[] table){
        double answer = 0;
        for( int i = 11 ; i >= 0 ; i--){
            answer = answer + Math.pow( 2 , 11 - i);
        }
        return answer;
    }
}
