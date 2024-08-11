package com.techcrack.Generics;

/*
    * This class is superclass for item.
    * it was two fields.
    * id represent the unique number for identifying the item.
    * description it provides details about the item.
    * fields are encapsulated to maintain the security reasons.
    * Using the POJO for accessing the fields and updating it.
*/


import java.util.Objects;

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


    // Checking the object is equal or not
    // default Method has been override
    // @param another object where we use for comparisons
    // @return returns true if the objects are equal
    @Override
    public boolean equals(Object o) {
        // Checking the object references of this object and another object is the same.
        if (this == o)
            return true;

        // Checking the object is instanced of LibraryItem Class
        if (!(o instanceof LibraryItem<?> that))
            return false;

        // Checking the object states are equal
        return getId() == that.getId() && Objects.equals(getDescription(), that.getDescription());
    }


    // Overriding the Hashcode to avoid using the duplicates
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription());
    }
}