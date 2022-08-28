import examples.car.Bike;
import examples.car.Car;
import examples.car.Truck;
import examples.car.Vehicle;
import examples.movies.Comedy;
import examples.movies.Horror;
import examples.movies.Movie;

public class Main {
    public static void main(String[] args) {

        Vehicle bike = new Bike();
        System.out.println(bike.getIdentity("Mountain Bike"));

        Vehicle car = new Car();
        System.out.println(car.getIdentity());

        Vehicle truck = new Truck();
        System.out.println(truck.getIdentity());

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = bike;
        vehicles[1] = car;
        vehicles[2] = truck;

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getIdentity());
        }

        Movie firstMovie = new Horror();
        firstMovie.setLengthInMinutes(12);
        firstMovie.setTitle("Plutea o moara pe Siret");
        //firstMovie.setType("Horror");

        Movie secondMovie = new Horror();
        secondMovie.setLengthInMinutes(62);
        secondMovie.setTitle("Ca toporul la fund");
        //firstMovie.setType("Horror");

        Movie thirdMovie = new Comedy();
        thirdMovie.setLengthInMinutes(83);
        thirdMovie.setTitle("I was a world champion");
        //firstMovie.setType("Comedy");

        System.out.println("------------");

        Movie[] movies = new Movie[]{firstMovie, secondMovie, thirdMovie};
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getLengthInMinutes() >= 60) {
                System.out.println(movies[i].getTitle());
            }
        }
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].makeSound() + " - " + movies[i].getTitle());
        }
    }
}