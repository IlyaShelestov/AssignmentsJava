package Inheritance;

class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;
    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        return (averageMark == 5 ? 100 : 80);
    }

    public double getAverageMark() {
        return averageMark;
    }
}
