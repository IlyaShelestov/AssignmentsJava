package Cars.com.company.vehicles;
import Cars.com.company.professions.Driver;
import Cars.com.company.details.Engine;
public class Car {
    private String carBrand;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine motor;
    public Car(String carBrand, String carClass, double weight, Driver driver, Engine motor) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
    }
    public void start() {
        System.out.println("Let's go");
    }
    public void stop() {
        System.out.println("Let's stop");
    }
    public void turnRight() {
        System.out.println("Turn right");
    }
    public void turnLeft() {
        System.out.println("Turn left");
    }
    public String toString() {
        return "Brand: " + carBrand + "\nClass: " + carClass + "\nWeight: " + weight + "\nDriver: " + driver.toString() + "\nMotor: " + motor.toString();
    }
}
