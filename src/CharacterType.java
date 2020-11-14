public class CharacterType {


    public static void checkAscii(char c) {
        System.out.println("Kod ASCII znaku:" + c + "  to: " + (int) c);
    }

    public static void main(String[] args) {

        checkAscii('|');
        checkAscii('B');
        checkAscii('%');
        checkAscii('ą');
        checkAscii('Ą');


    }
}
