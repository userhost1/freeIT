package homework07.Transport;

public class CivilTransport extends AirTransport {
    protected int countPassengers;
    protected boolean businessClass;

    public CivilTransport(int countPassengers, boolean businessClass, int wingspan, int minDistanceForTakeoff, int horsePower, int maxSpeed, int weightKG, String brand) {
        super(wingspan, minDistanceForTakeoff, horsePower, maxSpeed, weightKG, brand);
        this.countPassengers = countPassengers;
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return "СivilTransport{" +
                "businessClass=" + businessClass +
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

    protected String checkMaxCountPassengers(int count) {
        if (count <= countPassengers) {
            return "Самолет загружен";
        }
        return "Вам нужен самолет побольше";
    }
}
