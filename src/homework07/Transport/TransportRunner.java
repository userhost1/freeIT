package homework07.Transport;

public class TransportRunner {
    public static void main(String[] args) {

        LightTransport honda = new LightTransport("Coupe", 4, 4, 12, 200, 260, 2000, "Honda");

        System.out.println();
        System.out.println(honda.getFuelConsumptionOverAPeriodOfTime(3.5));

        System.out.println();
        System.out.println(honda.toString());

        System.out.println();
        FreightTransport man = new FreightTransport(25000, 18, 35, 500, 160, 9000, "MAN");
        System.out.println(man.toString());
        System.out.println(man.checkMaxLiftingCapacity(25001));

        System.out.println();
        CivilTransport airplane = new CivilTransport(250, true, 70, 3000, 2500, 1000, 75000, "Boeing");
        System.out.println(airplane.toString());
        System.out.println(airplane.checkMaxCountPassengers(300));

        System.out.println();
        MilitaryTransport f37 = new MilitaryTransport(true, 10, 35, 1000, 2000, 2200, 14000, "F37");
        System.out.println(f37.toString());
        System.out.println(f37.rocketShot());
        System.out.println(f37.doCatapult());

    }
}
