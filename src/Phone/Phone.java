package Phone;

class Phone {
    private String number;
    private String model;
    private int weight;

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String receiveCall(String name) {
        return name + " is ringing";
    }

    public String receiveCall(String name, String number) {
        return name + " with number " + number + " is ringing.";
    }
}