
public class Main {

    public static int numberOfBits(int number){
        int count = 0;
        while (number > 0){
            count += ((number & 1) == 0) ? 0 : 1;
            number = number >> 1 ;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfBits(10));
    }
}