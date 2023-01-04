package Cars.com.company.details;

public class Engine {
    private int power;
    private String company;
    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }
    public String toString() {
        return "\nPower: " + power + "\nCompany: " + company;
    }
}
