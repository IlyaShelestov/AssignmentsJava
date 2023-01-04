package Animals;

public class Main {
    public static void main(String[] args) {
        Cat someCat = new Cat("Fish", "Egypt", "Green");
        Dog someDog = new Dog("Meat", "USA", 11);
        Horse someHorse = new Horse("Apple", "Kazakhstan", 1.6);
        Animal[] animals = {someCat, someDog, someHorse};
        Veterinary vet = new Veterinary();
        for (Animal i: animals) {
            vet.treatAnimal(i);
        }
    }
}
