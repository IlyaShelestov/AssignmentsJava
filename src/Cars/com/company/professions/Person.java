package Cars.com.company.professions;

public class Person{
    private String fullName;
    private int age;
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public String toString() {
        return "\nAge: " + age + "\nName: " + fullName;
    }
}
