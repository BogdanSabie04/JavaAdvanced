package examples.car;

public class Car extends Vehicle {
    @Override
    public String getIdentity(String vehicle) {
        return null;
    }

    public String getIdentity() {
        return  message + "Car";
    }
}