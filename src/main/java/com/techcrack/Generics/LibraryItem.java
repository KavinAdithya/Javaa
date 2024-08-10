package com.techcrack.Generics;

/*
    * This class is superclass for item.
    * it was two fields.
    * id represent the unique number for identifying the item.
    * description it provides details about the item.
    * fields are encapsulated to maintain the security reasons.
    * Using the POJO for accessing the fields and updating it.
*/


public class LibraryItem<T> {

    // id for identifying the item uniquely
    private int id;

    // Description about the item
    private String description;

//     Parameterized Constructor to initialize the fields during the object creation
    public LibraryItem(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public LibraryItem() {
    }

    // GetId() method to retrieve the id value
    // @return id value
    public int getId() {
        return id;
    }

    // @param updating the id with new id
    public void setId(int id) {
        this.id = id;
    }

    // getting the description of item
    // @return a string type returning the description attribute.
    public String getDescription() {
        return description;
    }

    // @param Updating the description of the item
    public void setDescription(String description) {
        this.description = description;
    }
}