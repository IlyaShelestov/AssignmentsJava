package Cars.com.company.vehicles;

import Cars.com.company.details.Engine;
import Cars.com.company.professions.Driver;

public class Lorry extends Car{
    private int carrying;

    public Lorry(String carBrand, String carClass, double weight, Driver driver, Engine motor, int carrying) {
        super(carBrand, carClass, weight, driver, motor);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCarry: " + carrying;
    }
}
