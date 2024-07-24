package com.techcrack.CollectionFramework.Task;

import java.util.Objects;

/*
    * Book class used to store the book attributes and perform operation on it.
    * ISBN Attribute Uniquely Identify the Book
    * title Attribute Book title name
    * Author Attribute Author of the book
    * price Attribute Price of the book
    * Comparable to defining the natural order of sorting of books
 */
public class Book implements Comparable<Book> {

    private String ISBN;
    private String title;
    private String author;
    private double price;

    // Parameterized Constructor For Initializing the book details
    public Book(String ISBN, String title, String author, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters And Setters for performing operations on instance states

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Equals method override due to comparison on object states

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Double.compare(getPrice(), book.getPrice()) == 0 && Objects.equals(getISBN(), book.getISBN()) && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    // Override the hashcode method to make the objects remains in consistent state
    @Override
    public int hashCode() {
        return Objects.hash(getISBN(), getTitle(), getAuthor(), getPrice());
    }

    // Natural ordering the book class based on the title of the book
    @Override
    public int compareTo(Book book){
        return String.CASE_INSENSITIVE_ORDER.compare(this.title, book.title);
    }

    // Override the toString method to print the attributes when object reference is printed
    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
