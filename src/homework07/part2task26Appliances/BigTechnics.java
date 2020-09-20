package homework07.part2task26Appliances;

public class BigTechnics extends Appliances {

    int height;
    int width;

    protected BigTechnics(int height, int weight, String name, String brand, String model, int powerWT) {
        super(name, brand, model, powerWT);
        this.height = height;
        this.width = weight;
    }

}
