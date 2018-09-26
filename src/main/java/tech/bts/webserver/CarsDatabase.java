package tech.bts.webserver;

import java.util.Arrays;
import java.util.List;

public class CarsDatabase {


    public static String getCars() {

        String header = "<h1>Rent a car</h1>";
        String header2 = "<h2>Available cars</h2>";
        String body = "<p>Brand - Max Speed</p>";

        Car audi = new Car("Audi A3", 150);
        Car audi2 = new Car("Audi Q2", 170);
        Car ford = new Car("Ford Fiesta", 130);
        Car mercedes = new Car("Mercedes GLA", 180);
        Car seat = new Car("Seat Leon", 150);

        List<Car> cars = Arrays.asList(audi, audi2, ford, mercedes, seat);

        String result = header + header2 + body;
        for (Car car : cars) {
            result = result + "<p>" + car + "</p>";
        }

        return result;
    }
}
