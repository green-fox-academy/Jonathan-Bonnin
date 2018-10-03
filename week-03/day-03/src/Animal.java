public class Animal {
    int hunger;
    int thirst;

    Animal(){
        this.hunger = 50;
        this.thirst = 50;
    }

    void eat(){
        hunger--;
    }

    void drink(){
        thirst--;
    }

    void play(){
        hunger++;
        thirst++;
    }
}
