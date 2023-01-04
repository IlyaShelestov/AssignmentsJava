package Inheritance;

class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarship() {
        return (getAverageMark() == 5 ? 200 : 180);
    }
}
