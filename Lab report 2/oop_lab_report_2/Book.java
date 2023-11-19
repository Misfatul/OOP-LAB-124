package oop_lab_report_2;
public class Book {
  private String title;
  private String author;
  private int isbn;

  public Book(String title, String author, int isbn)
  {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
  public int getISBN() {
    return isbn;
  }

  public void setTitle(int isbn) {
    this.isbn = isbn;
  }
}

