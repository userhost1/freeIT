package  homework07.Transport;

public class AirTransport extends Transport {
    protected int wingspan;
    protected int minDistanceForTakeoff;

    public AirTransport(int wingspan, int minDistanceForTakeoff, int horsePower, int maxSpeed, int weightKG, String brand) {
        super(horsePower, maxSpeed, weightKG, brand);
        this.wingspan = wingspan;
        this.minDistanceForTakeoff = minDistanceForTakeoff;
    }

}
