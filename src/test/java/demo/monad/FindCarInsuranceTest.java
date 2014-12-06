package demo.monad;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindCarInsuranceTest {

    public String findCarInsurance(Person person) {
        if (person != null) {
            Car car = person.getCar();
            if (car != null) {
                Insurance insurance = car.getInsurance();
                if (insurance != null) {
                    return insurance.getName();
                }
            }
        }
        return "Unkonwn";
    }

    public String case2(Person person) {
        if (person == null) {
            return "Unkonwn";
        }
        Car car = person.getCar();
        if (car == null) {
            return "Unkonwn";
        }
        Insurance insurance = car.getInsurance();
        if (insurance == null) {
            return "Unkonwn";
        }
        return insurance.getName();

    }

}
