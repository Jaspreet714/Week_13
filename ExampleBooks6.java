class Book {
    String title;
    String author;
    int numberOfPages;
    String ISBN;

    Book (String T, String A, int P) {

    title = T;
    author = A;
    numberOfPages = P;
    ISBN = "unknown"; 
    }
}
class ExampleBooks6 {

    public static void main (String []args) {

        Book b1, b2;

        b1 = new Book("Thinking in Java", "Bruce Eckel", 1129);
        b2 = new Book("THinking in Java", "Bruce Echel", 1129);

        if(b1 == b2) {
            System.out.println("These two books are the same.");
        } else {
            System.out.println("The two books are different.");
        }
    }
}