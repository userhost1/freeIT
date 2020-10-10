package homework07.part2task26Appliances;

public class HouseTechnics extends LittleTechnics {

    protected HouseTechnics(String name, String brand, String model, int powerWt) {
        super(name, brand, model, powerWt);
    }

    @Override
    public String toString() {
        return "HouseTechnics{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", powerWT=" + powerWT +
                '}';
    }
}
