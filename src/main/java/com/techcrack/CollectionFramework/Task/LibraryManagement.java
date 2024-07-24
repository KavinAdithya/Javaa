package com.techcrack.CollectionFramework.Task;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
/*
    * It is used to manipulate and retrieve the books efficiently
    * ConcurrentHashMap used to store and efficiently and maintains duplicate free books
    * addBooks() books are mapped key-value pairs
    * Key - ISBN
    * Value - Book Object
    * removeBook() Used to remove the books from hash
    * searchBook() Search Book by ISBN number
    * listBooks() sorted by title
    * countBooks() count the number of books present
    * filterByPrice() filter the books based on the price range
 */
public class LibraryManagement {

    private final Map<String, Book> books;

    // Default Constructor to initialize the book object during object creation
    public LibraryManagement() {
        this.books = new ConcurrentHashMap<>();
    }

    // @Param Book object to add into the map
    // Adding the Book to the hashMap
    public void addBooks(Book book) {
        if (book == null)
            throw new IllegalArgumentException("Book is Not Valid");
        books.put(book.getISBN(), book);
    }

    // @Param ISBN to remove the book object from the map
    public void removeBook(String ISBN) {

        // Checking the given string is null if empty exception
        // second checking the book has been successfully removed in case of failure
        // remove method return null and throw an exception
        if (ISBN == null || books.remove(ISBN) == null)
            throw new IllegalArgumentException("ISBN number is not Available .");
    }

    // @Param ISBN to retrieve the object
    // Search the book Using ISBN
    public void searchBook(String ISBN) {

        // Checking the edge case
        // if the string is empty then throwing the string input is a wrong Exception
        if (ISBN == null || ! books.containsKey(ISBN))
            throw new IllegalArgumentException("ISBN number is not Available");

        // Printing the book details
        System.out.println("The Book is found and the further " +
                "details of book is given Below : \n"
                + books.get(ISBN));
    }

    // list the books available in the list
    public void listOfBooks() {
        // Creating priority queue from map to sort the books and print it
        Queue<Book> listOfBooks = new PriorityQueue<>(books.values());

        // Checking the queue is empty or not
        if(listOfBooks.isEmpty()) {
            System.out.println("There is no books Available Right Now.");
            return;
        }

        // printing the list of books which are sorted based on the book title
        listOfBooks.forEach(System.out :: println);
    }


    // count the number of books present in the map
    public void countBooks() {

        // Checking the map is empty or not to count the number of books in the library
        if(books.isEmpty())
            System.out.println("Books are not available ?! Now>>>>");
        else
            System.out.println("Total Numbers of books available in library is : " + books.size());
    }

    // @Param starting price of the book
    // @Param ending price of the book
    // filter the books by price
    public void filterByPrice(double startingPrice, double endingPrice) {

        // Checking the given staring and ending price are non-negative
        if (startingPrice <= 0 || endingPrice <= 0)
            throw new IllegalArgumentException("Invalid Price Amount.");

        // filtering the books and printing the books based on the price
        new ArrayList<>(books.values())
                .stream()
                .filter(book -> book.getPrice() >= startingPrice && book.getPrice() <= endingPrice)
                .forEach(System.out :: println);
    }

    public static void main(String[] args){
        LibraryManagement library = new LibraryManagement();

        Book book1 = new Book("123", "Java Programming", "James Gosling", 100.0);
        Book book2 = new Book("456", "Effective Java", "Joshua Bloch", 200.0);
        Book book3 = new Book("789", "Clean Code", "Robert C. Martin", 150.0);

        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);

        library.listOfBooks();
        library.countBooks();
        library.filterByPrice(200.0, 300.00);

        library.listOfBooks();
        library.searchBook("123");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                library.removeBook("789");
            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                library.searchBook("789");
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);

        thread.start();
        thread1.start();
    }
}
