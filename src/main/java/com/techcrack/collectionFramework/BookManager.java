package com.techcrack.collectionFramework;


import java.util.ArrayList;
import java.util.List;

// Book class For storing book attributes and performing operations
class Book{
    private String isbn;
    private String title;
    private String author;
    private double price;

    Book(String isbn, String title, String author, double price){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn){
        this.isbn = isbn;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "{  ISBN Number : " + isbn + " Title : " + title + " Author : " + author + " Price : " + price + " }";
    }
}

//Book manager is responsible to manage the book collections that mean this class is the driver for handle books
public class BookManager {
    private final List<Book> books;

    BookManager(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(String isbn){
        books.removeIf(book -> isbn.equalsIgnoreCase(book.getISBN()));
        displayBooks();
    }

    public void displayBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }

    public static void main(String[] args){
        BookManager bookManager = new BookManager();
        bookManager.addBook(new Book("12", "Java Programming", "James Gosling", 89000.23));
        bookManager.displayBooks();

        Book book = new Book("123", "C Programming", "Dennis Ritche", 100000.23);

        bookManager.addBook(book);

        bookManager.displayBooks();
        bookManager.removeBook("123");

        bookManager.displayBooks();
    }


}
