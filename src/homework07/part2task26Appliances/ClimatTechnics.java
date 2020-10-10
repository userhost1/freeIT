package homework07.part2task26Appliances;

public class ClimatTechnics extends BigTechnics {

    protected int maxHeating;
    protected int minutesForHeating;
    private boolean cooling;

    protected ClimatTechnics(int height, int weight, String name, String brand, String model, int powerWT, int maxHeating, int minutesForHeating, boolean cooling) {

        super(height, weight, name, brand, model, powerWT);
        this.maxHeating = maxHeating;
        this.minutesForHeating = minutesForHeating;
        this.cooling = cooling;
    }

    protected String informationAboutCooling() {

        if (cooling) {
            return "Есть функция охлаждения";
        }
        return "Нет функции охлаждения";
    }

    @Override
    public String toString() {

        return "ClimatTechnics{" +
                "maxHeating=" + maxHeating +
                ", minutesForHeating=" + minutesForHeating +
                ", cooling=" + informationAboutCooling() +
                ", height=" + height +
                ", weight=" + width +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", powerWT=" + powerWT +
                '}';
    }
}
