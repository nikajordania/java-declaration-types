package enumerators;

class Book {
    String name;
    Type bookType;
    String author;

    Book(String name, String author, Type type) {
        bookType = type;
        this.name = name;
        this.author = author;
    }
}
