package homework07.part2task26Appliances;

public class KitchenTechnics extends BigTechnics {

    private boolean forCooking;

    protected KitchenTechnics(int height, int width, String name, String brand, String model, int powerWT, boolean forCooking) {

        super(height, width, name, brand, model, powerWT);
        this.forCooking = forCooking;
    }

    protected String informationCooking() {

        if (forCooking) {
            return name + " предназначен(а) для приготовления еды.";
        }
        return name + " непредназначен(а) для приготовления еды.";
    }

    protected String canFit(int wholeHeight, int wholeWidth) {
        if (wholeHeight <= super.height || wholeWidth <= super.width) {
            return "Проем мал для установки оборудование.";
        } else if (wholeHeight == super.height + 1 && wholeWidth == super.width + 1) {
            return "Проем отлично подходит для установки оборудования.";
        } else {
            return "Ваше оборудование маловато в размере для установки.";
        }
    }

    @Override
    public String toString() {

        return "KitchenTechnics{" +
                "forCooking=" + informationCooking() +
                ", height=" + height +
                ", weight=" + width +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", powerWT=" + powerWT +
                '}';
    }
}
