public abstract class Aircraft {

    int maxAmmo;
    int baseDamage;
    int currentAmmo;

    Aircraft(){
        currentAmmo = 0;
    }

    int fight(){
        int usedAmmo = currentAmmo;
        currentAmmo = 0;
        return usedAmmo * baseDamage;
    }

    int refill(int refillQuantity){
        currentAmmo = refillQuantity < maxAmmo ? refillQuantity : maxAmmo;
        return refillQuantity < maxAmmo ? 0 : refillQuantity - maxAmmo;
    }

    String getType(){
        return getClass().getName();
    }

    String getStatus(){
        return "Type " +
                getType() +
                ", Ammo: " +
                currentAmmo +
                ", Base Damage: " +
                baseDamage +
                ", All Damage: " +
                currentAmmo * baseDamage;
    }

    boolean hasPriority(){
        return this.getType().equals("F35") ? true : false;
    }

}
