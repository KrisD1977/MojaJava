import java.awt.*;
import java.util.Locale;

public class Rob {

    public static void main(String[] args) {

        int accountBalance= 15_005;
        System.out.printf("saldo: %,d zł%n", accountBalance );

        // operacje formatowania dla stringów printf
        // d - decimal int
        // f - float
        // t - time-date
        // n - new line
        // bB - boolean
        // s - strings
        // wiki printf - szeroki opis

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf(new Locale("us"),"PI = %.11f%n" ,  pi); // wyświetlona z 11 miejscami po przecinku





       /* int firstPrice = 100;
        int secondPrice = 70;

        int higherPrice = Math.max(firstPrice,secondPrice);

        System.out.println(higherPrice);*/


        /*int x = 1;
        int y = 2;

        boolean test = (y++ < 1) & (x-- > 0);
        System.out.println(test);
        System.out.println(y);
        System.out.println(x);
        System.out.println( ""+ 1 + 2);*/

/*
        Point point = new Point(1,2);
        Point point2 = new Point(2,3);



        point2= point;

        point2.y = 9;

        System.out.println(point.x +"" +point.y);
        System.out.println(point2.x +"" + point2.y);*/
    }
}
