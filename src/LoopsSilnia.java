import java.math.BigInteger;

public class LoopsSilnia {

    public static void main(String[] args) {



        int a= 17;
        int fact =1 ;


      /*  if (args.length > 0) {
            a = Integer.parseInt(args[0]);

        }*/

        for ( int i =1; i <= a ; i++) {


             fact = fact * i ;

        }

        System.out.println("silnia Liczby: " + a + " wynosi: " + fact );
    }
}
