package Cars.com.company.vehicles;

import Cars.com.company.details.Engine;
import Cars.com.company.professions.Driver;

public class SportCar extends Car{
    private double speed;

    public SportCar(String carBrand, String carClass, double weight, Driver driver, Engine motor, double speed) {
        super(carBrand, carClass, weight, driver, motor);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeed: " + speed;
    }
}
