package com.techcrack.generics;


/*
    * This Class is Responsible to store the magazine attributes.
    * It Has Total five attributes.
    * title of the magazine.
    * issue number of the magazine.
    * publication magazine published year.
    * publicationYear magazine published year.
 */
public class Magazine extends LibraryItem<Magazine> {

    // Title of the Magazine
    private String title;

    // Issue Number of the magazine
    private int issueNumber;

    // Publication month of the magazine
    private String publicationMonth;

    // Publication year of the magazine
    private String publicationYear;

    // Magazine editor name
    private String magazineEditorName;

    // Parameterized constructor to initialize all the fields.
    // @param id given for the magazine
    // @param description it provides the description about the magazine
    // @param Title of the magazine
    // @param issueNumber for thw magazine
    // @param publicationMonth month when the book was published.
    // @param publicationYear year when the book was published.
    // @param magazineEditorName name of the magazine editor
    public Magazine(int id, String description, String title, int issueNumber, String publicationMonth, String publicationYear, String magazineEditorName) {
        super(id, description);
        this.title = title;
        this.issueNumber = issueNumber;
        this.publicationMonth = publicationMonth;
        this.publicationYear = publicationYear;
        this.magazineEditorName = magazineEditorName;
    }

    // @return retrieving the title of the magazine
    public String getTitle() {
        return title;
    }

    // @param updating the title of the magazine.
    public void setTitle(String title) {
        this.title = title;
    }

    // @return retrieving the issueNumber of the magazine
    public int getIssueNumber() {
        return issueNumber;
    }

    // @param Updating the issue number of the magazine
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    // @return retrieving the month of the magazine were published
    public String getPublicationMonth() {
        return publicationMonth;
    }

    // @param updating the publication of year of the magazine
    public void setPublicationMonth(String publicationMonth) {
        this.publicationMonth = publicationMonth;
    }

    // @return Retrieving the magazine published year
    public String getPublicationYear() {
        return publicationYear;
    }

    // @param Updating the magazine published year
    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    // @return Retrieving the magazine editor name
    public String getMagazineEditorName() {
        return magazineEditorName;
    }

    // @param updating the magazine editor name
    public void setMagazineEditorName(String magazineEditorName) {
        this.magazineEditorName = magazineEditorName;
    }

    // Overriding the magazine
    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                ", issueNumber=" + issueNumber +
                ", publicationMonth='" + publicationMonth + '\'' +
                ", publicationYear='" + publicationYear + '\'' +
                ", magazineEditorName='" + magazineEditorName + '\'' +
                '}';
    }
}
