public class converter {

    public static double convert(int[] table){
        double answer = 0;
        for( int i = 11 ; i >= 0 ; i--){
            answer = answer + Math.pow( 2 , 11 - i) * table[i];
        }
        return answer;
    }

    public static int[] flip(int[] table){
        int[] answer = new int[table.length];
        for(int i = 0 ; i < table.length ; i++){
            if( table[i] == 1){
                answer[i] = 0;
            }
            else{
                answer[i] = 1;
            }
        }
        return answer;
    }

}
