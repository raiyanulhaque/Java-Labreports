class LibraryBook { 
    String title; 
    String author; 
    String bookID; 
    LibraryBook(String title, String author, String bookID) {         
        this.title = title;         
        this.author = author;         
        this.bookID = bookID; 
    } 
    void displayBookInfo() { 
        System.out.println("Book Title: " + this.title); 
        System.out.println("Author: " + this.author); 
        System.out.println("Book ID: " + this.bookID); 
        System.out.println(); 
    } 
    public static void main(String[] args) { 
        LibraryBook book1 = new LibraryBook("Java Programming", "Daemon","B101"); 
        LibraryBook book2 = new LibraryBook("Data Structures", "Samiul", "B102");         
        book1.displayBookInfo();         
        book2.displayBookInfo(); 
    } 
} 
