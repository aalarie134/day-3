public class counter {
    private int number1;
    private int number0;
    private int length;
    public counter(){
        length = 12;
        number0 = 0;
        number1 = 0;
    }

    public int getLength() {
        return length;
    }

    public int getNumber0() {
        return number0;
    }

    public int getNumber1() {
        return number1;
    }

    public void add(char text){
        if( text == '1' ){
            number1++;
        }

        if( text == '0') {
            number0++;
        }
    }
}
