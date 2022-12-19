package homework1;

public class Book {
    private String fullName;
    private int numberOfPages;
    private int yearOfRelease;
Author author = new Author();
public Book(String authorName, String fullName, int numberOfPages, int yearOfRelease) {
        this.fullName = fullName;
        this.numberOfPages = numberOfPages;
        this.yearOfRelease = yearOfRelease;
    }

    public String getFullName() {
        return fullName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getAuthorName() {
        return author.getAuthorName();
    }
}

