package oop_lab_report_2;
public class Main {
  public static void main(String[] args) {
    Library library = new Library();
    Book book1 = new Book("A Man Called Ove", 
           "Fredrik Backman",5263);
    Book book2 = new Book("The Rosie Project",
            "Graeme Simsion", 5523);
    Book book3 = new Book("The Little Paris Bookshop",
            "Nina George", 1857);
    Book book4 = new Book("Where'd You Go, Bernadette",
            "Maria Semple", 5624);

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addBook(book4);

    System.out.println("Books in the library:");
    for (Book book: library.getBooks()) {
      System.out.println("Title: "+book.getTitle());
      System.out.println("Author: "+book.getAuthor());
      System.out.println("ISBN: "+book.getISBN());
      
    }

    library.removeBook(book4);
    System.out.println("\nBooks in the library after removing " 
            + book4.getTitle() + ":");
    for (Book book: library.getBooks()) {
      System.out.println("Title: "+book.getTitle());
      System.out.println("Author: "+book.getAuthor());
      System.out.println("ISBN: "+book.getISBN());
    }
  }
}
