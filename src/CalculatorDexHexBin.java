public class CalculatorDexHexBin {

    int a;
    int b;
    int c;

    void decNumbers() {
        c = a * b;
        System.out.println("Dziesiętnie liczby to:\t\n" + "a = " + a + "\nb = " + b);
        System.out.println("a * b =\t" + c);
    }

    void binNumbers() {
        c = a * b;
        System.out.println("\nBinarnie:\na = " + Integer.toBinaryString(a) + "\nb = " + Integer.toBinaryString(b));
        System.out.println("a * b = " + Integer.toBinaryString(c));
    }

    void octalNumbers() {
        c = a * b;
        System.out.println("\nÓsemkowo:\na = " + Integer.toOctalString(a) + "\nb = " + Integer.toOctalString(b));
        System.out.println("a * b = " + Integer.toOctalString(c));
    }

    void hexNumbers() {
        c = a * b;
        System.out.println("\nSzestnastkowo:\na = " + Integer.toHexString(a) + "\nb = " + Integer.toHexString(b));
        System.out.println("a * b = " + Integer.toHexString(c));
    }


    public static void main(String[] args) {

        CalculatorDexHexBin test = new CalculatorDexHexBin();

        test.a = 13;
        test.b = 2;

        test.decNumbers();
        test.binNumbers();
        test.octalNumbers();
        test.hexNumbers();

    }
}
