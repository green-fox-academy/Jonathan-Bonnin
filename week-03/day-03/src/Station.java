public class Station {

    int gasAmount = 999999;

    void refill(Car car){

        System.out.println("Refilling...");
        gasAmount -= car.capacity;
        car.gasAmount = car.capacity;
    }

}
