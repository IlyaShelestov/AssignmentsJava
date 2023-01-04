package Cars.com.company.professions;

public class Driver extends Person {
    private int experience;
    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }
    @Override
    public String toString() {
        return super.toString() + "\nExperience: " + experience + " years";
    }
}
