public class NP2 {

    public static void main(String[] args) {

        int i = 123;

        System.out.println("dziesiętnie:\t" + i);
        System.out.println("------------------------");
        System.out.println("binarnie:\t\t" +Integer.toBinaryString(i));
        System.out.println("ósemkowo:\t\t" +Integer.toOctalString(i));
        System.out.println("szesnastkowo:\t" + Integer.toHexString(i));
    }
}
