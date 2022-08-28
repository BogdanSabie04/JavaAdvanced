package examples.car;

public class Bike extends Vehicle {

    @Override
    public String getIdentity(final String vehicle) {
        return "This is a cool " + vehicle;
    }

    public String getIdentity() {
        return message + "Bike";
    }


}
