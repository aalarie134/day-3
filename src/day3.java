import java.io.*;
import java.util.*;

public class day3 {

    public static void main(String args[]) throws FileNotFoundException {

        File file = new File("input.txt");
        counter[] count = new counter[12];

        for(int j = 0 ; j < 12 ; j++){
            count[j] = new counter();
        }
//        while (scan.hasNext()) {
//            char[] line = scan.next().toCharArray();
//            System.out.println(Arrays.toString(line));
//            for (int k = 0; k < 12; k++) {
//                    count[k].add(line[k]);
//            }
//        }
//        int[] answer = new int[12];
//        for( int i = 0 ; i < 12 ; i++){
//            if(count[i].getNumber0() > count[i].getNumber1()){
//                answer[i] = 0;
//            }
//            else{
//                answer[i] = 1;
//            }
//        }

//        System.out.println(Arrays.toString(answer));
//        double end = converter.convert(answer) * converter.convert(converter.flip(answer));
//        System.out.println(end);

        // PART 2
        int number = 0;
        int iteration = 1;
        int[] memoryMax= new int[12];
        int[] memoryMin =  new int[12];
        while( number != 1) {
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                number = 0;
                char[] line = scan.next().toCharArray();
//                System.out.println(Arrays.toString(line));
                for (int k = 0; k <= iteration; k++) {
                    if(iteration == 1 || line[k] == memoryMax[k]) {
                        count[k].add(line[k]);

                        if( number == 0) {
                            char[] tempMax = line;
                        }
                        number++;
                    }
                }
                if(count[iteration].getNumber0() > count[iteration].getNumber1()){
                    memoryMax[iteration] = 0;
                }
                else{
                    memoryMax[iteration] = 1;
                }
            }
            iteration++;
        }


    }
}
