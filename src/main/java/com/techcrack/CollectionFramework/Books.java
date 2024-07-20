package com.techcrack.CollectionFramework;

import java.util.Objects;


//It is a class
public class Books {

    //Book Attributes
    private String ISBN = null;
    private String title = null;

    private String author = null;

    private double price = 0.00;

    // Parameterized Constructor
    public Books(String ISBN, String title, String author, int price){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //POJO for ISBN
    public String getISBN(){
        return ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    //Pojo for the Title of a book
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    //Pojo for Author
    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    //Pojo for price
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "ISBN Number : " + ISBN + " Title  : " + title + " Author : " + author + " Price : " + price;
    }

    @Override
    public boolean equals(Object o){
        if(o == null)
            throw new ExceptionInInitializerError("Empty Object Cannot be compared !!!!");
        Book book = (Book)o;

        return book.getISBN().equals(this.ISBN) && book.getTitle().equals(this.title) &&
                book.getAuthor().equals(this.author);
    }
     @Override
    public int hashCode(){
        return Objects.hash(ISBN);
     }

}
