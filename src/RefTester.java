import java.awt.*;

public class RefTester {

    public static void main(String[] args) {

        Point pt1, pt2;
        pt1 = new Point(100,100);
        pt2 = new Point(100,100);

        System.out.println("punkt 1 :" +pt1.x + "," + pt1.y);
        System.out.println("punkt 2 :" +pt2.x + "," + pt2.y);



        System.out.println(pt1 == pt2); // dotyczy miejsca w pamięci
        System.out.println(pt1.equals(pt2)); // dotyczy wartości i jest zaimplementowana do klasy Point

        MarsRobot r1 = new MarsRobot();
        MarsRobot r2 = new MarsRobot();

        System.out.println("Porównanie robotów:  " + r1.equals(r2)); // nie jest zaimplementowana do klasy MarsRobot

        // i dla niej ma domyślna wartość Object == object
    }
}
