import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> garden = new ArrayList<>();
    private double thristyPlants = 0;

    void add(Plant plant) {
        garden.add(plant);
        thristyPlants++;
    }

    void waterThePlants(double water) {
        System.out.println("Watering with " + (int) water);

        if (thristyPlants > 0) {
            for (Plant plant : garden) {
                if (plant.isThirsty) {
                    plant.waterPlant(water / thristyPlants);
                    if (!plant.isThirsty) {
                        thristyPlants--;
                    }
                }
            }
        }
        situation();
    }

    void situation() {
        for (Plant plant : garden) {
            System.out.println("The "
                    + plant.color
                    + " "
                    + plant.getClass().getName()
                    + (plant.isThirsty ? " needs" : " doesn't need")
                    + " water");
        }
        System.out.println();
    }
}
