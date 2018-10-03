import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<Animal> collectionOfAnimals = new ArrayList<>();
    int slots = 255;

    void breed(){
        if(slots <= 255){
            collectionOfAnimals.add(new Animal());
        } else {
            System.out.println("Sorry, this is an 8-bit farm");
        }

    }

    void slaughter(){

        if (collectionOfAnimals.size() > 0){
            int hunger = collectionOfAnimals.get(0).hunger;
            Animal leastHungryAnimal = collectionOfAnimals.get(0);
            for (Animal animal : collectionOfAnimals) {
                if (hunger < animal.hunger){
                    leastHungryAnimal = animal;
                }
            }

            collectionOfAnimals.remove(leastHungryAnimal);
            System.out.println("Save grass, kill a cow");
        }

    }

}
