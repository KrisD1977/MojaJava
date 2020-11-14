public class MarsApplication {

    public static void main(String[] args) {

        MarsRobot spirit = new MarsRobot();
        spirit.name = "Spirit";
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        System.out.println(" Robot spirit: ");
        spirit.showAttributes();

        System.out.println(" Zwiększenie prędkości do 3");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println(" Zmniejszenie temp do - 90");
        spirit.temperature = -90;
        spirit.showAttributes();

        spirit.checkTemperature();
        spirit.showAttributes();


        MarsRobot opportunity = new MarsRobot();
        opportunity.name = "Opportunity ";
        opportunity.status = " eksploracja ";
        opportunity.speed = 4;
        opportunity.temperature = -100;


        System.out.println("   ");
        System.out.println(" Robot opportunity: ");
        opportunity.checkTemperature();
        opportunity.showAttributes();
        opportunity.checkStatus();


    }
}
