package com.techcrack.Generics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


/*
    * This Class is used for managing the items such as Book or magazine.
    * It Has Three methods which perform several tasks.
    * addItems() method adds item to the set.
    * removeItems() method removes an item from the set.
    * listAllElements() method display all the elements in the list.
*/
public class Library<T extends LibraryItem<T>> {

    // Set Reference tio hold the hashset object which holds the item reference
    private final Set<T> listOfItems ;

    // Default Constructor to create a hashset it handles an exception
    // In case it fails to instantiate a set, then it will throw anm exception to object creator.
    // To maintain the consistency
    public Library() throws InstantiationException{

        // Handling the Exception
        try {

            // Instantiating It
            listOfItems = new LinkedHashSet<>();
        }catch(Exception e) {

            // Throwing an exception
            throw new InstantiationException("Object Creation failed!!");
        }
    }


    // @param item adding an item to the set
    // @return if successfully added, it will return true or false
    public boolean addItem(T item) {
        // Handling Exception
        try {
            listOfItems.add(item);
            return true;
        }
        catch(Exception e) {
            // Exception occurs indicating failed to insert a item into the set
            return false;
        }
    }

    // @param id which is used to uniquely identify object and remove it
    // @return if successfully removed, it will return true or else it will return false
    public boolean removeItem(int id) {

        // Handling Exception
        try {

            // Iterating the set
            for (LibraryItem<T> item : listOfItems) {
                // If item matches with a given item, then it will be removed
                if (item.getId() == id) {
                    // Item removing from the set
                    listOfItems.remove(item);

                    // Object removed successfully
                    return true;
                }
            }

            //  Object Not Found
            return false;
        }
        catch(Exception e) {
            // Exception message and return false
            return false;
        }
    }

    // Iterating the set and printing all the elements
    public void listAllItems() {

        // Iterating the elements
        for (T listOfItem : listOfItems) {
            // printing the object
            System.out.println(listOfItem);
        }
    }


    // @param list of items where we needed to search it
    // @param String description about the item we needed to find the object which matches it description and print it.
    public void searchItem( String description) {

        // Iterating the object
        for (LibraryItem<?> item : listOfItems) {
            // Checking the description, and it matches means print and exit the function
            if (item.getDescription().equals(description)) {
                System.out.println(item);
                return;
            }
        }

    }

    // Driver for Demonstrating this application
    public static void main(String[] args)  {
        try {
            Library<Book> library = new Library<>();
            for (int i = 0; i < 10; i++) {
                library.addItem(new Book("Java version " + i, "James Gosling",  "1234 " + i, "" + (2005 + i), "Book" + i, i, "Great Book" + i));
            }

            System.out.println("Before Removing");
            library.listAllItems();
            System.out.println();
            System.out.println("****************************************************************************************************");
            System.out.println();
            System.out.println("After Removing Object");
            library.removeItem(2);
            library.listAllItems();

            library.searchItem( "Great Book7");

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("****************************************************************************************************");
        System.out.println();


        try {
            Library<Magazine> library = new Library<>();
            for (int i = 0; i < 10; i++) {
                library.addItem(new Magazine( i, "Excellent Magazine " + i,  "Atomic Habits " + i, 100 + i, "March " + i, "" + (2000 + i)  , "James Clear"));
            }

            System.out.println("Before Removing");
            library.listAllItems();
            System.out.println();
            System.out.println("****************************************************************************************************");
            System.out.println();
            System.out.println("After Removing Object");
            library.removeItem(2);
            library.listAllItems();

            library.searchItem("Excellent Magazine 7");

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
