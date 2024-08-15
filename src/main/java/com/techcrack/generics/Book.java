package com.techcrack.generics;


/*
    * This Class is used to store the book fields.
    * It has four attributes
    * title -> title of the book
    * author -> author of the book
    * isbn -> ISBN of the book which is identity for a book.
    * publicationYear -> Book published Year.
    * POJO for accessing and updating it.
 */
public class Book extends LibraryItem<Book>{

    // It Stores the title of the book
    private String title;

    // It Stores the name of the author
    private String author;

    // It Stores the ISBN of the book.
    private String isbn;

    // It Stores the book publish year
    private String publicationYear;

    // It Stored the category of the book
    private String genre;

    // Parameterized Constructor to initialize its fields
    public Book(String title, String author, String isbn, String publicationYear, String genre, int id, String description) {
        super(id, description);
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.genre = genre;
    }

    // @return Retrieving the title of the book
    public String getTitle() {
        return title;
    }

    // @param updating the existing title with new title
    public void setTitle(String title) {
        this.title = title;
    }

    // @return retrieving the name of the author
    public String getAuthor() {
        return author;
    }

    // @param updating the name of the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // @return retrieving the name of the author
    public String getIsbn() {
        return isbn;
    }

    // @param Updating the isbn of the book
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // @return Retrieving the year of published
    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    // @return returning the category of the book
    public String getGenre() {
        return genre;
    }

    // @param updating the category of the book
    public void setGenre(String genre) {
        this.genre = genre;
    }


    // Overriding the toString method
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publicationYear='" + publicationYear + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
