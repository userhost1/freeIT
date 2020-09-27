package homework07.Transport;

abstract class Transport {

    protected int horsePower;
    protected int maxSpeed;
    protected int weightKG;
    protected String brand;

    protected Transport(int horsePower, int maxSpeed, int weightKG, String brand) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weightKG = weightKG;
        this.brand = brand;
    }

    protected double getKWPower() {
        return 0.74 * horsePower;
    }
}