package homework07.Transport;

public class FreightTransport extends LandTransport {
    protected int liftingCapacity;

    public FreightTransport(int liftingCapacity, int wheels, int fuelConsumption100kmH, int horsePower, int maxSpeed, int weightKG, String brand) {
        super(wheels, fuelConsumption100kmH, horsePower, maxSpeed, weightKG, brand);
        this.liftingCapacity = liftingCapacity;

    }

    @Override
    public String toString() {
        return "FreightTransport{" +
                "liftingCapacity=" + liftingCapacity +
                ", wheels=" + wheels +
                ", fuelConsumption=" + fuelConsumption100kmH +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", weightKG=" + weightKG +
                ", brand='" + brand + '\'' +
                ", kWPower=" + getkWPower() + '}';
    }

    protected double getkWPower() {
        return 0.74 * horsePower;
    }

    protected String checkMaxLiftingCapacity(int capacity) {
        if (capacity <= liftingCapacity) {
            return "Грузовик загружен";
        }
        return "Вам нужен грузовик побольше";
    }

}
