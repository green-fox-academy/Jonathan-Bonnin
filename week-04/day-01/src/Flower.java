public class Flower extends Plant {

    Flower(String color) {
        super(color);
    }

    @Override
    void waterPlant(double water) {
        this.water += water * 0.75;
        isThirsty = this.water < 5 ? true : false;
    }
}
