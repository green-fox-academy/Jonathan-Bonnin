import java.util.ArrayList;
import java.util.List;

public class Carrier {

    List<Aircraft> aircraftList = new ArrayList<>();
    int ammoStored;
    int HP;

    Carrier(int ammoStored, int HP) {
        this.ammoStored = ammoStored;
        this.HP = HP;
    }

    void add(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

    void fill() {

        // loops through aircrafts and fills the ones which have priority first
        for (Aircraft aircraft : aircraftList) {
            if (aircraft.hasPriority() && ammoStored > 0) {
                ammoStored = aircraft.refill(ammoStored);
            }
        }

        // loops through aircrafts and fills the ones which don't have priority
        for (Aircraft aircraft : aircraftList) {
            if (!aircraft.hasPriority() && ammoStored > 0) {
                ammoStored = aircraft.refill(ammoStored);
            }
        }

        if (ammoStored == 0) {
            System.out.println("We're out of ammo, Jim!");
        }
    }

    String fight(Carrier enemyCarrier) {

        //hits the enemy carrier with all aircrafts
        for (Aircraft aircraft : aircraftList) {
            enemyCarrier.HP -= aircraft.fight();
        }

        // gets hit by all enemy aircrafts
        for (Aircraft enemyAircraft : enemyCarrier.aircraftList) {
            HP -= enemyAircraft.fight();
            if (HP <= 0) {
                return "It's dead Jim :(";
            }
        }

        return getStatus();

    }

    String getStatus() {
        return "HP: " +
                HP +
                ", Aircraft Count: " +
                aircraftList.size() +
                ", Ammo Storage: " +
                ammoStored +
                ", Total damage: " +
                getAllDamage() +
                "\nAircrafts:\n" +
                getStatusOfAllAircrafts();

    }

    private String getStatusOfAllAircrafts() {
        String allStatus = "";
        for(Aircraft aircraft : aircraftList){
            allStatus += aircraft.getStatus() + "\n";
        }
        return allStatus;
    }

    private int getAllDamage() {
        int totalDamage = 0;
        for (Aircraft aircraft : aircraftList) {
            totalDamage += aircraft.baseDamage * aircraft.currentAmmo;
        }
        return totalDamage;
    }


//    It should give back a string about it's and all of its aircrafts status like:
//
//    HP: 5000, Aircraft count: 4, Ammo Storage: 2300, Total damage: 2280
//    Aircrafts:
//    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//    Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
//    Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
//    If the health points are 0 than it should give back: It's dead Jim :(
}
