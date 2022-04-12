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
     class ExampleBooks5 {
        public static void main (String []args) {

        Book[] a = new Book[3];
        a[0] = new Book("Thinking in Java", "Bruce Eckel", 1129);
        a[1] = new Book("Java in a nutshell", "David Flanagan", 353);
        a[2] = new Book("Java newtork programming", "Elliott Rusty Harold", 649);

        for(int i = 0; i < a.length; i++) {
            System.out.println("Initials: " + a[i].getInitials());
        }
    }
}
