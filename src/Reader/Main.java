package Reader;

public class Main {
    public static void main(String[] args) {
        Reader Ilya = new Reader("Ilya","C223","SE-2207","29.05.2004","87777777777");
        String[] someBooks = {"Brideshead Revisited", "Mathematics", "Logic"};
        Book book1 = new Book("Brideshead Revisited", "Evelyn Waugh");
        Book book2 = new Book("Mathematics", "Isaac Newton");
        Book[] anotherBooks = {book1, book2};
        Ilya.takeBook(3);
        Ilya.takeBook(someBooks);
        Ilya.takeBook(anotherBooks);
        Ilya.returnBook(3);
        Ilya.returnBook(someBooks);
        Ilya.returnBook(anotherBooks);
    }
}