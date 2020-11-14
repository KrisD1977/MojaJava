public class NumberPresenter {


    public static void main(String[] args) {

        int i = 123;  //deklaracja zmiennej lokalnej

        showInt(i);
        showIntAsBinary(i);
        showIntAsOctal(i);
        showIntAsHex(i);
    }

    public static void showInt(int i) {
        System.out.println("dziesiętnie: \t" + i);
        System.out.println("------------------------");
    }

    public static void showIntAsBinary(int i) {

        System.out.println("binarnie: \t\t" + Integer.toBinaryString(i));
    }

    public static void showIntAsOctal(int i) {

        System.out.println("ósemkowo: \t\t" + Integer.toOctalString(i));
    }

    public static void showIntAsHex(int i) {

        System.out.println("szesnastkowo: \t" + Integer.toHexString(i));
    }
}

//public class NumberPresenter {
//
//    public static void main(String[] args) {
//
//        int i = 123;
//
//        System.out.println("dziesiętnie:\t" + i);
//        System.out.println("------------------------");
//        System.out.println("binarnie:\t\t" +Integer.toBinaryString(i));
//        System.out.println("ósemkowo:\t\t" +Integer.toOctalString(i));
//        System.out.println("szesnastkowo:\t" + Integer.toHexString(i));
//    }
//}

