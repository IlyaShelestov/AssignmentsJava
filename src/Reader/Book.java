package Reader;

class Book {
    private String name;
    private String authorName;
    public Book(String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
    }
    public String getName() {
        return name;
    }
}
