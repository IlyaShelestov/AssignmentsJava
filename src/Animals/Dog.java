package Animals;

class Dog extends Animal{
    int scentPower;
    public Dog(String food, String location, int scentPower) {
        super(food, location);
        this.scentPower = scentPower;
    }
    @Override
    void sleep() {
        System.out.println("Dog is sleeping.");
    }
    @Override
    void eat() {
        System.out.println("Dog is eating.");
    }
    @Override
    void makeNoise() {
        System.out.println("Dog is barking.");
    }
}
