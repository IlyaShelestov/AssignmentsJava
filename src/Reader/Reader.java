package Reader;

class Reader {
    private String fullName;
    private String cardNumber;
    private String faculty;
    private String birthDate;
    private String phone;
    public Reader(String fullName, String cardNumber, String faculty, String birthDate, String phone) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }
    void takeBook(int amountOfBooks){
        System.out.println(fullName + " took " + amountOfBooks + " books.");
    }
    void takeBook(String ...books) {
        System.out.print(fullName + " took books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i != books.length-1) {
                System.out.print(", ");
            }
            else {System.out.println();}
        }
    }
    void takeBook(Book ...books) {
        System.out.print(fullName + " took books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getName());
            if (i != books.length-1) {
                System.out.print(", ");
            }
            else {System.out.println();}
        }
    }
    void returnBook(int amountOfBooks){
        System.out.println(fullName + " returned " + amountOfBooks + " books.");
    }
    void returnBook(String ...books) {
        System.out.print(fullName + " returned books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i != books.length-1) {
                System.out.print(", ");
            }
            else {System.out.println();}
        }
    }
    void returnBook(Book ...books) {
        System.out.print(fullName + " returned books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getName());
            if (i != books.length-1) {
                System.out.print(", ");
            }
            else {System.out.println();}
        }
    }
}
