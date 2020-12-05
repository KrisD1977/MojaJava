public class ReferenceTester {

    public static void main(String[] args) {

        Student studentA = new Student();
        studentA.name = "Tomek";
        studentA.age = 21;

        Student studentB = new Student();
        studentB.name = "Iwona";
        studentB.age = 25;


        Student studentC = studentB;
        studentB.name = "Agnieszka";
        studentC.age = 40;

        studentB = studentA;
        studentC = null;

        System.out.println(studentA);
        System.out.println(studentB);
        System.out.println(studentC);

        System.out.println();
        show(studentA);
        show(studentB);
        show(studentC);


    }

    static void show (Student s) {
        if (s !=null) {

            System.out.println("Student imię:" + s.name + ", wiek:" + s.age);
        } else {
            System.out.println("Uwaga obiekt to null");
        }


    }
}
