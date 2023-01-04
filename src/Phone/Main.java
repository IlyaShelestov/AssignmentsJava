package Phone;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("87502231290", "iPhone", 225);
        Phone samsung = new Phone("87759012341","Samsung",230);
        Phone nokia = new Phone("87759810291","Nokia", 300);
        System.out.println("iPhone: " + " " + iPhone.getNumber() + " " + iPhone.getModel() + " " + iPhone.getWeight());
        System.out.println("Samsung: " + " " + samsung.getNumber() + " " + samsung.getModel() + " " + samsung.getWeight());
        System.out.println("Nokia: " + " " + nokia.getNumber() + " " + nokia.getModel() + " " + nokia.getWeight());
        System.out.println(iPhone.receiveCall("Ilya"));
        System.out.println(iPhone.receiveCall("Ilya", "87756822509"));
    }
}