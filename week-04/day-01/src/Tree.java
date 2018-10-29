public class Tree extends Plant {

    Tree(String color) {
        super(color);
    }

    @Override
    void waterPlant(double water) {
        this.water += water * 0.4;
        isThirsty = this.water < 10 ? true : false;

    }
}

