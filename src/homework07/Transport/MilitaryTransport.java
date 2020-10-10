package homework07.Transport;

public class MilitaryTransport extends AirTransport {
    protected boolean catapult;
    private int rockets;

    public MilitaryTransport(boolean catapult, int rockets, int wingspan, int minDistanceForTakeoff, int horsePower, int maxSpeed, int weightKG, String brand) {
        super(wingspan, minDistanceForTakeoff, horsePower, maxSpeed, weightKG, brand);
        this.catapult = catapult;
        this.rockets = rockets;

    }

    @Override
    public String toString() {
        return "MilitaryTransport{" +
                "catapult=" + catapult +
                ", rockets=" + rockets +
                ", wingspan=" + wingspan +
                ", minDistanceForTakeoff=" + minDistanceForTakeoff +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", weightKG=" + weightKG +
                ", brand='" + brand + '\'' +
                ", kWPower=" + getKWPower() + '}';
    }

    public double getKWPower() {
        return 0.74 * horsePower;
    }

    protected String rocketShot() {

        if (rockets > 0) {
            rockets--;
            return "Ракета пошла…";
        }
        return "Боеприпасы отсутствуют";
    }

    protected String doCatapult() {
        if (catapult) {
            return "Катапультирование прошло успешно";
        }
        return "У вас нет такой системы";
    }


}
