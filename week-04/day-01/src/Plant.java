public abstract class Plant {

    String color;
    double water;
    boolean isThirsty;

    Plant(String color) {
        this.color = color;
        this.water = 0;
        this.isThirsty = true;
    }

    abstract void waterPlant(double water);

}
