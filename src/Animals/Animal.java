package Animals;

class Animal {
    private String food;
    private String location;
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    void makeNoise() {
        System.out.println("Animal is making noise.");
    }
    void sleep() {
        System.out.println("Animal is sleeping.");
    }
    void eat() {
        System.out.println("Animal is eating.");
    }
    public String getFood() {
        return food;
    }
    public String getLocation() {
        return location;
    }
}
