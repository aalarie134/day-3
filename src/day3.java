import java.io.*;
import java.util.*;

public class day3 {

    public static void main(String args[]) throws FileNotFoundException {

        File file = new File("input.txt");
        Scanner scan = new Scanner(file);
        counter[] count = new counter[12];

        for(int j = 0 ; j < 12 ; j++){
            count[j] = new counter();
        }
        while (scan.hasNext()) {
            char[] line = scan.next().toCharArray();
            for (int i = 0; i < line.length; i++) {
                    count[i].add(line[i]);
            }
        }
        int[] answer = new int[12];
        for( int i = 0 ; i < 12 ; i++){
            if(count[i].getNumber0() > count[i].getNumber1()){
                answer[i] = 0;
            }
            else{
                answer[i] = 1;
            }
        }

        double end = converter.convert(answer);
        System.out.println(end);

    }
}
