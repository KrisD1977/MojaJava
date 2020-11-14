import java.util.Objects;

public class MarsRobot implements Robot {

    String status;
    String name;
    int speed;
    float temperature;

    public void checkTemperature() {

        if (temperature < -80) {
            status = " Powrót do bazy ";

            speed = 5;

        }

    }

    public void showAttributes() {

        System.out.println(" Nazwa:" + name);
        System.out.println(" Status:" + status);
        System.out.println(" Prędkość:" + speed);
        System.out.println(" Temperatura:" + temperature);


    }

    public void checkStatus() {
        System.out.println(" Status: " + status);


    }
    /*@Override
    public boolean equals(Object o) {
        return ((MarsRobot)o).status == status;
    }*/




    // alt + Insert - implementacja

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarsRobot marsRobot = (MarsRobot) o;
        return speed == marsRobot.speed &&
                Float.compare(marsRobot.temperature, temperature) == 0 &&
                Objects.equals(status, marsRobot.status) &&
                Objects.equals(name, marsRobot.name);
    }*/

    }




