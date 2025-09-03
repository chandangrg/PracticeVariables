package practiceVariable;

class Book {
    String title;
    String author;
    static int bookCount = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookCount++;
    }

    public void printBookInfo() {
        int serialNumber = bookCount; // local variable
        System.out.println("Book Serial: " + serialNumber);
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        b1.printBookInfo();
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien");
        b2.printBookInfo();
    }
}
