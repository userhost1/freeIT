package homework07.Transport;

public class LightTransport extends LandTransport {

    protected String bodyType;
    protected int countPassengers;

    public LightTransport(String bodyType, int countPassengers, int wheels, int fuelConsumption100kmH, int horsePower, int maxSpeed, int weightKG, String brand) {
        super(wheels, fuelConsumption100kmH, horsePower, maxSpeed, weightKG, brand);
        this.bodyType = bodyType;
        this.countPassengers = countPassengers;
    }

    @Override
    public String toString() {
        return "LightTransport{" +
                "countPassengers=" + countPassengers +
                ", wheels=" + wheels +
                ", fuelConsumption100kmH=" + fuelConsumption100kmH +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", weightKG=" + weightKG +
                ", brand='" + brand + '\'' +
                ", kWPower=" + getKWPower() + '}';
    }

    protected String getFuelConsumptionOverAPeriodOfTime(double hours) {
        return "За время " + hours + " ч, автомобиль " + brand + '\n' +
                "двигаясь с максимальной скоростью " + maxSpeed + " км/ч" + '\n' +
                "проедет " + hours * maxSpeed + " км и израсходует " + getFuelConsumptionKM(hours) + " литров топлива.";
    }

    private double getFuelConsumptionKM(double hours) {
        return (hours * maxSpeed / 100) * fuelConsumption100kmH;
    }
}
