public class Calc {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        showNumb(a, b);
        addNumb(a, b);
        subNumb(a, b);
        multNumb(a, b);

    }

    public static void showNumb(int a, int b) {

        System.out.println("Liczby:\t" + a + "  ,  " + b);

    }

    public static void addNumb(int a, int b) {

        System.out.println("Dodawanie:\t\t" + (a + b));
    }

    public static void subNumb(int a, int b) {

        System.out.println("Odejmowanie:\t" + (a - b));
    }

    public static void multNumb(int a, int b) {

        System.out.println("Mnożenie:\t\t" + (a * b));
    }



}

