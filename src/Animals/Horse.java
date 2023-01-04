package Animals;

class Horse extends Animal{
    double height;
    public Horse(String food, String location, double height) {
        super(food, location);
        this.height = height;
    }
    @Override
    void sleep() {
        System.out.println("Horse is sleeping.");
    }
    @Override
    void eat() {
        System.out.println("Horse is eating.");
    }
    @Override
    void makeNoise() {
        System.out.println("Horse is neighing.");
    }
}
