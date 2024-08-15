package com.techcrack.collectionFramework;

import java.util.*;

/*
    * It is responsible for manipulating and retrieving the books
    * Using HashMap to increase the performance on performing operation on a collection
    * addBook() used to add the book to list
    * removeBook() used to remove the book from list
    * searchBook() used to search for a book
    * listBooks() used to display the list of book
    * getTotalBooks() used to count the list of books
 */
public class LibraryManagement {

    // Storing all objects as key value ISBN as key and book as Value
    private final Map<String, Books> books ;

    // Default Constructor used to instantiate the book reference during object creation
    public LibraryManagement() {
        books = new HashMap<>();
    }

    // @Param A book object to add to the collection
    // Adds the Book to the map collection\
    public void addBook(Books book) {

        // checking the given object is not null
        if (book == null)
            throw new IllegalArgumentException("Cannot Add the book due to empty reference");
        books.put(book.getISBN(), book);
    }

    // @Param ISBN uniquely identify object
    // Based on ISBN book removed from a collection
    public void removeBook(String ISBN) {

        // Handling an edge case of null ISBN
        if (ISBN == null)
            throw new IllegalArgumentException("Invalid ISBN Number");

        // removing the book if not found displaying the message
        if (books.remove(ISBN) == null)
            System.out.println("Given ISBN Not Found");
    }

    // @Param ISBN uniquely identify the object
    // @Return returns book which matches ISBN
    // Based on ISBN search on map and retrieve the object
    public Books searchBook(String ISBN) {

        // Checking ISBN is valid
        if (ISBN == null)
            throw new IllegalArgumentException("Invalid ISBN Number");

        //Searching the book
        return books.get(ISBN);
    }

    // Display the list of books
    public void listBooks(){

        // Iterating the books
        for(Map.Entry<String, Books> entrySet : books.entrySet())
            System.out.println(entrySet.getValue());
    }

    // @Return return the number of books
    // used to retrieve the number of book presents
    public int getTotalBooks(){
        return books.size();
    }

    // Driver method for library management
    public static void main(String[] args){
        LibraryManagement libraryManagement = new LibraryManagement();
        Books books1 = new Books("1", "Java Programming", "James Gosling", 100000.00);
        Books books2 = new Books("2", "C programming", "Dennis Ritche",780235.23);

        libraryManagement.addBook(books1);
        libraryManagement.addBook(books2);

        System.out.println(libraryManagement.searchBook("1"));

        libraryManagement.listBooks();

        libraryManagement.removeBook("2");

        libraryManagement.listBooks();

        System.out.println("Number of Books is : " + libraryManagement.getTotalBooks());

    }
}
