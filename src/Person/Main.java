package Person;

public class Main {
    public static void main(String[] args) {
        Person Ilya = new Person();
        Person Rauan = new Person("Rauan", 18);
        Rauan.move();
        Rauan.talk("Ilya");
    }
}