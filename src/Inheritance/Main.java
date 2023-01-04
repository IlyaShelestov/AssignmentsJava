package Inheritance;

public class Main {
    public static void main(String[] args) {
        Student Alexey = new Student("Alexey", "Prohorov","SE-2210", 4.5);
        Student Mark = new Student("Mark", "Jackson", "CS-2201", 5.0);
        Aspirant Bob = new Aspirant("Bob", "Vladov", "SE-2207", 3.57);
        Aspirant Kazyna = new Aspirant("Kazyna", "Someone", "CS-2122", 5.0);
        Student[] students = {Alexey, Mark, Bob, Kazyna};
        for (Student i: students) {
            System.out.println(i.getScholarship());
        }
    }
}
