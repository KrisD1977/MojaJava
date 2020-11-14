public class Calculator {

    int a;
    int b;

    void showNumbers() {
        System.out.println("Nasze liczby to:  " + a + "\toraz\t" + b);
    }

    void addNumbers() {
        System.out.println(+a + " + " + b + " = " + (a + b));
    }

    void multipleNumbers() {
        System.out.println(+a + " * " + b + " = " + (a * b));
    }

    void subtractNumbers() {
        System.out.println(+a + " - " + b + " = " + (a - b));
    }

    public static void main(String[] args) {

        Calculator testowy = new Calculator();

        testowy.a = 13;
        testowy.b = 2;

        testowy.showNumbers();
        testowy.addNumbers();
        testowy.subtractNumbers();
        testowy.multipleNumbers();


    }

}
// Ver.   alternatywna

//public class Calc {
//
//    public static void main(String[] args) {
//
//        int a = 1;
//        int b = 2;
//
//        showNumb(a, b);
//        addNumb(a, b);
//        subNumb(a, b);
//        multNumb(a, b);
//
//    }
//
//    public static void showNumb(int a, int b) {
////        System.out.println("Liczby:\t" + a + "  ,  " + b);
////    }
//
//    public static void addNumb(int a, int b) {
////        System.out.println("Dodawanie:\t\t" + (a + b));
//    }
//
//    public static void subNumb(int a, int b) {
////        System.out.println("Odejmowanie:\t" + (a - b));
//    }
////    public static void multNumb(int a, int b) {
////        System.out.println("Mnożenie:\t\t" + (a * b));
//    }
//
//}
