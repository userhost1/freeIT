package homework07.Transport;

public class LandTransport extends Transport {
    protected int wheels;
    protected int fuelConsumption100kmH;

    public LandTransport(int wheels, int fuelConsumption100kmH, int horsePower, int maxSpeed, int weightKG, String brand) {
        super(horsePower, maxSpeed, weightKG, brand);
        this.wheels = wheels;
        this.fuelConsumption100kmH = fuelConsumption100kmH;
    }
}
