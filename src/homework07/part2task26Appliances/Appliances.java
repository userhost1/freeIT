package homework07.part2task26Appliances;

abstract class Appliances {

    protected String name;
    protected String brand;
    protected String model;
    protected int powerWT;
    private boolean state;

    protected Appliances(String name, String brand, String model, int powerWT) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.powerWT = powerWT;

    }

    protected String turnOn() {
        state = true;
        return name + " включается";
    }

    protected String turnOff() {
        state = true;
        return name + " выключается";
    }

    protected String checkState() {
        if (state) {
            return name + " включен(а)";
        }
        return name + " выключен(а)";
    }

}
