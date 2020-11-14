public class Vars {


    public int i ; // pole


    public static void main(String[] args) {

        int number = 150;

        System.out.println(" Nasza liczba to " + number + ".");
        System.out.println(" Nasza liczba jest o " + (number - 8) + " większa od liczby 8.");
        System.out.println(" Jeżeli naszą liczbę pomnożymy przez 5 to otrzymamy " + (number * 5) + ".");

        Vars v = new Vars();
        System.out.println(v.i);

        float z = 33334.3449343333333f;
        double x = 23.1234567890123456789;

        System.out.println( +z + "," + x );

        char s = 124;
        System.out.println(  s );


    }
}
