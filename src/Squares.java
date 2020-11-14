public class Squares {


    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int c = 7;
        int d = 11;

        System.out.println("Pole kwadratu o boku: " + a + " wynosi: " + (a * a) + ", jego obwód:" + (4 * a) + " a przekątna: " + (a * Math.sqrt(2)));
        System.out.println("Pole kwadratu o boku: " + b + " wynosi: " + (b * b) + ", jego obwód:" + (4 * b) + " a przekątna: " + (b * Math.sqrt(2)));
        System.out.println("Pole kwadratu o boku: " + c + " wynosi: " + (c * c) + ", jego obwód:" + (4 * c) + " a przekątna: " + (c * Math.sqrt(2)));
        System.out.println("Pole kwadratu o boku: " + d + " wynosi: " + (d * d) + ", jego obwód:" + (4 * d) + " a przekątna: " + (d * Math.sqrt(2)));


        a = 5;
        System.out.println("Pole kwadratu o boku: " + a + " wynosi: " + (a * a) + ", jego obwód:" + (4 * a) + " a przekątna: " + (a * Math.sqrt(2)));

        a = 7;
        System.out.println("Pole kwadratu o boku: " + a + " wynosi: " + (a * a) + ", jego obwód:" + (4 * a) + " a przekątna: " + (a * Math.sqrt(2)));

        a = 11;
        System.out.println("Pole kwadratu o boku: " + a + " wynosi: " + (a * a) + ", jego obwód:" + (4 * a) + " a przekątna: " + (a * Math.sqrt(2)));


        double square;
        double perimeter;
        double diagonal;

        int x = 2;

        diagonal =  (x * Math.sqrt(2));
        square = x * x;
        perimeter = x * x;



        System.out.println(" Kwadrat o boku:" + x);
        System.out.println(" Pole kwadratu:" + square + ", obwód:" + perimeter + ", a przekątna:" + diagonal);


    }


}
