package practiceVariable;

class LibraryMember {
    int memberId;
    String memberName;
    int booksBorrowed;

    public LibraryMember(int id, String name) {
        this.memberId = id;
        this.memberName = name;
        this.booksBorrowed = 0;
    }

    public void borrowBooks(int count) {
        int maxBooksAllowed = 5; // local variable
        if (booksBorrowed + count <= maxBooksAllowed) {
            booksBorrowed += count;
            System.out.println(memberName + " borrowed " + count + " books. Total: " + booksBorrowed);
        } else {
            System.out.println(memberName + " cannot borrow more than " + maxBooksAllowed + " books.");
        }
    }

    public static void main(String[] args) {
        LibraryMember m1 = new LibraryMember(101, "David");
        m1.borrowBooks(3);
        m1.borrowBooks(4);
    }
}