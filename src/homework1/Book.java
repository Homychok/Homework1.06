package homework1;
    class Author {
    public String fullAuthorName;

    public Author() {
    }
}
public class Book {
    private final String fullName;
    private final int numberOfPages;
    private int yearOfRelease;
    private String fullAuthorName;

    public Book(String fullAuthorName, String fullName, int numberOfPages, int yearOfRelease) {
        this.fullName = fullName;
        this.numberOfPages = numberOfPages;
        this.yearOfRelease = yearOfRelease;
        this.fullAuthorName = fullAuthorName;
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

    public String getFullAuthorName() {
        return fullAuthorName;
    }
}

