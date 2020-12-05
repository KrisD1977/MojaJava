public class NumberSystemOperations {

    public static void main(String[] args) {

        int a = 10;
        int b = 010;
        int c = 0x10;
        int d = a + b - c;

        System.out.println(a + " " + b +" " + c);
        System.out.println(d + " dziesiętnit to binarnie:" + Integer.toBinaryString(d));

    }
}
