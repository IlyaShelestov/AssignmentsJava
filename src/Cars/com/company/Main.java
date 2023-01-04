package Cars.com.company;

import Cars.com.company.details.Engine;
import Cars.com.company.professions.Driver;
import Cars.com.company.vehicles.Lorry;

public class Main {
    public static void main(String[] args) {
        Engine motor = new Engine(23, "SomeCompany");
        Driver Maksim = new Driver("Maksim", 48, 5);
        Lorry lorry = new Lorry("SomeBrand", "SomeClass", 235, Maksim, motor, 40);
        System.out.println(lorry.toString());
    }
}
