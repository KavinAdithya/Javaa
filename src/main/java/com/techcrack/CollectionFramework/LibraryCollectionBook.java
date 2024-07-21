package com.techcrack.CollectionFramework;

import java.util.*;


/*
    * It is used to handle the book operation
    * Such As managing the books uniquely using hashset.
    * Searching a book based on ISBN number -> searchBook(ISBN).
    * Displaying the number of books -> sizeOfBooks().
    * Displaying the List Of books -> listOfBooks().
    * Adding Books to a list -> addBook().
    * Deleting or Removing a book from the list -> removeBook(ISBN).
 */

public class LibraryCollectionBook {

    // The Set has been encapsulated, and it will store the object belongs to the Books class.
    // It was final because it will not allow modifying the references initialized.
    private final Set<Books> books;

    // Default Constructor to initialize the set Collection During Object Creation.
    public LibraryCollectionBook(){
        books = new HashSet<>();
    }

    // Adding a Book to the set books.
    // @Param Book Object is given to add the set or list.
    public void addBook(Books book){
        if(book == null)
            throw new IllegalArgumentException("Book reference doesn't refer any actual object.");
        books.add(book);
    }

    // Removing a book using ISBN.
    public void removeBook(String ISBN){
        if(ISBN == null)
            throw new IllegalArgumentException("ISBN number is empty.");
        //iterating the books set
        books.removeIf(book -> book.getISBN().equals(ISBN));
    }

    // Search a book and display it based on ISBN.
    // @Param ISBN is used to identify the object uniquely and print it.
    // @Return when object found based on ISBN it will return actual object else it will return null.
    public Books searchBook(String ISBN){
        if(ISBN == null)
            return null;

        // Iterating through the set
        for(Books book : books){

            //Checking the book isbn and given matches if we found print and break it
            // because it is a set contains only unique books ISBN.
            if(book.getISBN().equals(ISBN))
                return book;

        }

        return null;
    }

    // This method is used to display the list of books.
    public void listOfBooks(){

        //Iterating the set to print the books
        for(Books book : books)
            System.out.println(book);
    }


    // Counting the number of books presents using the size method provided by the set.
    // @Return returning the count of the books.
    public int sizeOfBooks(){
        return books.size();
    }

    // Driver Mode for the LibraryCollectionBooks.
    public static void main(String[] args){
        LibraryCollectionBook libraryCollectionBook = new LibraryCollectionBook();

        Books books1 = new Books("123", "Java", "James", 1278945.34);

        Books books2 = new Books("344", "Programming", "Gosling", 784522369.365);

        libraryCollectionBook.addBook(books1);
        libraryCollectionBook.addBook(books2);
        libraryCollectionBook.addBook(books1);

        libraryCollectionBook.listOfBooks();

        System.out.println(libraryCollectionBook.searchBook("23"));
        libraryCollectionBook.listOfBooks();
        libraryCollectionBook.removeBook("123");

        libraryCollectionBook.listOfBooks();

        System.out.println("The Number of books available is : " + libraryCollectionBook.sizeOfBooks());
    }
}
