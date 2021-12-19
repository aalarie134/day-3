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
        int iteration = 0;
        char[] memoryMax= new char[12];
        char[] memoryMin =  new char[12];
        char[] tempMax = new char[12];
        char[] tempMin = new char[12];
        while( number != 1) {
            Scanner scan = new Scanner(file);
            number = 0;
            while (scan.hasNext()) {
                char[] line = scan.next().toCharArray();
//                System.out.println(Arrays.toString(line));
//                for (int k = 0; k <= iteration; k++) {
//                    System.out.println(k);
                    if(iteration == 0 || comparator.comparison(line , memoryMax, iteration)){
                        count[iteration].add(line[iteration]);

                        if( number == 0) {
                             tempMax = line;
                        }
                        number++;
                    }
//                }
//                System.out.println(number);
                if(count[iteration].getNumber0() == count[iteration].getNumber1()){
                    memoryMax[iteration] = '1';
                }
                else if(count[iteration].getNumber0() > count[iteration].getNumber1()){
                    memoryMax[iteration] = '0';
                }
                else{
                    memoryMax[iteration] = '1';
                }
//                System.out.println(number);
            }
//            System.out.println(memoryMax[iteration]);
//            System.out.println(iteration);
            iteration++;
        }

        System.out.println(tempMax);

        number = 0;
        iteration = 0;
        for(int j = 0 ; j < 12 ; j++){
            count[j] = new counter();
        }
        while( number != 1) {
            Scanner scan = new Scanner(file);
            number = 0;
            while (scan.hasNext()) {
                char[] line = scan.next().toCharArray();
//                System.out.println(Arrays.toString(line));
//                for (int k = 0; k <= iteration; k++) {
//                    System.out.println(k);
                    if(iteration == 0 || comparator.comparison(line , memoryMin, iteration)) {
                        count[iteration].add(line[iteration]);

                        if( number == 0) {
                            tempMin = line;
                        }
                        number++;
                    }
//                }
//                System.out.println(number);
                if(count[iteration].getNumber0() == count[iteration].getNumber1()){
                    memoryMin[iteration] = '0';
                }
                else if(count[iteration].getNumber0() > count[iteration].getNumber1()){
                    memoryMin[iteration] = '1';
                }
                else{
                    memoryMin[iteration] = '0';
                }
            }
            System.out.println(iteration);
            iteration++;
        }

        System.out.println(tempMin);

    }
}
