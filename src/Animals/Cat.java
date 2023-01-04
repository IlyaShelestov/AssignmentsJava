package Animals;

class Cat extends Animal{
    String eyesColor;
    public Cat(String food, String location, String eyesColor) {
        super(food, location);
        this.eyesColor = eyesColor;
    }
    @Override
    void sleep() {
        System.out.println("Cat is sleeping.");
    }
    @Override
    void eat() {
        System.out.println("Cat is eating.");
    }
    @Override
    void makeNoise() {
        System.out.println("Cat is meowing.");
    }
}
