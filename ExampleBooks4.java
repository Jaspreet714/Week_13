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

public String getInitials() {
    String initials = "";
    for(int i = 0; i < author.length(); i++) {
    char currentChar = author.charAt(i);
    if (currentChar >= 'A' && currentChar <='Z')
    initials = initials + currentChar + '.';
    }
    return initials;                
         }
 }
     class ExampleBooks4 {
        public static void main (String []args) {

        Book b;
        
        b = new Book("Thinking in Java", "Bruce Eckel", 1129);
        System.out.println("Initials: " + b.getInitials());

    }
}

