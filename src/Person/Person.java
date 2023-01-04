package Person;

class Person {
    private String fullName;
    private int age;
    public void move(){
        //It wasn't mentioned what we need to write in "move" method, so I decided to write that:
        System.out.println(fullName + " is moving.");
    }
    public void talk(String firstPerson){
        //Person talking with Person.
        System.out.println(firstPerson + " and " + fullName + " is talking.");
    }
    public Person(String fullName, int age){
        this.age = age;
        this.fullName = fullName;
    }
    public Person(){}
}
