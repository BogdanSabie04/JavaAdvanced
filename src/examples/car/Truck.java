package examples.car;

public class Truck extends Vehicle {

    @Override
    public String getIdentity(String vehicle) {
        return null;
    }

    public String getIdentity() {
        return message + "Truck";
    }
}