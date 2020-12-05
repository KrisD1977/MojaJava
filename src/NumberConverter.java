import java.util.Scanner;

public class NumberConverter {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        String number = scanner.next();

        Long  result = 0L;

        for (int i = 0; i <number.length() ; i++) {
            char c = number.charAt(i);
            int b = Character.getNumericValue(c);

            int revIndex = number.length() - i-1;

            result = b * (int)Math.pow(2,revIndex) + result;


        }
        System.out.println(result);




    }
}
